import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PhoneNumberValidatorTest {
    @Test
    public void testValidate(){
        String number = "07032460238";
        assertTrue(PhoneNumberValidator.isAValidPhoneNumber(number));
    }

    @Test
    public void testValidate2(){
        String number = "08062460238";
        assertTrue(PhoneNumberValidator.isAValidPhoneNumber(number));
    }

    @Test
    public void testValidate3(){
        String number = "+234 806 123 4567";
        assertTrue(PhoneNumberValidator.isAValidPhoneNumber(number));
    }

    @Test
    public void testValidate4(){
        String number = "+2348061234567";
        assertTrue(PhoneNumberValidator.isAValidPhoneNumber(number));
    }

    @Test
    public void testValidate5(){
        String number = "+234 0806 123 4567";
        assertTrue(PhoneNumberValidator.isAValidPhoneNumber(number));
    }

    @Test
    public void testValidate6(){
        String number = "+23408061234567";
        assertTrue(PhoneNumberValidator.isAValidPhoneNumber(number));
    }

    @Test
    public void testValidate7(){
        String number = "+234-806-123-4567";
        assertTrue(PhoneNumberValidator.isAValidPhoneNumber(number));
    }
}
