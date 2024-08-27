package org.example.DependencyInversion;

public class BluetoothMouse implements Mouse{
    @Override
    public void spec() {
        System.out.println("this is bluetooth mouse");
    }
}
