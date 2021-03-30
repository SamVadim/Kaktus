package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {


    public static final Object lock = new Object();

    public static AtomicInteger sum = new AtomicInteger(0);

    public static final String INPUT_STRING = "Невежество есть мать промышленности, как и суеверий." +
            " Сила размышления и воображения подвержена ошибкам; но привычка двигать рукой или ногой" +
            " не зависит ни от того, ни от другого. Поэтому мануфактуры лучше всего процветают там, где" +
            " наиболее подавлена духовная жизнь, так что мастерская может рассматриваться как машина," +
            " части которой составляют люди.";


    public static final String TEMPLATE = " ";


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long current = System.currentTimeMillis();

        ExecutorService potocs = Executors.newFixedThreadPool(20);

        List<Future> zadan = new ArrayList<>();

        for(int i = 0; i < INPUT_STRING.length(); i++){

            int k = i;
            zadan.add(potocs.submit( () ->{
                if (Matcher.match(String.valueOf( INPUT_STRING.charAt(k)), TEMPLATE)) {
                    sum.incrementAndGet();
                }
            }));
        }

        for(Future j:zadan){
            j.get();
        }

        potocs.shutdown();


        System.out.println("Count of space: " + sum);

        System.out.println("Time: " + (System.currentTimeMillis() - current) / 1000 + " c.");
    }
}