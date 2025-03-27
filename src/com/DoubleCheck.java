package com;

import java.util.Objects;

public class DoubleCheck {

    private static DoubleCheck doubleCheck;

    private DoubleCheck() {}

    public static DoubleCheck getInstance() {
        if (Objects.isNull(doubleCheck)) {
            synchronized (DoubleCheck.class) {
                if (Objects.isNull(doubleCheck)) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }

    public void print() {
        System.out.println("hello");
    }
}
