/*
Для даного числа поміняти всі біти місцями відносно центра.
Наприклад:
Для 2 (10) повернути 1073741824 (01000000000000000000000000000000).
 */

public class ReverseBits {
    public int reverse(int input) {
        int result = 0;

        for (int i = 0; i <= 31; i++) {
            result |= (input & 1);
            input >>>= 1;
            if (i != 31) {
                result <<= 1;
            }
        }

        return result;
    }
}
