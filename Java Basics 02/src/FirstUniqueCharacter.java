import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstUniqueCharacter {
    public char find(String s) {
        /*
        if (s.length() == 1) {
            return s.charAt(0);
        }

        int number;
        for (int i = 0; i < s.length() - 1; i++) {
            number = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    number++;
                }

            }
            if (number == 1) {
                return s.charAt(i);
            }

        }
        return 0;
        */

        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (repeating.contains(letter)) {
                continue;
            }
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            } else {
                nonRepeating.add(letter);
            }
        }
        return nonRepeating.get(0);
    }
}