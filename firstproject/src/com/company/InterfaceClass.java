package com.company;

/**
 * InterfaceClass
 */
public class InterfaceClass {

}

interface InterfaceBase {
    public String getString();
}

class ImpClass implements InterfaceBase {
    @Override
    public String getString() {
        return "hello";
    }

    public int get() {
        return 1;
    }
}

abstract class AbsBase {
    abstract public int get();

    public int i;

    final public int getI() {
        return i;
    }
}

class ExtClass extends AbsBase {
    @Override
    public int get() {
        return 5;
    }
}

class NextClass extends AbsBase {
    @Override
    public int get() {
        return 9;
    }
}

class NexyClass extends AbsBase {
    @Override
    public int get() {
        return 0;
    }
}