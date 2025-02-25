package MultiThreading.CompletableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CompletableFutureImpl {

    public static void main(String[] args) {


        ExecutorService executorService = new ThreadPoolExecutor(1,2,5, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


        List<Integer> integerList = new ArrayList<>();

        CompletableFuture<List<Integer>>  completableFuture1 = CompletableFuture.supplyAsync(()->{
            for(int i=0;i<10;i++){
                System.out.println("implementing task "+i+" using thread: "+Thread.currentThread().getName());
                integerList.add(i);
            }

            return integerList;

        },executorService);

        CompletableFuture<List<Integer>>  completableFuture2 = CompletableFuture.supplyAsync(()->{
            for(int i=0;i<10;i++){
                System.out.println("implementing task "+i+" using thread: "+Thread.currentThread().getName());
                integerList.add(i);
            }

            return integerList;

        },executorService);


        completableFuture1.join();
        completableFuture2.join();

        System.out.println(integerList);
    }
}
