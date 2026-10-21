public class PhoneNumberValidator {
    public static boolean isAValidPhoneNumber(String phoneNumber) {
        String regex = "(\\+?234-?|0?)\\s?0?[789][01]\\d(\\s?|-?)\\d{3}(\\s?|-?)\\d{4}";//0703 246 0238" +234 806 123 4567;
        return phoneNumber.matches(regex);
    }
}