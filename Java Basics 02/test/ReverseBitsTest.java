import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest {

    @Test
    public void testReverseBits() throws Exception {
        ReverseBits test = new ReverseBits();
        Assert.assertEquals(1073741824, test.reverse(2));
        Assert.assertEquals(-2147483648, test.reverse(1));
        Assert.assertEquals(-2147483647, test.reverse(-2147483647));
    }
}