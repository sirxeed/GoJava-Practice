public class JoinCharacters {
    public int join(char[] input) {
        int joined = 0;
        for (int i = 0; i < input.length; i++) {
            joined += (input[i] - '0') * Math.pow(10, input.length - i - 1);
        }
        return joined;
    }
}