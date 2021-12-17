import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    // "  **" ---> "**", " **" ---> "**", "****" ---> "****", "**  " ---> "**  "
    @Test
    public void testChopOff2SpacesAtHead_Variant1() {
        String actual = StringUtils.chopOff2SpacesAtHead("  **");
        String expected = "**";
        assertEquals(expected, actual);
    }
    @Test
    public void testChopOff2SpacesAtHead_Variant2() {
        assertEquals("**", StringUtils.chopOff2SpacesAtHead(" **"));
    }
    @Test
    public void testChopOff2SpacesAtHead_Variant3() {
        assertEquals("****", StringUtils.chopOff2SpacesAtHead("****"));
    }
    @Test
    public void testChopOff2SpacesAtHead_Variant4() {
        assertEquals("**  ", StringUtils.chopOff2SpacesAtHead("**  "));
    }

    // "1234" --> false, "1212" ---> true, "12" --> true, "1" --> false
    @Test
    public void testAre2CharsAtHeadAndTailEqual_Variant1() {
        assertFalse(StringUtils.are2CharsAtHeadAndTailEqual("1234"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_Variant2() {
        assertTrue(StringUtils.are2CharsAtHeadAndTailEqual("1212"));
    }
}