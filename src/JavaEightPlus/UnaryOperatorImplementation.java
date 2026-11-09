package JavaEightPlus;

import java.util.function.UnaryOperator;

public class UnaryOperatorImplementation {
    public static void main(String[] args) {
        UnaryOperator<String> cleanText = text -> text.trim().toLowerCase();
        System.out.println(cleanText.apply("Hello ViNCent   "));
    }
}
