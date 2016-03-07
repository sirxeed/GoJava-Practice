import java.util.LinkedList;
import java.util.List;

public class BinaryHeap {
    //
    List<Integer> list = new LinkedList<>();

    public BinaryHeap(int size) {
        for (int i = size - 1; i >= 0; i--) {
            insert(i);
        }
    }

    public void insert(int val) {
        //arise
        list.add(val);
        if (list.size() > 1) {
            int index = list.size() - 1;
            while (true) {
                if (index / 2 - 1 > 0 && list.get(index) > list.get(index / 2 - 1)) {
                    swap(index, index / 2 - 1);
                } else {
                    break;
                }
            }
        }
        optimize();
    }

    public int poll() {
        int returningValue = list.remove(0);
        optimize();
        return returningValue;
    }

    private void swap(int a, int b) {
        int tempValue = list.get(a);
        list.set(a, list.get(b));
        list.set(b, tempValue);
    }

    public void optimize() {
        int top = 0;
        for (int i = 0; i <= list.size() - 1; i++) {
            int leftChild = top * 2 + 1;
            int rightChild = top * 2 + 2;
            if (leftChild <= list.size() - 1 && list.get(leftChild) > list.get(top)) {
                swap(top, leftChild);
            }
            if (rightChild <= list.size() - 1 && list.get(rightChild) > list.get(top)) {
                swap(top, rightChild);
            }
        }
    }
}