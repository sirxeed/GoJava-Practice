import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class DoublesTest {
    @Test
    public void checkNumbers() {
        Double test = new Doubles().parse("0675");
        assertThat(test, is(675.0));
    }

    @Test
    public void checkNegativeSignedNumbers() {
        Double test = new Doubles().parse("-156");
        assertThat(test, is(-156.0));
    }

    @Test
    public void checkPositiveSignedNumbers() {
        Double test = new Doubles().parse("+033");
        assertThat(test, is(33.0));
    }

    @Test
    public void checkDecimalPartNumbers() {
        Double test = new Doubles().parse("1.234");
        assertThat(test, is(1.234));
    }

    @Test
    public void checkDecimalOnlyPartNumbers() {
        Double test = new Doubles().parse(".123");
        assertThat(test, is(0.123));
    }

    @Test
    public void checkDotOnlyNumbers() {
        Double test = new Doubles().parse(".");
        assertNull(test);
    }

    @Test
    public void checkPositiveExponentialNumbers() {
        Double test = new Doubles().parse("6.7e2");
        assertThat(test, is(670.0));
    }

    @Test
    public void checkNegativeExponentialNumbers() {
        Double test = new Doubles().parse("6.7e-2");
        assertThat(test, is(6.7e-2));
    }

    @Test
    public void checkComplexNumbers() {
        Double test = new Doubles().parse("-.7e-2");
        assertThat(test, is(-0.007));
    }

}