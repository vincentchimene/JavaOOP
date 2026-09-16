import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSquaredSorted {
    private SquaredSorted squaredSort;

    @BeforeEach
    void setup() {
        squaredSort = new SquaredSorted();
    }
    @Test
    public void testThatMinus99IsWithinConstraint() {
        assertTrue(SquaredSorted.withinConstraint(-99));
    }

    @Test
    public void testThatMinus100IsNotWithinConstraint() {
        assertFalse(SquaredSorted.withinConstraint(-100));
    }

    @Test
    public void testThat1000IsWithinConstraint() {
        assertTrue(SquaredSorted.withinConstraint(1000));
    }

    @Test
    public void testThat1001IsNotWithinConstraint() {
        assertFalse(SquaredSorted.withinConstraint(1001));
    }

    @Test
    public void testTha0IsWithinConstraint() {
        assertTrue(SquaredSorted.withinConstraint(0));
    }

    @Test
    public void testThatMakeSquaredReturnsSquareOfElementsOfAnArray() {
        int[] array = {3,5,2,6};
        assertArrayEquals(new int[]{9, 25, 4, 36}, SquaredSorted.makeSquared(array));
    }

    @Test
    public void testThatMakeSquaredReturnsSquareOfElementsOfAnArrayWithNegativeElement() {
        int[] array = {-7,3,4,6};
        assertArrayEquals(new int[]{49, 9, 16, 36}, SquaredSorted.makeSquared(array));
    }

    @Test
    public void testThatMakeSquaredReturnsSquareOfElementsOfAnArrayWithAZero() {
        int[] array = {0,0,2,1};
        assertArrayEquals(new int[]{0, 0, 4, 1}, SquaredSorted.makeSquared(array));
    }

    @Test
    public void testThatSortedArrayReturnsArrayOfElementsSortedInAscendingOrder() {
        int[] array = {3,5,2,6};
        assertArrayEquals(new int[]{2,3,5,6}, SquaredSorted.sortedArray(array));
    }

    @Test
    public void testThatSolutionReturnsNullFor() {}

}
