package org.example.DependencyInversion;
//higher level modules should not depend directly on lower level modules instead it should depends on Abstraction.

public class TestDependencyInversion {
    Mouse mouse;
    KeyBoard keyBoard;
    TestDependencyInversion(Mouse mouse, KeyBoard keyBoard)
    {
        this.mouse=mouse;
        this.keyBoard=keyBoard;
    }

}
