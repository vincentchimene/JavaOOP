import java.math.BigInteger;
import java.text.NumberFormat;

public class HugeInteger {
    public int[] array;
    int textLength = 0;

    public HugeInteger(){
        this.array = new int[40];
    }

    public void parse(String text){
        if(text.length() > 40){
            throw new IllegalArgumentException();
        }
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

    public HugeInteger add (HugeInteger number2){
        HugeInteger result = new HugeInteger();
        int carry = 0;
        int count = 0;
        for(int index = this.array.length - 1; index >= 0; index--){

            int sum = this.array[index] + number2.array[index] + carry;
            result.array[index] = sum % 10;
            carry = sum / 10;
            count++;
        }
        result.textLength = Math.max(this.textLength, number2.textLength);

        if (carry > 0) {
            result.array[this.array.length - result.textLength - 1] = carry;
            result.textLength++;
        }
        return result;
    }


}
