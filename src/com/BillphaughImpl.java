package com;

/**
 * Bill Phaugh Implementation
 */
public class BillphaughImpl {

    private BillphaughImpl() {}

    private static class SingletonHolder {
        private static BillphaughImpl billphaugh = new BillphaughImpl();
    }

    public static BillphaughImpl getInstance() {
        return SingletonHolder.billphaugh;
    }

    public void print() {
        System.out.println("Hello");
    }
}
