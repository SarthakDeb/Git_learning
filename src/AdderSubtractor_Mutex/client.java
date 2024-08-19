package AdderSubtractor_Mutex;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        count c = new count();
        Lock l = new ReentrantLock();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Adder a = new Adder(c,l);
        Subtractor s = new Subtractor(c,l);
        Future<Void> res1 = executorService.submit(a);
        Future<Void> res2 = executorService.submit(s);
        res1.get();
        res2.get();
        System.out.println(c.num);
    }
}
