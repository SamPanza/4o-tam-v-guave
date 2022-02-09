package panza.sam._4o_tam_v_guave;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import org.junit.jupiter.api.Test;

import static java.util.Collections.singletonMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayWithBiMapTests {
    private final BiMap<Integer, Integer> biMap = HashBiMap.create();

    @Test
    void oneEntry() {
        biMap.put(1, 2);
        assertEquals(singletonMap(2, 1), biMap.inverse());
    }

    @Test
    void putSameValueTwice() {
        biMap.put(1, 2);
        assertThrows(IllegalArgumentException.class, () -> biMap.put(2, 2));
    }
}
