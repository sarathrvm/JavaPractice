package MultiThreading.RunnableCallableFuture;

import MultiThreading.ThreadPoolExecutor.CustomThreadFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class RunnableCallableFutureImpl {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2,4,15, TimeUnit.MINUTES,new ArrayBlockingQueue<>(10), new CustomThreadFactory(),new ThreadPoolExecutor.AbortPolicy());


        //executing runnable and assign to Future object. in the below example runnable always return null here

        Future<?> futureRunnableObj = poolExecutor.submit(()->{
            System.out.println("running the thread: "+Thread.currentThread().getName());
        });

        try{
            Object futureObj =futureRunnableObj.get(10l,TimeUnit.SECONDS);

            if(futureObj== null){
                System.out.println("future object is null");
            }
            else{
                System.out.println("future object value is: "+futureObj);
            }
        }
        catch (Exception e){
            System.out.println("exception while getting future");
        }


        //executing callable and assign the return value in the future object

        List<Integer> integerList= new ArrayList<>();

        Future<List<Integer>> futureCallableObj = poolExecutor.submit(()->{
            integerList.add(100);
            System.out.println("thread name is "+Thread.currentThread().getName());
            return integerList;
        });


        try {
            List<Integer> outputFromFutureObj = futureCallableObj.get(10, TimeUnit.MINUTES);
        }
        catch (Exception e){
            System.out.println("failed while getting the output from future object");
        }




    }
}
