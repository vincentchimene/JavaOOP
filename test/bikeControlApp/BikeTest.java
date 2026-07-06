package bikeControlApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike  myBike;

    @BeforeEach
    public void setUp(){
        myBike = new Bike();
    }

    @Test
    public void testThatmyBikeTurnsOnWhenITurnItOn(){
        myBike.turnOn();
        assertTrue(myBike.isOn());
    }

    @Test
    public void testThatmyBikeTurnsOffWhenITurnItOff(){
        myBike.turnOff();
        assertFalse(myBike.isOn());
    }

    @Test
    public void testThatWhenSwitchedOnSpeedStartsAt0() {
        myBike.turnOn();
        assertEquals(0, myBike.getSpeed());
    }

    @Test
    public void testThatWhenSwitchedOnGearStartsAt1() {
        myBike.turnOn();
        assertEquals(1, myBike.getGear());
    }

    @Test
    public void testThatWhenMybikeIsOnGear1_ItAcceleratesInIncrementOf1(){
        myBike.turnOn();
        assertEquals(0, myBike.getSpeed());
        assertEquals(1, myBike.getGear());
        myBike.accelerate();
        assertEquals(1, myBike.getSpeed());
    }

    @Test
    public void testThatWhenSpeedIsBetween21And30_GearIsEqualTo2_SpeedIs21(){
        myBike.turnOn();
        for(int count = 1; count <= 21; count++){
            myBike.accelerate();
        }
        assertEquals(21, myBike.getSpeed());
        assertEquals(2, myBike.getGear());

    }

    @Test
    public void testThatWhenSpeedIsBetween21And30_GearIsEqualTo2_SpeedIs29(){
        myBike.turnOn();
        for(int count = 1; count <= 25; count++){
            myBike.accelerate();
        }
        assertEquals(29, myBike.getSpeed());
        assertEquals(2, myBike.getGear());

    }

    @Test
    public void testThatWhenMybikeIsOnGear2_ItAcceleratesInIncrementOf2(){
        myBike.turnOn();
        for(int count = 1; count <= 21; count++){
            myBike.accelerate();
        }
        assertEquals(21, myBike.getSpeed());
        myBike.accelerate();
        assertEquals(23, myBike.getSpeed());
    }

    @Test
    public void testThatWhenSpeedIsBetween31And40_GearIsEqualTo3_SpeedIs31(){
        myBike.turnOn();
        for(int count = 1; count <= 26; count++){
            myBike.accelerate();
        }
        assertEquals(31, myBike.getSpeed());
        assertEquals(3, myBike.getGear());

    }

    @Test
    public void testThatWhenSpeedIsBetween31And40_GearIsEqualTo3_SpeedIs40(){
        myBike.turnOn();
        for(int count = 1; count <= 29; count++){
            myBike.accelerate();
        }
        assertEquals(40, myBike.getSpeed());
        assertEquals(3, myBike.getGear());

    }

    @Test
    public void testThatWhenMybikeIsOnGear3_ItAcceleratesInIncrementOf3(){
        myBike.turnOn();
        for(int count = 1; count <= 27; count++){
            myBike.accelerate();
        }
        assertEquals(34, myBike.getSpeed());
        assertEquals(3, myBike.getGear());
        myBike.accelerate();
        assertEquals(37, myBike.getSpeed());

    }

    @Test
    public void testThatWhenSpeedIs41AndAbove_GearIsEqualTo4_SpeedAt43(){
        myBike.turnOn();
        for(int count = 1; count <= 30; count++){
            myBike.accelerate();
        }
        assertEquals(43, myBike.getSpeed());
        assertEquals(4, myBike.getGear());
    }


    @Test
    public void testThatWhenSpeedIs41AndAbove_GearIsEqualTo4_SpeedAt59(){
        myBike.turnOn();
        for(int count = 1; count <= 34; count++){
            myBike.accelerate();
        }
        assertEquals(59, myBike.getSpeed());
        assertEquals(4, myBike.getGear());
    }

    @Test
    public void testThatWhenMybikeIsOnGear4_ItAcceleratesInIncrementOf4(){
        myBike.turnOn();
        for(int count = 1; count <= 30; count++){
            myBike.accelerate();
        }
        assertEquals(43, myBike.getSpeed());
        assertEquals(4, myBike.getGear());
        myBike.accelerate();
        assertEquals(47, myBike.getSpeed());

    }

    @Test
    public void testThatWhenMybikeIsOnGear1_ItDecceleratesInDecrementOf1(){
        myBike.turnOn();
        for(int count = 1; count <= 10; count++){
            myBike.accelerate();
        }
        assertEquals(10, myBike.getSpeed());
        assertEquals(1, myBike.getGear());
        myBike.deccelerate();
        assertEquals(9, myBike.getSpeed());
    }

    @Test
    public void testThatWhenMybikeIsOnGear2_ItDecceleratesInDecrementOf2(){
        myBike.turnOn();
        for(int count = 1; count <= 23; count++){
            myBike.accelerate();
        }
        assertEquals(25, myBike.getSpeed());
        assertEquals(2, myBike.getGear());
        myBike.deccelerate();
        assertEquals(23, myBike.getSpeed());
    }

    @Test
    public void testThatWhenMybikeIsOnGear3_ItDecceleratesInDecrementOf3(){
        myBike.turnOn();
        for(int count = 1; count <= 27; count++){
            myBike.accelerate();
        }
        assertEquals(34, myBike.getSpeed());
        assertEquals(3, myBike.getGear());
        myBike.deccelerate();
        assertEquals(31, myBike.getSpeed());
    }

    @Test
    public void testThatWhenMybikeIsOnGear4_ItDecceleratesInDecrementOf4(){
        myBike.turnOn();
        for(int count = 1; count <= 31; count++){
            myBike.accelerate();
        }
        assertEquals(47, myBike.getSpeed());
        assertEquals(4, myBike.getGear());
        myBike.deccelerate();
        assertEquals(43, myBike.getSpeed());
    }

    @Test
    public void testThatWhenMybikeTurnedOff_AccelerateMakesNoChange(){
        myBike.turnOff();
        for(int count = 1; count <= 31; count++){
            myBike.accelerate();
        }
        assertEquals(0, myBike.getSpeed());
        assertEquals(0, myBike.getGear());
    }
}
