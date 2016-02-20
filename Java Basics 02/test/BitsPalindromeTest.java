import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Андрій on 16.02.2016.
 */
public class BitsPalindromeTest {

    @Test
    public void testIsPalindrome() throws Exception {
        BitsPalindrome test = new BitsPalindrome();
        Assert.assertEquals(true, test.isPalindrome(-2147483647));
        Assert.assertEquals(false, test.isPalindrome(10));
    }
}