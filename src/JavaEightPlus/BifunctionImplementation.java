package JavaEightPlus;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BifunctionImplementation {
    BiFunction<String, String, String> fullName = (firstName, lastname) -> firstName + " " + lastname;

}
