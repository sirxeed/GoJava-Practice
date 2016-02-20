import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterTest {

    @Test
    public void testFind() throws Exception {
        FirstUniqueCharacter test = new FirstUniqueCharacter();
        Assert.assertEquals('l', test.find("google"));

        StringBuilder sb = new StringBuilder("w");
        char ch = 'a';
        for (int i = 1; i < 1048554; i++) {
            sb.append(ch);
            ch++;
            if (ch == 'w') {
                ch++;
            }
            if (ch > 'z') {
                ch -= 26;
            }
        }
        System.out.println(sb);
        Assert.assertEquals('w', test.find(sb.toString()));
    }
}