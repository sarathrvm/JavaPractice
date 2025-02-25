package MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.*;

public class ThreadPoolExecutorMain {

    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,3,1, TimeUnit.MINUTES,new ArrayBlockingQueue<>(3),
                r->{
                    //            thread.setName("customThread: "+);
//            thread.setPriority(10);
            return new Thread(r);
                }, (a,b)->{
            System.out.println("Rejected because of over load "+a.toString());
        });


        threadPoolExecutor.submit(()->{
            for(int i=0;i<100;i++){
                try{
                    System.out.println(i+" task0 is running on thread "+Thread.currentThread().getName());
                    Thread.sleep(2000);
                    System.out.println(i+" task0 is waiting: "+Thread.currentThread().getName());
                }
                catch (Exception e){
                    //exception
                }

            }
        });

        //task 1 is submitted
        threadPoolExecutor.submit(()->{
            for(int i=0;i<100;i++){
                try{
                    System.out.println(i+" task1 is running on thread "+Thread.currentThread().getName());
                    Thread.sleep(2000);
                    System.out.println(i+" task0 is waiting: "+Thread.currentThread().getName());
                }
                catch (Exception e){
                    //exception
                }

            }
        });

        //task2 is submitted

        threadPoolExecutor.submit(()->{
            for(int i=0;i<100;i++){
                try{
                    System.out.println(i+" task2 is running on thread "+Thread.currentThread().getName());
                    Thread.sleep(2000);
                    System.out.println(i+" task2 is waiting: "+Thread.currentThread().getName());
                }
                catch (Exception e){
                    //exception
                }

            }
        });


        //task3 is submitted
        threadPoolExecutor.submit(()->{
            for(int i=0;i<100;i++){
                try{
                    System.out.println(i+" task3 is running on thread "+Thread.currentThread().getName());
                    Thread.sleep(2000);
                    System.out.println(i+" task3 is waiting: "+Thread.currentThread().getName());
                }
                catch (Exception e){
                    //exception
                }

            }
        });


        threadPoolExecutor.submit(()->{
            for(int i=0;i<100;i++){
                try{
                    System.out.println(i+" task4 is running on thread "+Thread.currentThread().getName());
                    Thread.sleep(2000);
                    System.out.println(i+" task4 is waiting: "+Thread.currentThread().getName());
                }
                catch (Exception e){
                    //exception
                }

            }
        });
        threadPoolExecutor.submit(()->{
            for(int i=0;i<100;i++){
                try{
                    System.out.println(i+" task5 is running on thread "+Thread.currentThread().getName());
                    Thread.sleep(2000);
                    System.out.println(i+" task5 is waiting: "+Thread.currentThread().getName());
                }
                catch (Exception e){
                    //exception
                }

            }
        });




        threadPoolExecutor.shutdown();




    }
}


class customThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        return null;
    }
}

class customRejectedHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("this is rejected "+r.toString());
    }
}
