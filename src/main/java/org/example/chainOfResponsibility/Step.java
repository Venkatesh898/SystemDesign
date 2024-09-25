package org.example.chainOfResponsibility;

public interface Step {
    default boolean skip()
    {
        return false;
    }

      default void handle()
    {
        if(!skip())
        {
            execute();
        }
    }
    void execute();


}
