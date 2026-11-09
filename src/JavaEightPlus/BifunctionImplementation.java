package JavaEightPlus;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BifunctionImplementation {
    static void main() {
        BiFunction<String, String, String> fullName = (firstName, lastname) -> firstName + " " + lastname;
        System.out.println(fullName.apply("Vincent", "Opurum"));
    }
}
