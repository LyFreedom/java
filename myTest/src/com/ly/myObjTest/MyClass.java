package com.ly.myObjTest;

public class MyClass {
    @Override
    protected void finalize(){
        System.out.println("MyClass finalize Exected");
        try {
            super.finalize();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
