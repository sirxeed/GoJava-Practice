public class PositiveAverageNumber {
    public int average(int a, int b) {

        if (Integer.MIN_VALUE == a && Integer.MIN_VALUE == b) {
            return Integer.MIN_VALUE;
        }

        if (Integer.MAX_VALUE == a && Integer.MAX_VALUE == b) {
            return Integer.MAX_VALUE;
        }
        return (a + b) >>> 1;
    }
}