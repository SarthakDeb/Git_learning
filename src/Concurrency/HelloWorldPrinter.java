package Concurrency;

public class HelloWorldPrinter implements Runnable{
    String message;

    public HelloWorldPrinter(String m){
        message = m;
    }
    @Override
    public void run(){
        System.out.println(message+ Thread.currentThread().getName());
    }
}
