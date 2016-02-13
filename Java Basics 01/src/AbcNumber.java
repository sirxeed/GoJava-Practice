public class AbcNumber {
    public int convert(String num) {

        int number = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - 'a';
            number = number * 10 + digit;
        }
        return number;
    }
}