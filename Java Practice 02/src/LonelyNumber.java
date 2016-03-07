public class LonelyNumber {
    public int find(int[] input) {
        int number = 0;

        for (int i = 0; i <= 31; i++) {
            int sumTemp = 0;
            for (int j = 0; j < input.length; j++) {
                sumTemp += (input[j] & (1 << i)) >> i;
            }
            number |= (sumTemp % 5) << i;
        }

        return number;
    }
}