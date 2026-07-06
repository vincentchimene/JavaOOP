package bikeControlApp;

public class Bike {
    private boolean powerState = false;
    private int gear = 0;
    private int speed = 0;

    public boolean isOn() {
        return powerState;
    }

    public void turnOn() {
        if (isOn() == false) {
            powerState = true;
        }
        gear = 1;
        speed = 0;
    }

    public void turnOff() {
        if (isOn() == true) {
            powerState = false;
        }
        gear = 0;
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear(){
        return gear;
    }


    public void accelerate() {
        if (isOn()) {
            speed = speed + gear;
            updateGear();

        }
    }

    public void deccelerate() {
        if (isOn() && speed > 0) {
            speed = speed - gear;
            updateGear();
        }

    }

    public void updateGear(){
        if(speed < 0) {
            speed = 0;
        }
        else if(speed >= 0 && speed <= 20){
            gear = 1;
        }
        else if (speed >= 21 && speed <= 30) {
            gear = 2;
        }
        else if (speed >= 31 && speed <= 40) {
            gear = 3;
        }
        else if (speed >= 41) {
            gear = 4;
        }

    }


}
