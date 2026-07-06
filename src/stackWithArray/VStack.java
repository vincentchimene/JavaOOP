package stackWithArray;

import java.util.EmptyStackException;

public class VStack {
    private int[] items = new int[3];
    private int currentSize;
    public boolean isEmpty() {
    return currentSize == 0;
    }

    public void push(int number) {
        if(currentSize == items.length)
            throw new StackOverflowError();

        items[currentSize] = number;
        currentSize++;
    }

    public int getCurrentSize(){
        return currentSize;
    }

    public int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        currentSize--;
        return items[currentSize];
    }

    public int peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return items[currentSize - 1];
    }
}
