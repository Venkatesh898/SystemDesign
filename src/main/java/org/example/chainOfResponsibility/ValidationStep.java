package org.example.chainOfResponsibility;

public class ValidationStep implements Step{
    @Override
    public void execute() {
        System.out.println("Payment is validated");
    }
}
