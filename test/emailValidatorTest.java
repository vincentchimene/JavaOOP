import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class emailValidatorTest {

    @Test
    public void testValidEmail1(){
        String email = "vincent";
        assertFalse(emailValidator.isValidEmail(email));
    }
    @Test
    public void testValidEmail(){
        String email = "v.opurum@native.semicolon.africa";
        assertTrue(emailValidator.isValidEmail(email));
    }

    @Test
    public void testValidEmail2(){
        String email = "vincentchimene@gmail.com";
        assertFalse(emailValidator.isValidEmail(email));
    }

    @Test
    public void testValidEmail3(){
        String email = "";
        assertFalse(emailValidator.isValidEmail(email));
    }
}
