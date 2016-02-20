import org.junit.Assert;
import org.junit.Test;

public class ColorChainTest {

    @Test
    public void testCount() throws Exception {
        ColorChain test = new ColorChain();
        Assert.assertEquals(7, test.count(4));
        Assert.assertEquals(121415, test.count(20));
        Assert.assertEquals(1132436852, test.count(35));
    }
}