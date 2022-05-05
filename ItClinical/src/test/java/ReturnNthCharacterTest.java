import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReturnNthCharacterTest {
    final String word = "ITCLiNicAl";
    final String numberWord = "ITCL1N1cAl";

    ReturnNthCharacter n;

    @Before
    public void setUp() {
        n = new ReturnNthCharacter();
    }

    @Test
    public void testReturnChoppedWord() {
        assertEquals(n.getNewWord(word, 1), "ITCLNA");
        assertEquals(n.getNewWord(word, 2), "TLN");
        assertEquals(n.getNewWord(word, 3), "CNA");
    }

    @Test
    public void testBigN() {
        assertEquals(n.getNewWord(word, 100), "");
    }

    @Test
    public void testNegativeN() {
        assertEquals(n.getNewWord(word, -1), "");
    }

    @Test
    public void testNumberWord() {
        assertEquals(n.getNewWord(numberWord, 1), "ITCL1N1A");
    }


}
