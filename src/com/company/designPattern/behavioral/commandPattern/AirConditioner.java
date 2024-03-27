package com.company.designPattern.behavioral.commandPattern;

// Receiver
public class AirConditioner {

    private boolean isON;
    private int temperature;

    public void setTurnOnAC() {
        isON = true;
        System.out.println("AC turn ON");
    }

    public void setTurnOffAC() {
        isON = false;
        System.out.println("AC turn Off");
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Temperature changed to " + temp);
    }

}
