import org.junit.Assert;
import org.junit.Test;

public class CSVParserTest {

    /*
    @Test
    public void testParse1() throws Exception {
        CSVParser test = new CSVParser();
        Assert.assertEquals("one", test.parse("one,two").get(0).get(0));
        Assert.assertEquals("two", test.parse("one,two").get(0).get(1));
    }

    @Test
     public void testParse2() throws Exception {
        CSVParser test = new CSVParser();
        Assert.assertEquals("one", test.parse("one,two\nthree,").get(0).get(0));
        Assert.assertEquals("two", test.parse("one,two\nthree,").get(0).get(1));
        Assert.assertEquals("three", test.parse("one,two\nthree,").get(1).get(0));
    }


    @Test
    public void testParse3() throws Exception {
        CSVParser test = new CSVParser();
        Assert.assertEquals("one", test.parse("one,\"tw\"o\"\nthree,").get(0).get(0));
        Assert.assertEquals("tw\"o", test.parse("one,\"tw\"o\"\nthree,").get(0).get(1));
        Assert.assertEquals("three", test.parse("one,\"tw\"o\"\nthree,").get(1).get(0));
    }

    @Test
    public void testParse4() throws Exception {
        CSVParser test = new CSVParser();
        Assert.assertEquals("one", test.parse("one,\"tw\"o\"\n\"thr,ee\",").get(0).get(0));
        Assert.assertEquals("tw\"o", test.parse("one,\"tw\"o\"\n\"thr,ee\",").get(0).get(1));
        Assert.assertEquals("thr,ee", test.parse("one,\"tw\"o\"\n\"thr,ee\",").get(1).get(0));
    }

    @Test
    public void testParse5() throws Exception {
        CSVParser test = new CSVParser();
        Assert.assertEquals("o\nne", test.parse("\"o\nne\",\"tw\"o\"\n\"thr,ee\",").get(0).get(0));
        Assert.assertEquals("tw\"o", test.parse("\"o\nne\",\"tw\"o\"\n\"thr,ee\",").get(0).get(1));
        Assert.assertEquals("thr,ee", test.parse("\"o\nne\",\"tw\"o\"\n\"thr,ee\",").get(1).get(0));
    }

    */
    @Test
    public void testParse6() throws Exception {
        CSVParser test = new CSVParser();
        Assert.assertEquals("o\nne", test.parse("\"o\nne\",\"tw\"o\"\n\"thr,ee\",\"fo\"\"ur\"").get(0).get(0));
        Assert.assertEquals("tw\"o", test.parse("\"o\nne\",\"tw\"o\"\n\"thr,ee\",\"fo\"\"ur\"").get(0).get(1));
        Assert.assertEquals("thr,ee", test.parse("\"o\nne\",\"tw\"o\"\n\"thr,ee\",\"fo\"\"ur\"").get(1).get(0));
        Assert.assertEquals("fo\"ur", test.parse("\"o\nne\",\"tw\"o\"\n\"thr,ee\",\"fo\"\"ur\"").get(1).get(1));
    }

}