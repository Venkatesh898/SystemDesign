package org.example.chainOfResponsibility;

public class PaymentStep implements Step{
    @Override
    public void execute() {
        System.out.println("Payment step is executed");
    }
}
