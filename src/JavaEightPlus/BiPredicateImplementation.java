package JavaEightPlus;

import java.util.function.BiPredicate;

public class BiPredicateImplementation {
    public static void main(String[] args) {
        BiPredicate<String, String> isJustEqual  = (firstString, secondString) -> firstString.equals(secondString);
        System.out.println(isJustEqual.test("boy", "girl"));
        System.out.println(isJustEqual.test("boy", "boy"));

    }
}
