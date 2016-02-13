public class FirstOddNumber {
    public int find(int[] input) {
        int index = -1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {
                index = i;
                break;
            }
        }
        return index;
    }
}