import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class passwordValidatorTest {
    @Test
    public void testpasswordValidator(){
        String password = "qweriou_12";
        assertTrue(passwordValidator.isvalidPassword(password));
    }

    @Test
    public void testpasswordValidatorInvalidPassword(){
        String password = "vincenT";
        assertFalse(passwordValidator.isvalidPassword(password));
    }

    @Test
    public void testpasswordValidatorMultipleSpecialCharacters(){
        String password = "vincenT_$";
        assertFalse(passwordValidator.isvalidPassword(password));
    }
}
