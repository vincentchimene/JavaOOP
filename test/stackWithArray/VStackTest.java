package stackWithArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class VStackTest {

    private VStack stack;

    @BeforeEach
    void setUp(){
        stack = new VStack();
    }
    @Test
    public void testThatStackIsEmptyWhenItIsCreated(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThatStackIsNotEmptyAfterPush(){
        stack.push(2);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatStacksCurrentSizeIncreasesByOneAfterEachPush(){
        stack.push(3);
        assertEquals(1, stack.getCurrentSize());
        stack.push(5);
        assertEquals(2, stack.getCurrentSize());
    }

    @Test
    public void testThatPopReducesCurrentSizeBy1(){
        stack.push(4);
        stack.push(5);
        stack.pop();
        assertEquals(1, stack.getCurrentSize());
        stack.pop();
        assertEquals(0, stack.getCurrentSize()) ;
    }

    @Test
    public void testThatPopReturnsTheLastItemThatWasPushed(){
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.pop());
    }

    @Test
    public void testThatPeekReturnsTheTopItemAndDoNotRemoveIt() {
        stack.push(4);
        stack.push(5);
        assertEquals(5, stack.peek());
    }

    @Test
    public void testThatPopWhenStackIsEmptyThrowsAnException() {
        assertTrue(stack.isEmpty());
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    public void testThatPeekWhenStackIsEmptyThrowsAnException() {
        assertTrue(stack.isEmpty());
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }

    @Test
    public void testThatPushWhenStackIsFullThrowsAnException() {

        stack.push(4);
        stack.push(5);
        stack.push(9);
        assertThrows(StackOverflowError.class, () -> stack.push(6));

    }
}
