import java.util.HashMap;
import java.util.Map;

public class ColorChain {
    Map<Integer, Integer> memory = new HashMap<>();

    {
        memory.put(-3, 0);
        memory.put(-2, 0);
        memory.put(-3, 0);
        memory.put(1, 1);
        memory.put(2, 2);
        memory.put(3, 4);
    }

    public int count(int N) {
        int amount = 0;
        int whiteFirst = 1;
        int yellowFirst = 2;
        int redFirst = 3;

        if (memory.containsKey(N)) {
            return memory.get(N);
        }

        switch (N) {
            case 0:
                amount = 0;
                break;
            case 1:
                amount = 1;
                break;
            case 2:
                amount = 2;
                break;
            case 3:
                amount = 4;
                break;
            default:
                amount = count(N - 1) + count(N - 2) + count(N - 3);
        }

        whiteFirst = count(N - 1);
        yellowFirst = count(N - 2);
        redFirst = count(N - 3);

        int result = whiteFirst + yellowFirst + redFirst;
        memory.put(N, amount);
        return amount;
    }
}