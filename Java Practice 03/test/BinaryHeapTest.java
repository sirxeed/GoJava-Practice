import org.junit.Assert;
import org.junit.Test;

public class BinaryHeapTest {

    /*
    @Test
    public void testInsert1() throws Exception {
        BinaryHeap test = new BinaryHeap(50);
        test.insert(20);
        test.insert(11);
        test.insert(15);
        test.insert(6);
        test.insert(9);
        test.insert(7);
        test.insert(8);
        test.insert(1);
        test.insert(3);
        test.insert(5);

        test.insert(17);

        test.list.add(0, 3);
        test.optimize();
    }
    */

    @Test
    public void testInsert2() throws Exception {
        BinaryHeap test = new BinaryHeap(2);
        Assert.assertEquals(1, test.poll());
        Assert.assertEquals(0, test.poll());
    }
}