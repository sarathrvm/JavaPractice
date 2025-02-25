package MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorImpl {

    public static void main(String[] args) {

        ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<>(15);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,6,5l, TimeUnit.MINUTES, arrayBlockingQueue,new CustomThreadFactory(), new CustomRejectedHandler());

        for(int i=1;i<=5;i++){
            System.out.println(i);

            threadPoolExecutor.submit(()->{
                System.out.println("Thread name: "+Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }
                catch (Exception e){
                    System.out.println("failed in submitting the thread");
                }

            });

        }
        threadPoolExecutor.shutdown();
//        threadPoolExecutor.shutdownNow();


    }
}
