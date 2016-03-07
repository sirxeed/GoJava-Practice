import org.junit.Assert;
import org.junit.Test;

public class AverageNumberTest {

    @Test
    public void testAverage() throws Exception {
        AverageNumber test = new AverageNumber();
        Assert.assertEquals(-3, test.average(-3, -3));
        Assert.assertEquals(-1073741825, test.average(-2147483648, -2));



    }
}