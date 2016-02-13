import org.junit.Assert;
import org.junit.Test;

public class Basics {
    @Test
    public void testSumDigits() throws Exception {
        SumDigits test = new SumDigits();
        Assert.assertEquals(4, test.sum(22));
        Assert.assertEquals(4, test.sum(4));
        Assert.assertEquals(9, test.sum(-18));
    }

    @Test
    public void testFindMaxNumber() throws Exception {
        FindMaxNumber test = new FindMaxNumber();
        Assert.assertEquals(9, test.max(new int[]{5, 9, 0, 7, -1}));
    }

    @Test
    public void testFirstOddNumber() throws Exception {
        FirstOddNumber test = new FirstOddNumber();
        Assert.assertEquals(0, test.find(new int[]{5, 9, 0, 7, -1}));
        Assert.assertEquals(1, test.find(new int[]{4, 9, 0, 7, -1}));
        Assert.assertEquals(4, test.find(new int[]{4, 0, 2, 8, -1}));
    }

    @Test
    public void testAbcNumber() throws Exception {
        AbcNumber test = new AbcNumber();
        Assert.assertEquals(123, test.convert("bcd"));
        Assert.assertEquals(52311, test.convert("fcdbb"));
    }

    @Test(timeout = 0)
    public void testMatrixSnakeTraversal() throws Exception {
        MatrixSnakeTraversal test = new MatrixSnakeTraversal();
        Assert.assertArrayEquals(new int[]{1, 4, 7, 8, 5, 2, 3, 6, 9}, test.print(new int[][]
                {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}}));

        Assert.assertArrayEquals(new int[]{1, 4, 7, 8, 5, 2, 3, 6, 9, -5, 0, 6}, test.print(new int[][]
                {{1, 2, 3, 6},
                        {4, 5, 6, 0},
                        {7, 8, 9, -5}}));
    }

    @Test
    public void testJoinCharacters() throws Exception {
        JoinCharacters test = new JoinCharacters();
        Assert.assertEquals(123, test.join(new char[]{'1', '2', '3'}));
    }

    @Test
    public void testAlphabet() throws Exception {
        Alphabet test = new Alphabet();
        Assert.assertEquals(true, test.check("abcdeFghijklmnopqrstuvwxyz"));
        Assert.assertEquals(true, test.check("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testMatrixTraversal() throws Exception {
        MatrixTraversal test = new MatrixTraversal();

        //Square matrix
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10}, test.print(new int[][]
                {{1, 2, 3, 4},
                 {5, 6, 7, 8},
                 {9, 10, 11, 12},
                 {13, 14, 15, 16}}));

        //Single element matrix
        Assert.assertArrayEquals(new int[]{1}, test.print(new int[][]{{1}}));

        //Null matrix
        Assert.assertArrayEquals(new int[]{}, test.print(new int[][]{{}}));

        //Narrow matrix
        Assert.assertArrayEquals(new int[]{1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8}, test.print(new int[][]
                {{1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9},
                 {10, 11, 12}}));

        //Wide matrix
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7}, test.print(new int[][]
                {{1, 2, 3, 4},
                 {5, 6, 7, 8},
                 {9, 10, 11, 12}}));
    }
}