package org.example.chainOfResponsibility;

public class DataModelling implements Step{
    @Override
    public void execute() {
        System.out.println("Data modelling is executed!!");
    }
}
