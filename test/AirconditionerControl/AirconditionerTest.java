package AirconditionerControl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionerTest {
    Airconditioner myAirconditioner;

    @BeforeEach
    public void setUp(){
        myAirconditioner = new Airconditioner();
    }

    @Test
    public void testThatmyAirconditionerTurnsOnWhenITurnItOn(){
        myAirconditioner.switchOn();
        assertTrue(myAirconditioner.isSwitchedOn());
    }

    @Test
    public void testThatmyAirconditionerTurnsOffWhenITurnItOff(){
        myAirconditioner.switchOff();
        assertFalse(myAirconditioner.isSwitchedOn());
    }

    @Test
    public void testThatWhenSwitchedOnTemperatureStartsAt16() {
        myAirconditioner.switchOn();
        assertEquals(16, myAirconditioner.getTemperature());
    }

    @Test
    public void testThatWhenIIncreaseTemperatureByStepItIncreasesByStep(){
        myAirconditioner.switchOn();
        assertEquals(16, myAirconditioner.getTemperature());
        myAirconditioner.increaseTemperature(4);
        assertEquals(20, myAirconditioner.getTemperature());
    }

    @Test
    public void testThatWhenIDecreaseTemperatureByStepItDecreasesByStep(){
        myAirconditioner.switchOn();
        assertEquals(16, myAirconditioner.getTemperature());
        myAirconditioner.increaseTemperature(9);
        assertEquals(25, myAirconditioner.getTemperature());

        myAirconditioner.decreaseTemperature(4);
        assertEquals(21, myAirconditioner.getTemperature());

    }

    @Test
    public void testThatISwitchOnAcAndIncreaseTemperatureAbove30TemperatureRemains30() {
        myAirconditioner.switchOn();
        assertEquals(16, myAirconditioner.getTemperature());

        myAirconditioner.increaseTemperature(19);
        assertEquals(30, myAirconditioner.getTemperature());
    }

    @Test
    public void testThatISwitchOnAcAndDecreaseTemperatureBelow16TemperatureRemains16() {
        myAirconditioner.switchOn();
        assertEquals(16, myAirconditioner.getTemperature());

        myAirconditioner.decreaseTemperature(5);
        assertEquals(16, myAirconditioner.getTemperature());
    }



}
