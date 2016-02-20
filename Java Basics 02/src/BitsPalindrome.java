public class BitsPalindrome {
    public boolean isPalindrome(int input) {
        int temp = input;
        int output = 0;
        for (int i = 0; i < 32; i++) {
            output = output << 1;
            output |= temp & 1;
            temp = temp >> 1;
        }
        return input == output;
    }
}