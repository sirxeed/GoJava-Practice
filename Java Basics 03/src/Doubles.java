public class Doubles {

    public Double parse(String s) {
        //Validation
        boolean numbersCheck = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                numbersCheck = true;
                break;
            }
            if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                break;
            }
        }
        if (!numbersCheck) {
            return null;
        }

        //Parsing
        StateMachine stateMachine = new StateMachine();
        for (int i = 0; i < s.length(); i++) {
            stateMachine.next(s.charAt(i));
        }

        return stateMachine.getResult();
    }

    public static class ParseData {
        private double number = 0;
        private boolean decimal = false;
        private boolean isPositive = true;
        private int decimalPow = 1;
        private boolean isExponential = false;
        private double exponentialBase;

        public void setIsExponentialPositive(boolean isExponentialPositive) {
            this.isExponentialPositive = isExponentialPositive;
        }

        private boolean isExponentialPositive = true;

        public void setIsExponential() {
            isExponential = true;
            if (isPositive) {
                exponentialBase = number;
            } else {
                exponentialBase = -number;
                isPositive = true;
            }
            number = 0;
            decimal = false;
        }

        public void setDecimal(boolean decimal) {
            this.decimal = decimal;
        }

        public void setIsPositive(boolean isPositive) {
            this.isPositive = isPositive;
        }

        public int getIsPositive() {
            if (isPositive) {
                return 1;
            } else {
                return -1;
            }
        }

        private double getNumber() {
            return number;
        }

        public void addDigit(int digit) {
            if (decimal) {
                double pow = Math.pow(10, decimalPow);
                number *= pow;
                number += (double) digit;
                number /= pow;
                decimalPow++;
            } else {
                number = number * 10 + digit;
            }
        }
    }

    private static class StateMachine {
        State currentState = State.INIT;
        ParseData parseData = new ParseData();

        public void next(char c) {
            currentState = currentState.next(c, parseData);
        }

        public Double getResult() {
            if (currentState == State.NUMBER) {
                if (parseData.isExponential) {
                    return parseData.exponentialBase * Math.pow(10, parseData.getNumber() * parseData.getIsPositive());
                } else {
                    return parseData.getNumber() * parseData.getIsPositive();
                }
            }
            return null;
        }

        public enum State {
            INIT {
                @Override
                public State next(char c, ParseData parseData) {
                    if (c - '0' >= 0 && c - '0' <= 9) {
                        parseData.addDigit(c - '0');
                        return NUMBER;
                    }
                    if (c == '-') {
                        parseData.setIsPositive(false);
                        return NUMBER;
                    }
                    if (c == '+') {
                        return NUMBER;
                    }
                    if (c == '.') {
                        parseData.setDecimal(true);
                        return NUMBER;
                    }
                    if (c == ' ') {
                        return INIT;
                    }
                    return INVALID_END;
                }
            }, NUMBER {
                @Override
                public State next(char c, ParseData parseData) {
                    if (c - '0' >= 0 && c - '0' <= 9) {
                        parseData.addDigit(c - '0');
                        return NUMBER;
                    }
                    if (c == '.') {
                        parseData.setDecimal(true);
                        return NUMBER;
                    }
                    if (c == 'e' || c == 'E') {
                        parseData.setIsExponential();
                        return INIT;
                    }
                    return INVALID_END;
                }
            }, VALID_END {
                @Override
                public State next(char c, ParseData parseData) {
                    if (c == ' ')
                        return VALID_END;
                    return INVALID_END;
                }
            }, INVALID_END {
                @Override
                public State next(char c, ParseData parseData) {
                    return null;
                }
            };

            public abstract State next(char c, ParseData parseData);
        }
    }
}