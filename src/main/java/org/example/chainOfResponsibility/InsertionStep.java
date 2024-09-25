package org.example.chainOfResponsibility;

public class InsertionStep implements Step{
    @Override
    public boolean skip() {
        return true;
    }

    @Override
    public void execute() {
       System.out.println("this will be skipped");
    }
}
