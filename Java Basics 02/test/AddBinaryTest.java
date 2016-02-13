import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test (timeout = 10)
    public void testAdd() throws Exception {
        AddBinary test = new AddBinary();
        Assert.assertEquals("101", test.add("001", "100"));
        Assert.assertEquals("101010000100", test.add("1010111", "101000101101"));
        Assert.assertEquals("0", test.add("0", "0"));
    }


}