import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {

    private HugeInteger hugeInteger;

    @BeforeEach
    void setup() {
        hugeInteger = new HugeInteger();
    }

    @Test
    public void testParse() {
        hugeInteger.parse("23456");
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 4, 5, 6}, hugeInteger.array);
    }

    @Test
    public void testToString() {
        hugeInteger.parse("23456");
        assertEquals("23456", hugeInteger.toString());
    }

    @Test
    public void testAdd() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();
        number1.parse("12345");
        number2.parse("6789");
        HugeInteger result = number1.add(number2);
        assertEquals("19134", result.toString());
    }

    @Test
    public void testAddDoesNotModifyFirstNumber() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();
        number1.parse("12345");
        number2.parse("6789");
        number1.add(number2);
        assertEquals("12345", number1.toString());
    }

    @Test
    public void testThatAddDoesNotChangeSecondNumber() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();
        number1.parse("12345");
        number2.parse("6789");
        number1.add(number2);
        assertEquals("6789", number2.toString());

    }

    @Test
    public void testAddWithCarry() {
        HugeInteger number1 = new HugeInteger();
        HugeInteger number2 = new HugeInteger();
        number1.parse("999");
        number2.parse("1");
        HugeInteger result = number1.add(number2);
        assertEquals("1000", result.toString());
    }

}
