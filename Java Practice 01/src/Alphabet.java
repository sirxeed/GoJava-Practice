import java.util.*;

public class Alphabet {
    public boolean check(String input) {

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }

        for (char chars = 'A'; chars <= 'Z'; chars++) {
            if (!set.contains((char) chars) && !set.contains((char)(chars + 0x20))) {
                return false;
            }
        }
        
      /*
      for (char chars = 'A'; chars <= 'Z'; chars++) {
        if (!set.contains(chars));
        return false;
      }
      */
        return true;
    }
}