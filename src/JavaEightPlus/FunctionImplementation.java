package JavaEightPlus;

import java.util.function.Function;

public class FunctionImplementation {
    static void main() {
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Hello"));
    }
}
