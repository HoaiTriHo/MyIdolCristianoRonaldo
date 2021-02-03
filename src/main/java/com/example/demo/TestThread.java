package com.example.demo;

import java.util.concurrent.Callable;

public class TestThread implements Callable<Integer> {
    private int a;
    private int b;

    public TestThread(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public Integer call() throws Exception {
        return this.a+this.b;
    }
}
