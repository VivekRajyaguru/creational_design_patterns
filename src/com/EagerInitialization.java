package com;

/**
 * It will create the object on initialization only even if we need it or not
 */
public class EagerInitialization {

    private static final EagerInitialization eagerInitialization = new EagerInitialization();

    private EagerInitialization() {}

    public static EagerInitialization getInstance() {
        return eagerInitialization;
    }

    public void print() {
        System.out.println("Hello");
    }

}
