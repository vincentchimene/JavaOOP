package JavaEightPlus;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateImplementation {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (number) -> number % 2 == 0;
        System.out.println(isEven.test(4));


    }

}
