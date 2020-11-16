package com.barss.example.core.trycatch;

public class OrderOfClosingResources {

    public static void main(String[] args) throws Exception {
        orderOfClosingResources();
    }

    public static void orderOfClosingResources() throws Exception{
        try(AutoCloseableResourceFirst af = new AutoCloseableResourceFirst();
            AutoCloseableResourceSecond as = new AutoCloseableResourceSecond()){

            af.doSomething();
            as.doSomething();
        }
    }
}
