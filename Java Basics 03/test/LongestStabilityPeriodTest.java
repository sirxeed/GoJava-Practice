import org.junit.Assert;
import org.junit.Test;

public class LongestStabilityPeriodTest {

    @Test
    public void testCount() throws Exception {
        LongestStabilityPeriod test = new LongestStabilityPeriod();
        Assert.assertEquals(2, test.count(new int[]{900, 901, 902}));
    }
}