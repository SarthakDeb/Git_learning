package Concurrency;

public class numberPrinter implements Runnable {
    int number;

    public numberPrinter(int n){
        number = n;
    }
    @Override
    public void run() {
        System.out.println("The number is "+ number +" "+ Thread.currentThread().getName());
    }
}
