package queueWithArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class VQueueTest {
    private VQueue queue;

    @BeforeEach
    public void setUp(){
        queue = new VQueue();
    }

    @Test
    public void testThatQueueIsEmptyAtStart(){
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatQueueIsNotEmptyAfterAdd(){
        queue.add("Blue");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testThatCurrentSizeIncreasesByOneAfterEachAdd(){
        queue.add("Black");
        assertEquals(1, queue.getCurrentSize());
        queue.add("Brown");
        assertEquals(2, queue.getCurrentSize());
    }

    @Test
    public void testThatElementReturnsTheHeadOfTheQueue() {
        queue.add("White");
        assertEquals("White", queue.element());
    }

    @Test
    public void testThatElementThrowsExceptionWhenQueueIsEmpty() {
        assertTrue(queue.isEmpty());
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }

    @Test
    public void testThatPeekReturnsTheHeadOfTheQueue(){
        queue.add("Red");
        assertEquals("Red", queue.peek());
    }

    @Test
    public void testThatPeekReturnsNullWhenQueueIsEmpty(){
        assertNull(queue.peek());
    }

    @Test
    public void testThatPeekDoesNotRemoveTheHeadOfTheQueue(){
        queue.add("Orange");
        queue.add("Pink");
        assertEquals(2, queue.getCurrentSize());
        assertEquals("Orange", queue.peek());
        assertEquals(2, queue.getCurrentSize());
    }

    @Test
    public void testThatRemoveReturnsTheHeadOfTheQueue(){
        queue.add("Orange");
        queue.add("Pink");
        assertEquals("Orange", queue.remove());
    }

    @Test
    public void testThatRemove_RemovesTheHeadOfTheQueue(){
        queue.add("Orange");
        queue.add("Pink");
        assertEquals("Orange", queue.peek());
        assertEquals(2, queue.getCurrentSize());
        queue.remove();
        assertEquals("Pink", queue.peek());
        assertEquals(1, queue.getCurrentSize());

    }

    @Test
    public void testThatRemoveThrowsNoSuchElementExceptionIfQueueIsEmpty(){
        assertTrue(queue.isEmpty());
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    public void testThatPollReturnsHeadOfTheQueue(){
        queue.add("Orange");
        queue.add("Pink");
        assertEquals("Orange", queue.poll());
    }

    @Test
    public void testThatPoll_RemovesTheHeadOfTheQueue(){
        queue.add("Orange");
        queue.add("Pink");
        assertEquals("Orange", queue.peek());
        assertEquals(2, queue.getCurrentSize());
        queue.poll();
        assertEquals("Pink", queue.peek());
        assertEquals(1, queue.getCurrentSize());

    }

    @Test
    public void testThatPollReturnsNullIfQueueIsEmpty(){
        assertTrue(queue.isEmpty());
        assertEquals(null, queue.poll());
    }

    @Test
    public void testThatQueueIsNotEmptyAfterOffer(){
        queue.offer("Blue");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testThatCurrentSizeIncreasesByOneAfterEachOffer(){
        queue.offer("Black");
        assertEquals(1, queue.getCurrentSize());
        queue.offer("Brown");
        assertEquals(2, queue.getCurrentSize());
    }

    @Test
    public void testThatOfferReturnsTrueAfterSuccessfullOffer(){
        assertTrue(queue.offer("Black"));
        assertEquals(1, queue.getCurrentSize());
    }

    @Test
    public void testThatOfferReturnsFalseAfterUncessfulOffer(){
        queue.offer("Blue");
        queue.offer("Black");
        queue.offer("Brown");
        queue.offer("Purple");
        queue.offer("Yellow");
        assertEquals(5, queue.getCurrentSize());
        assertFalse(queue.offer("Pink"));
    }

    @Test
    public void testThatOfferThrowsNullPointerExceptionIfTheSpecifiedElementIsNull(){
        assertThrows(NullPointerException.class, () -> queue.offer(""));
    }

}
