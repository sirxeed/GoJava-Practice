public class FirstUniqueCharacter {
    public char find(String s) {

    }

    /*
    public char find(String s) {
        if (s.length() == 1) {
            return s.charAt(0);
        }

        boolean isNotRepeated;
        for (int i = 0; i < s.length(); i++) {
            isNotRepeated = true;
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    j++;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    isNotRepeated = false;
                    break;
                }

            }
            if (isNotRepeated) {
                return s.charAt(i);
            }
        }
        return 0;
    }
    */

    /*
        public Character find(String s) {
            Character target = null;

            if (s.length() < 2) {
                return s.charAt(0);
            }

            while (s != null && !s.equals("")) {
                char ch = s.charAt(0);
                String postSubString = s.substring(1, s.length());
                if (!postSubString.contains(String.valueOf(ch))) {
                    target = ch;
                    break;
                }
                s = s.replaceAll(String.valueOf(ch), "");
            }
            return target;
        */

}
