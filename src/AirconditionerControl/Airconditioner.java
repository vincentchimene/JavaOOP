package AirconditionerControl;

public class Airconditioner {
    private boolean isSwitchedOn = false;
    private int temperature;

    public boolean isSwitchedOn(){
        return isSwitchedOn;
    }
    public void switchOn() {
        if(isSwitchedOn() == false){
            isSwitchedOn = true;
        }
        temperature = 16;
    }

    public void switchOff() {
        if(isSwitchedOn() == true){
            isSwitchedOn = false;
        }
    }

    public void increaseTemperature(int step){
        if(isSwitchedOn && temperature < 30){
            temperature = temperature + step;
        }
        if(temperature > 30) temperature = 30;
    }

    public int getTemperature() {
        return temperature;
    }


    public void decreaseTemperature(int step) {
        if(isSwitchedOn && temperature > 16){
            temperature = temperature - step;
        }
        if(temperature < 16) temperature = 16;
    }


}
