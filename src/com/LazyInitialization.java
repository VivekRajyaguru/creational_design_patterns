package com;

import java.util.Objects;

/**
 * Only create object if its null but not thread safe and can cause issues in case of Race Condition
 * to make it thread safe use Synchronized
 *
 * but sice we are using synchronized if object creation taking time to complete other threds have to wait until this finish
 */

public class LazyInitialization implements Cloneable {
    private static LazyInitialization lazyInitialization = null;

    private LazyInitialization() {}

    public static synchronized LazyInitialization getInstance() {
        if (Objects.isNull(lazyInitialization)) {
            lazyInitialization = new LazyInitialization();
        }
        return lazyInitialization;
    }

    public LazyInitialization readResolve() {
        return getInstance();
    }

    public void print() {
        System.out.println("Hello");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        throw new CloneNotSupportedException("Clone not Supported");
        return (LazyInitialization) getInstance();
    }
}
