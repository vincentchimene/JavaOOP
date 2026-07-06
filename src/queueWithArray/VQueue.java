package queueWithArray;

import java.util.NoSuchElementException;

public class VQueue {

    private String[] words = new String[5];
    private int currentSize;
    private int front;

    public boolean add(String word) {
        words[front + currentSize] = word;
        currentSize++;
        return true;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public String element() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return words[front];
    }

    public String peek() {
        if(isEmpty()){
            return null;
        }
        return words[front];
    }

    public String remove() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        String removed = words[front];
        front++;
        currentSize--;
        return removed;
    }

    public String poll() {
        if(isEmpty()){
            return null;
        }
        String removed = words[front];
        front++;
        currentSize--;
        return removed;
    }

    public boolean offer(String word) {
        if(currentSize == words.length) {
            return false;
        }
        else if(word == ""){
            throw new NullPointerException();
        }
        words[front + currentSize] = word;
        currentSize++;
        return true;
    }
}
