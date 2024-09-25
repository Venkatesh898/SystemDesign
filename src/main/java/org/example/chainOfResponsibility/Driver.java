package org.example.chainOfResponsibility;

import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Step> stepList= Arrays.
                asList(new ValidationStep(),new TokenizationStep(),
                        new InsertionStep(),new PaymentStep(),new DataModelling());
        stepList.stream().forEach(step->step.handle());
    }
}
