public class LonelyNumber {
    public int find(int[] input) {
        /*
        int[] sum = new int[32];
        for (int i = 0; i < input.length; i++) {
            int number = input[i];
            for (int j = 0; j < 32; j++) {
                int mask = 1 << j;
                if ((number & mask) != 0) {
                    sum[j]++;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += sum[31 - i] % 5;
        }
        return result;
        */

        int number = 0;

        for (int i = 31; i > 0; i--) {
            int sumTemp = 0;
            for (int j = 0; j < input.length; j++) {
                sumTemp += (((input[j] >> (31 - i)) & 1));
            }
            number |= (sumTemp % 5) ;
            number <<= 1;

        }

        return number;
    }


}