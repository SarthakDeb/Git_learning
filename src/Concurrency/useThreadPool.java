package Concurrency;

public class useThreadPool implements Runnable {
    int num;

    public useThreadPool(int number){
        num = number;
    }

    @Override
    public void run() {
        System.out.println("The number is "+ num +" "+ Thread.currentThread().getName());
    }
}
