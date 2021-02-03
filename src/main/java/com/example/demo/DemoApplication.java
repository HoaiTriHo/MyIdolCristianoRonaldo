package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@SpringBootApplication
public class DemoApplication {
    public Future<Integer> getSum(){}
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<Integer>> futureList = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            TestThread testThread = new TestThread(i, i+1);

            futureList.add(executorService.submit(testThread));
        }

        try{
            for (Future f : futureList){
                System.out.println("Result: "+f.isDone());
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
