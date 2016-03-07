import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RectangleSquareTest {

    @Test
     public void testMeasure1() throws Exception {
        RectangleSquare test = new RectangleSquare();
        assertEquals(300, test.measure(new int[]{0, 0}, new int[]{20, 10}, new int[]{10, 20}));
    }

    @Test
    public void testMeasure2() throws Exception {
        RectangleSquare test = new RectangleSquare();
        assertEquals(200, test.measure(new int[]{0, 10}, new int[]{10, 10}, new int[]{10, 10}));
    }

    @Test
    public void testMeasure3() throws Exception {
        RectangleSquare test = new RectangleSquare();
        assertEquals(900, test.measure(new int[]{0, 10, 30}, new int[]{20, 10, 20}, new int[]{20, 30, 20}));
    }

    @Test
    public void testMeasure4() throws Exception {
        RectangleSquare test = new RectangleSquare();
        assertEquals(9000000, test.measure(new int[]{0, 1000, 3000}, new int[]{2000, 1000, 2000}, new int[]{2000, 3000, 2000}));
    }
}