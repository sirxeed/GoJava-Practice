class AddBinary {
    String add(String a, String b) {
        //  101
        //  100
        // 1001
        StringBuilder result = new StringBuilder();  //result
        int i = 0;
        short remember = 0;
        int aL = a.length();
        int bL = b.length();

        while (i < a.length() || i < b.length()) {
            char aChar = (i < aL ? a.charAt(aL - 1 - i) : '0');
            char bChar = (i < bL ? b.charAt(bL - 1 - i) : '0');

            int sum = (aChar - '0') + (bChar - '0') + remember;
            remember = 0;
            if (sum == 0) {
                result.append('0');

            } else if (sum == 1) {
                result.append('1');

            } else if (sum == 2) {
                result.append('0');
                remember = 1;

            } else if (sum == 3) {
                result.append('1');
                remember = 1;
            }

            i++;

        }
        if (remember == 1) {
            result.append('1');
        }

        return result.reverse().toString();
    }
}