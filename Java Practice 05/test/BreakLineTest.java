import org.junit.Assert;
import org.junit.Test;

public class BreakLineTest {

    @Test
    public void testFormat1() throws Exception {
        BreakLine test = new BreakLine();
        Assert.assertEquals("Hello world\n" +
                        "world is insane.\n" +
                        "I have to\n" +
                        "practice!\n" +
                        "Practise,\n" +
                        "practise and\n" +
                        "practise! I\n" +
                        "have to try\n" +
                        "hard!!!",
                test.format("Hello world world is insane. I have to practice! Practise, practise and practise! I have to try hard!!!", 16));
    }

    @Test
    public void testFormat2() throws Exception {
        BreakLine test = new BreakLine();
        Assert.assertEquals("Miusov, as a man man of breeding and delicacy, could not but feel some inward\n" +
                        "qualms, when he reached the Father Superior's with Ivan: he felt ashamed of\n" +
                        "havin lost his temper. He felt that he ought to have disdaimed that despicable\n" +
                        "wretch, Fyodor Pavlovitch, too much to have been upset by him in Father\n" +
                        "Zossima's cell, and so to have forgotten himself. \"The monks were not to blame,\n" +
                        "in any case,\" he reflected, on the steps. \"And if they're decent people here\n" +
                        "(and the Father Superior, I understand, is a nobleman) why not be friendly and\n" +
                        "courteous with them? I won't argue, I'll fall in with everything, I'll win them\n" +
                        "by politeness, and show them that I've nothing to do with that Aesop, that\n" +
                        "buffoon, that Pierrot, and have merely been taken in over this affair, just as\n" +
                        "they have.\"",

                test.format("Miusov, as a man man of breeding and delicacy, could not but feel " +
                        "some inward qualms, when he reached the Father Superior's with Ivan: he felt " +
                        "ashamed of havin lost his temper. He felt that he ought to have disdaimed " +
                        "that despicable wretch, Fyodor Pavlovitch, too much to have been upset " +
                        "by him in Father Zossima's cell, and so to have forgotten himself. \"The monks " +
                        "were not to blame, in any case,\" he reflected, on the steps. \"And if they're " +
                        "decent people here (and the Father Superior, I understand, is a nobleman) why " +
                        "not be friendly and courteous with them? I won't argue, I'll fall in with " +
                        "everything, I'll win them by politeness, and show them that I've nothing to do " +
                        "with that Aesop, that buffoon, that Pierrot, and have merely been taken in " +
                        "over this affair, just as they have.\"", 80));
    }

    @Test
    public void testFormat3() throws Exception {
        BreakLine test = new BreakLine();
        Assert.assertEquals("abc\nab c\nw", test.format("abc ab c w", 5));
    }

    @Test
    public void testFormat4() throws Exception {
        BreakLine test = new BreakLine();
        Assert.assertEquals("aaaaaaaaaa\naaaaaaaaaa", test.format("aaaaaaaaaaaaaaaaaaaa", 10));
    }
}