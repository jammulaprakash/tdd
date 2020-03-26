import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PresentInFirst2Test {
    PresentInFirst2 presentInFirst2;

    @BeforeEach
    public void setup() {
        presentInFirst2 = new PresentInFirst2();
    }

    @Test
    void onlyOneAin1stPosition() {
        assertEquals("BCD", presentInFirst2.removeAs("ABCD"));
    }

    @Test
    public void onlyOneAin2ndPosition() {
        assertEquals("BCD", presentInFirst2.removeAs("BACD"));
    }

    @Test
    public void twoAs() {
        assertEquals("CD", presentInFirst2.removeAs("AACD"));
        assertEquals("BAA", presentInFirst2.removeAs("AABAA"));
    }

    @Test
    public void emptyString() {
        assertEquals("", presentInFirst2.removeAs(""));
    }

    @Test
    public void noAsInFistTwoPositions() {
        assertEquals("BBAA", presentInFirst2.removeAs("BBAA"));
    }

    @Test
    public void lenght1AndA() {
        assertEquals("", presentInFirst2.removeAs("A"));
    }

    @Test
    public void lenght1AndNotA() {
        assertEquals("B", presentInFirst2.removeAs("B"));
    }

}