package org.example.DependencyInversion;

public class WiredKeyBoard implements  KeyBoard{
    @Override
    public void spec() {
        System.out.println("This is wired KeyBoard");
    }
}
