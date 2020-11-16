package com.barss.example.core.trycatch;

public class AutoCloseableResourceFirst implements AutoCloseable{

    public AutoCloseableResourceFirst(){
        System.out.println("Constructor -> AutoCloseableResource_First");
    }

    public void doSomething(){
        System.out.println("Something -> AutoCloseableResource_First");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed -> AutoCloseableResource_First");
    }
}
