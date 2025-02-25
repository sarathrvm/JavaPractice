package MultiThreading.ThreadPoolExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExecutorCallable {

    public static void main(String[] args) {

        ExecutorService executorService = new ThreadPoolExecutor(1,2,5, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


        List<Integer> integerArrayList = new ArrayList<>();

       Future<List<Integer>> futureObj=executorService.submit(()->{
            System.out.println("inside callable task");
            for(int i=0;i<10;i++){
                integerArrayList.add(i);
            }
            return integerArrayList;
        });

       try{
           List<Integer> intlist = futureObj.get();

           System.out.println(intlist);
       }
       catch (Exception e){
           System.out.println("exception");
       }


       executorService.shutdown();

    }


}
