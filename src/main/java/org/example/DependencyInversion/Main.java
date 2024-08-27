package org.example.DependencyInversion;

public class Main {
    public static void main(String[] args) {
        TestDependencyInversion testDependencyInversion=
                new TestDependencyInversion(new BluetoothMouse(),new BluetoothKeyBoard());
        testDependencyInversion.keyBoard.spec();
    }
}
