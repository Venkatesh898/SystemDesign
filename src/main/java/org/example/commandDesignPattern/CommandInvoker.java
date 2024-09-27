package org.example.commandDesignPattern;

public class CommandInvoker {
    Icommand command;
    public  CommandInvoker(Icommand command)
    {
        this.command=command;
    }
    public void pressButton()
    {
        command.execute();
    }

}
