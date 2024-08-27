package org.example.DependencyInversion;

public class BluetoothKeyBoard implements KeyBoard{
    @Override
    public void spec() {
        System.out.println("This is Bluetooth KeyBoard");
    }
}
