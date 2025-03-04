

import org.example.Mani;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTeste {

    @Test
    public void testJoiner() {
        String result = Mani.joinStrings("Hello", "world");
        assertEquals("Hello, world", result);
    }

    @Test
    public void testJoinerWithNull() {
        String result = Mani.joinStrings("Hello", null, "world");
        assertEquals("Hello, world", result);
    }
}