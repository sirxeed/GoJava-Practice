import org.junit.Assert;
import org.junit.Test;

public class LonelyNumberTest {

    @Test
    public void testFind() throws Exception {
        LonelyNumber test = new LonelyNumber();
        Assert.assertEquals(5, test.find(new int[] {1,1,1,1,1,8,8,8,8,8,5}));
    }
}