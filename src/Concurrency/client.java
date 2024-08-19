package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String[] args) {
        HelloWorldPrinter printer = new HelloWorldPrinter("Hello World ");
        HelloWorldPrinter printer1 = new HelloWorldPrinter("India ");
        Thread t = new Thread(printer);
        Thread t1 = new Thread(printer1);
        t.start();
        t1.start();

//        for(int i = 1; i<=20; i++){
//            numberPrinter num = new numberPrinter(i);
//            Thread tn = new Thread(num);
//            tn.start();
//        }

//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for(int i = 1; i<=20; i++){
//            useThreadPool number = new useThreadPool(i);
//            executorService.execute(number);
//        }
//        System.out.println("wait");
        ExecutorService executorServiceCached = Executors.newCachedThreadPool();
        for(int i = 1; i<= 150; i++){
            useThreadPool number = new useThreadPool(i);
            executorServiceCached.execute(number);
       }
        System.out.println("wait");
}
}
