package org.example.commandDesignPattern;

public class AirConditioner {
    private  boolean isOn;
    public  void  turnOnAc()
    {
        isOn=true;
        System.out.println("AC is turned on");
    }
    public void turnOffAC()
    {
        isOn=false;
        System.out.println("AC is turned off");
    }
}
