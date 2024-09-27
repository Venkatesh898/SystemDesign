package org.example.commandDesignPattern;

public class TurnOnAcCommand implements Icommand {
    AirConditioner airConditioner;
    public TurnOnAcCommand(AirConditioner airConditioner)
    {
        this.airConditioner=airConditioner;
    }
    public  void execute()
    {
        airConditioner.turnOnAc();
    }
}
