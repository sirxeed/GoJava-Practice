import java.util.Map;
import java.util.HashMap;

public class AddNumberBase36 {
    public String add(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aL = a.length();
        int bL = b.length();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            map.put((char)('0' + i), i);
        }
        for (int i = 0; i < 26; i++) {
            map.put((char)('a' + i), i + 10);
            map.put((char)('A' + i), i + 10);
        }

        int i = 0;
        byte remember = 0;
        while (i < a.length() || i < b.length()) {
            char aChar = (i < aL ? a.charAt(aL - 1 - i) : '0');
            char bChar = (i < bL ? b.charAt(bL - 1 - i) : '0');

            int sum = map.get(aChar) + map.get(bChar) + remember;

            if (sum < 36) {
                result.append(fromInt(sum));
                remember = 0;

            } else {
                sum -= 36;
                result.append(fromInt(sum));
                remember = 1;
            }
            i++;
        }

        if (remember == 1) {
            result.append(map.get('1'));
        }

        return result.reverse().toString();
    }

    private char fromInt(int num) {
        if (num < 10) {
            return (char)('0' + num);
        } else {
            return (char)('a' + num - 10);
        }

    }
}