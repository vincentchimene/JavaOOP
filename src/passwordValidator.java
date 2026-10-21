public class passwordValidator {
    public static boolean isvalidPassword(String password) {
        String regex = "^(?=[^ ]{8,16}$)(?=.*\\d)(?:\\p{Alnum}*[^\\p{Alnum} ]\\p{Alnum}*)$";
        return password.matches(regex);
    }
}
