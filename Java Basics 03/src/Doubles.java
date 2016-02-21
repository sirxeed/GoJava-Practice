public class Doubles {

    public Double parse(String s) {
        StateMachine stateMachine = new StateMachine();
        for (int i = 0; i < s.length(); i++) {
            stateMachine.next(s.charAt(i));
        }

        return stateMachine.getResult();
    }

    public static class ParseData {
        private int number = 0;

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

        private boolean isPositive = true;

        private int getNumber() {
            return number;
        }

        public void addDigit(int digit) {
            number = number * 10 + digit;
        }
    }

    private static class StateMachine {
        State currentState = State.INIT;
        ParseData parseData = new ParseData();

        public void next(char c) {
            currentState = currentState.next(c, parseData);
        }

        public Double getResult() {
            if (currentState == currentState.NUMBER) {
                return new Double(parseData.getNumber() * parseData.getIsPositive());
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
                    return INVALID_END;
                }
            }, NUMBER {
                @Override
                public State next(char c, ParseData parseData) {
                    if (c - '0' >= 0 && c - '0' <= 9) {
                        parseData.addDigit(c - '0');
                        return NUMBER;
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