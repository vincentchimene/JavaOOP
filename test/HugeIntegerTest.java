import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {

        private  HugeInteger hugeInteger;

        @BeforeEach
        void setup() {
            hugeInteger = new HugeInteger();
        }
        @Test
        public void testParse() {
            hugeInteger.parse("23456");
            assertArrayEquals(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2, 3, 4, 5, 6}, hugeInteger.array);
        }

        @Test
        public void testToString() {
            hugeInteger.parse("23456");
            assertEquals("23456", hugeInteger.toString());
        }
}
