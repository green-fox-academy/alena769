import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    CountLetters letters = new CountLetters("map");



    @Test
    public void ifMapIsCountingCorrectly() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("m", 1);
        map.put("a", 1);
        map.put("p", 1);
        assertEquals(map, letters.letterOccurrence());
    }
}