public class BreakLine {
    public String format(String input, int width) {
        StringBuffer result = new StringBuffer();
        int counter = 0;
        int wordLength;
        for (int i = 0; i < input.length(); i++) {
            wordLength = worldLength(input, width, counter, i);
            if (wordLength <= width) {
                if (wordLength + counter < width) {
                    result.append(input.charAt(i));
                    counter++;
                } else {
                    if (input.charAt(i) != ' ') {
                        i--;
                        result.deleteCharAt(result.length() - 1);
                    }
                    result.append("\n");
                    counter = 0;
                }
            } else {
                int currentLength = 0;
                for (int j = 1; j <= wordLength; j++) {
                    result.append(input.charAt(i));
                    currentLength++;
                    i++;
                    if (currentLength == width) {
                        result.append("\n");
                        result.append(input.charAt(i));
                        currentLength = 0;
                    }
                }
            }
        }
        return result.toString();
    }

    private int worldLength(String input, int width, int counter, int i) {
        int length = 0;
        while (input.charAt(i) != ' ' && input.charAt(i) != '.' && input.charAt(i) != ',' && input.charAt(i) != '!' && input.charAt(i) != '?' && i < input.length() - 1) {
            length++;
            i++;
        }
        return length;
    }
}