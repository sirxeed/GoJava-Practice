public class LongestStabilityPeriod {
    public int count(int[] gdp) {
        if (gdp.length == 1) {
            return 1;
        }

        int period = 1;
        int longestPeriod = 1;

        //Let's find all periodes
        for (int i = 0; i < gdp.length - 1; i++) {
            period = 1;
            Comparator comparator = new Comparator();
            for (int j = i + 1; j < gdp.length; j++) {
                if (comparator.compare(gdp[i], gdp[j])) {
                    period++;
                } else {
                    if (longestPeriod < period) {
                        longestPeriod = period;
                    }
                    period = 1;
                    break;
                }
            }
        }

        return longestPeriod;
    }

    private class Comparator {
        private int sign = 0;

        public boolean compare(int a, int b) {
            if (Math.abs(a - b) <= 1 && sign == 0) {
                sign = b - a;
                return true;
            }
            if (Math.abs(a - b) <= 1 && sign == 1 && a <= b) {
                return true;
            }
            return Math.abs(a - b) <= 1 && sign == -1 && a >= b;
        }
    }
}