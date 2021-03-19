
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {
    @Test
    public void applesTest() {
        Apples apples = new Apples();
        assertEquals("apples",apples.getApple());
    }
}