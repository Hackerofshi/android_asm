package com.shi.android_base;

public class Demo {
    void test() {
        int a = 0;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("leavesC");
            }
        };
        runnable.run();
    }

    void test1(){
        int b = 0;
    }
}
