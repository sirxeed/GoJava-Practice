import org.junit.Assert;
import org.junit.Test;

public class ReversePolishNotationTest {

    @Test
    public void testEvaluate() throws Exception {
        ReversePolishNotation test = new ReversePolishNotation();
        Assert.assertEquals(6, test.evaluate("4 2 +"));
        Assert.assertEquals(66, test.evaluate("4 2 + 5 6 + *"));
        Assert.assertEquals(3, test.evaluate("3"));
        Assert.assertEquals(7, test.evaluate("1 3 2 * +"));
        Assert.assertEquals(15, test.evaluate("17 2 -"));

    }
}