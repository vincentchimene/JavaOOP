import java.math.BigInteger;
import java.text.NumberFormat;

public class HugeInteger {
    public int[] array;
    int textLength = 0;

    public HugeInteger(){
        this.array = new int[40];
    }

    public void parse(String text){
        for(int index = this.array.length - 1; index >= this.array.length - text.length(); index--){
            char character = text.charAt(index - this.array.length + text.length());
            int integerValue = character - '0';
            this.array[index] = integerValue;
            textLength++;


        }
    }

    public String toString() {
        String result = "";
        for(int index = this.array.length - 1; index >= this.array.length - textLength; index--){
            result = this.array[index] + result;
        }
        return result;
    }

    public HugeInteger add (HugeInteger number1, HugeInteger number2){
        HugeInteger result = new HugeInteger();
        for(int index = this.array.length - 1; index >= this.array.length - textLength; index--){
            int sum = number1.array[index] + number2.array[index];
            if(sum < 10){
                result.array[index] = number1.array[index] + number2.array[index];
            }
            else{
                result.array[index] = sum % 10;
            }

        }
    }


}
