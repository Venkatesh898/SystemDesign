package org.example.commandDesignPattern;

public class TurnOffAcCommand implements  Icommand{
    AirConditioner airConditioner;
    public TurnOffAcCommand(AirConditioner airConditioner)
    {
        this.airConditioner=airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOffAC();
    }
}
