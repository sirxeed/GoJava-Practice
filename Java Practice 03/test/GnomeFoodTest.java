import org.junit.Assert;
import org.junit.Test;

public class GnomeFoodTest {

    @Test
    public void testFind() throws Exception {
        GnomeFood test = new GnomeFood();
        Assert.assertArrayEquals(new int[] {4, 2, 1, 0, 3}, test.find(new int[] {5, 7, 6, 9, 4}, new int[] {8, 5, 6, 2, 3}));
    }
}