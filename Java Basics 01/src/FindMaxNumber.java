public class FindMaxNumber {
    public int max(int[] input) {
        int maximum = input[0];
        for (int i = 1; i < input.length; i++) {
            if (maximum < input[i]) {
                maximum = input[i];
            }
        }
        return maximum;
    }
}