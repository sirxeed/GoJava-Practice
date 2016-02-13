import org.junit.Assert;
import org.junit.Test;
public class AddNumberBase36Test {

    @Test //(timeout = 10)
    public void testAddBase36() throws Exception {
        AddNumberBase36 test = new AddNumberBase36();
        Assert.assertEquals("5", test.add("5", "0"));
        Assert.assertEquals("a", test.add("9", "1"));
        Assert.assertEquals("10", test.add("z", "1"));
    }
}