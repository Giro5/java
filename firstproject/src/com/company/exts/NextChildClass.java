package com.company.exts;

/**
 * NextChildClass
 */
public class NextChildClass extends ChildClass {
    @Override
    public int getI() {
        return super.getI();
    }

    public int getI(int i) {
        return i;
    }
}