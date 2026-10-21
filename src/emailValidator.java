public class emailValidator {
    public static boolean isValidEmail(String email){
        String regex = "[a-z]\\.[a-z]+@native\\.semicolon\\.africa";
        return email.matches(regex);
    }
}
