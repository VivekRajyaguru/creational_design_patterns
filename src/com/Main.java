package com;

public class Main {
    public static void main(String[] args) {

        EagerInitialization.getInstance().print();
        LazyInitialization.getInstance().print();
        DoubleCheck.getInstance().print();
    }
}