import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class DoublesTest {
    @Test
    public void checkNumbers() {
        Double test = new Doubles().parse("0675");
        Assert.assertThat(test, Matchers.is(675.0));
    }

    @Test
    public void checkNegativeSignedNumbers() {
        Double test = new Doubles().parse("-156");
        Assert.assertThat(test, Matchers.is(-156.0));
    }

    @Test
    public void checkPositiveSignedNumbers() {
        Double test = new Doubles().parse("+033");
        Assert.assertThat(test, Matchers.is(33.0));
    }

    @Test
    public void checkDecimalPartNumbers() {
        Double test = new Doubles().parse("1.234");
        Assert.assertThat(test, Matchers.is(1.234));
    }

    @Test
    public void checkDecimalOnlyPartNumbers() {
        Double test = new Doubles().parse(".123");
        Assert.assertThat(test, Matchers.is(0.123));
    }

    @Test
    public void checkPositiveExponentialNumbers() {
        Double test = new Doubles().parse("6.7e2");
        Assert.assertThat(test, Matchers.is(670.0));
    }

    @Test
    public void checkNegativeExponentialNumbers() {
        Double test = new Doubles().parse("6.7e-2");
        Assert.assertThat(test, Matchers.is(6.7e-2));
    }

    @Test
    public void checkComplexNumbers() {
        Double test = new Doubles().parse("-.7e-2");
        Assert.assertThat(test, Matchers.is(-0.007));
    }

    @Test
    public void checkInvalidInput() {
        Double test = new Doubles().parse("-.");
        Assert.assertNull(test);
    }

    @Test
    public void checkDotOnly() {
        Double test = new Doubles().parse(".");
        Assert.assertNull(test);
    }

    @Test
    public void checkExponentialOnly() {
        Double test = new Doubles().parse(".e10");
        Assert.assertNull(test);
    }

}