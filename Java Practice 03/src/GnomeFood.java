import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class GnomeFood {
    public int[] find(int[] gnomes, int[] portions) {
        int[] result = new int[gnomes.length];
        Map<Integer, Integer> gnomesMap = new TreeMap<>();
        Map<Integer, Integer> portionsMap = new TreeMap<>();

        for (int i = 0; i < portions.length; i++) {
            gnomesMap.put(gnomes[i], i);
            portionsMap.put(portions[i], i);
        }

        Iterator iteratorGnomes = gnomesMap.values().iterator();
        Iterator iteratorPortions = portionsMap.values().iterator();

        while (iteratorGnomes.hasNext()) {
            result[(int) iteratorGnomes.next()] = (int) iteratorPortions.next();
        }
        return result;
    }
}