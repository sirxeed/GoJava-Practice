import java.util.Deque;
import java.util.LinkedList;

/*
/home/../var/./lib//file.txt
        /var/lib/file.txt"
 */

public class UnixPath {
    public String simplify(String input) {

        Deque<String> path = new LinkedList<>();
        char letter;
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '/') {
                if (word.toString().equals("..")) {
                    if (!path.isEmpty()) {
                        path.removeFirst();
                    }
                    word = new StringBuilder();
                } else if (word.toString().length() > 0) {
                    if (!word.toString().equals(".") && !word.toString().equals("/")) {
                        path.push(word.toString());
                    }
                    word = new StringBuilder();
                }
            } else {
                word.append(input.charAt(i));
            }
            if (i == input.length() - 1 && !word.toString().equals(".") && input.charAt(i)!='/' && !word.toString().equals("..")) {
                path.push(word.toString());
            }
        }

        StringBuilder simplePath = new StringBuilder();
        if (path.isEmpty()) {
            return "/";
        }
        while (!path.isEmpty()) {
            simplePath.append("/");
            simplePath.append(path.removeLast());
        }
        return simplePath.toString();
    }
}