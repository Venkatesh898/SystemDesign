package org.example.commandDesignPattern;

public class Driver {
    public static void main(String[] args) {
        AirConditioner airConditioner=new AirConditioner();
        CommandInvoker commandInvoker=new CommandInvoker(new TurnOnAcCommand(airConditioner));
        commandInvoker.pressButton();
    }
}
