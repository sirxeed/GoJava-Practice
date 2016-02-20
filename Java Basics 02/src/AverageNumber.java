public class AverageNumber {
    public int average(int a, int b) {

        if (Integer.MIN_VALUE == a && Integer.MIN_VALUE == b) {
            return Integer.MIN_VALUE;
        }

        if (Integer.MAX_VALUE == a && Integer.MAX_VALUE == b) {
            return Integer.MAX_VALUE;
        }

        if (a < 0 && b < 0) {
            if (a % 2 == -1 && b % 2 == -1) {
                return a / 2 + b / 2 - 1;
            } else {
                return a / 2 + b / 2;
            }
        }
        return (a + b) >>> 1;
    }
}

