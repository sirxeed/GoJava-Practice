import org.junit.Assert;
import org.junit.Test;
public class WordNumberTest {

    @Test
    public void testCount1() throws Exception {
        WordNumber test = new WordNumber();
        Assert.assertEquals(4, test.count("Hello one more time"));
    }

    @Test
    public void testCount2() throws Exception {
        WordNumber test = new WordNumber();
        Assert.assertEquals(5, test.count("I am making a program!"));
    }

    @Test
    public void testCount3() throws Exception {
        WordNumber test = new WordNumber();
        Assert.assertEquals(6, test.count("\"Hello world\" is my first program."));
    }

    @Test
    public void testCount4() throws Exception {
        WordNumber test = new WordNumber();
        Assert.assertEquals(4, test.count("Too    much    spaces here      "));
    }

    @Test
    public void testCount5() throws Exception {
        WordNumber test = new WordNumber();
        Assert.assertEquals(3, test.count("red/green/blue"));
    }

    @Test
    public void testCount6() throws Exception {
        WordNumber test = new WordNumber();
        Assert.assertEquals(1, test.count("hello. ..."));
    }

}