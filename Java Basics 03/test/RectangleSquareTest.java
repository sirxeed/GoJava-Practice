import junit.framework.Assert;
import org.junit.Test;

public class RectangleSquareTest {

    @Test
     public void testMeasure1() throws Exception {
        RectangleSquare test = new RectangleSquare();
        Assert.assertEquals(300, test.measure(new int[] {0, 0}, new int[] {20, 10}, new int[] {10, 20}));
    }

    @Test
    public void testMeasure2() throws Exception {
        RectangleSquare test = new RectangleSquare();
        Assert.assertEquals(200, test.measure(new int[] {0, 10}, new int[] {10, 10}, new int[] {10, 10}));
    }

    @Test
    public void testMeasure3() throws Exception {
        RectangleSquare test = new RectangleSquare();
        Assert.assertEquals(900, test.measure(new int[] {0, 10, 30}, new int[] {20, 10, 20}, new int[] {20, 30, 20}));
    }
}