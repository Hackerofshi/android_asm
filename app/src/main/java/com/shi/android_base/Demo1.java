package com.shi.android_base;

public class Demo1 {
    void test() {
//        int a = 0;
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("leavesC");
//            }
//        };
//        runnable.run();


        Runnable runnable = () -> System.out.println("leavesC");
        runnable.run();
    }

    public int test1() {
        int b = 0;
        return b;
    }
}
