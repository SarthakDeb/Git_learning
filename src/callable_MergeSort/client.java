package callable_MergeSort;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Integer> list = Arrays.asList(7,1,4,2,6,8,5);
        mergeSorter mergeSorter1 = new mergeSorter(list, executorService);
//        List<Integer> sortedArrayList = mergeSorter.call();
        Future<List<Integer>> sortedArrayList = executorService.submit(mergeSorter1);
        System.out.println("Sorted Array List is " + sortedArrayList.get());
        System.out.println("After completing sorting");


    }
}
