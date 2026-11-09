package JavaEightPlus;

import java.util.function.BinaryOperator;

public class BinaryOperatorImplementation {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a, b) -> a * b;
        System.out.println(multiply.apply(4, 5));

    }
}
