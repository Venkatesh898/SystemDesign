package org.example.chainOfResponsibility;

public class TokenizationStep implements Step{
    @Override
    public void execute() {
        System.out.println("Tokenization step is executed");
    }
}
