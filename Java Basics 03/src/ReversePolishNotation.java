import java.util.Deque;
import java.util.LinkedList;

public class ReversePolishNotation {
    public int evaluate(String expression) {
        Deque<Integer> operands = new LinkedList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (symbol == '+') {
                int tempValue = operands.removeFirst();
                tempValue += operands.removeFirst();
                operands.push(tempValue);
                i++;
            } else if (symbol == '-') {
                int tempValue = operands.removeFirst();
                tempValue = operands.removeFirst() - tempValue;
                operands.push(tempValue);
                i++;
            } else if (symbol == '*') {
                int tempValue = operands.removeFirst();
                tempValue *= operands.removeFirst();
                operands.push(tempValue);
                i++;
            } else if (symbol == '/') {
                int tempValue = operands.removeFirst();
                tempValue = operands.removeFirst() / tempValue;
                operands.push(tempValue);
                i++;
            } else if (symbol == ' ') {
                operands.push(Integer.parseInt(temp.toString()));
                temp = new StringBuilder();
            } else {
                temp.append(symbol);
                if (i == expression.length() - 1) {
                    operands.push(Integer.parseInt(temp.toString()));
                }
            }
        }
        return operands.removeFirst();
    }
}