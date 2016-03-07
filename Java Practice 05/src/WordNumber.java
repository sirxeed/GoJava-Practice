public class WordNumber {
    public int count(String input) {
        int amount = 0;
        boolean word = false;
        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') || (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')) {
                if (!word) {
                    amount++;
                }
                word = true;
            } else if (word) {
                word = false;
            }
        }
        return amount;
    }
}