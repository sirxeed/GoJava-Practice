import org.junit.Assert;

/**
 * Created by Андрій on 20.02.2016.
 */
public class UnixPathTest {

    @org.junit.Test
    public void testSimplify() throws Exception {
        UnixPath test = new UnixPath();
        //Assert.assertEquals("/var/lib/file.txt", test.simplify("/home/../var/./lib//file.txt"));
        //Assert.assertEquals("/", test.simplify("/."));
        Assert.assertEquals("/var/lib", test.simplify("/var//lib/"));
    }
}