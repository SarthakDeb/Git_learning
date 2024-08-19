package AdderSubtractor_Mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    count C;
    Lock lock;
    public Adder (count ca, Lock lc){
        C = ca;
        lock = lc;
    }
    @Override
    public Void call() throws Exception {
       for(int i =1; i<=100; i++){
           lock.lock();
           C.num += i;
           lock.unlock();
       }
       return null;
    }
}
