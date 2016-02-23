import org.junit.Assert;
import org.junit.Test;

public class LongestStabilityPeriodTest {

    @Test
    public void testCount1() throws Exception {
        LongestStabilityPeriod test = new LongestStabilityPeriod();
        //Assert.assertEquals(2, test.count(new int[]{900, 901, 902}));
    }

    @Test
    public void testCount2() throws Exception {
        LongestStabilityPeriod test = new LongestStabilityPeriod();
        //Assert.assertEquals(4, test.count(new int[]{900, 900, 900, 901, 902, 902, 903, 903}));
    }

    @Test
    public void testCount3() throws Exception {
        LongestStabilityPeriod test = new LongestStabilityPeriod();
        Assert.assertEquals(6, test.count(new int[]{901, 901, 901, 902, 902, 903, 903, 902, 902, 901}));
    }
}