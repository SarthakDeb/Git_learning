package callable_MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class mergeSorter implements Callable<List<Integer>> {
    List<Integer> arraytoSort;
    ExecutorService executorService;

    public mergeSorter(List<Integer> list, ExecutorService executorService1){
        arraytoSort = list;
        executorService = executorService1;
    }
    @Override
    public List<Integer> call() throws Exception{
        if(arraytoSort.size() <= 1){
            return arraytoSort;
        }

        int mid = arraytoSort.size()/2;
        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();
        for(int i = 0; i<mid; i++){leftArray.add(arraytoSort.get(i));}
        for(int i = mid; i<arraytoSort.size(); i++){rightArray.add(arraytoSort.get(i));}

        mergeSorter leftsorter = new mergeSorter(leftArray, executorService);
        mergeSorter rightsorter = new mergeSorter(rightArray, executorService);

        Future<List<Integer>> leftsortedArray = executorService.submit(leftsorter);
        Future<List<Integer>> rightsortedArray = executorService.submit(rightsorter);
        List<Integer> sortedArray = new ArrayList<>();
        int i=0, j = 0;
        while (i<leftsortedArray.get().size() && j<rightsortedArray.get().size()){
            if(leftsortedArray.get().get(i) <= rightsortedArray.get().get(j)){
                sortedArray.add(leftsortedArray.get().get(i));
                i++;
            }
            else{sortedArray.add(rightsortedArray.get().get(j)); j++;}
        }
        while (i < leftsortedArray.get().size()){
            sortedArray.add(leftsortedArray.get().get(i));
            i++;
        }
        while (j < rightsortedArray.get().size()){
            sortedArray.add(rightsortedArray.get().get(j));
            j++;
        }
        return sortedArray;
    }
}
