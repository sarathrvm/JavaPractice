package MultiThreading.PriorityBlockingQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueImpl {

    public static void main(String[] args) {


        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();


        Thread t1 = new Thread(()->{
            System.out.println("adding item from "+Thread.currentThread().getName());
            for(int i=0;i<10;i++){
                priorityBlockingQueue.add(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread t2 = new Thread(()->{
            System.out.println("adding item from "+Thread.currentThread().getName());
            for(int i=0;i<10;i++){
                priorityBlockingQueue.add(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });




        Queue<Integer> integerQueue = new LinkedList<>();

        Thread t3 = new Thread(()->{
            System.out.println("adding item from "+Thread.currentThread().getName());
            for(int i=0;i<10;i++){
                integerQueue.add(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread t4 = new Thread(()->{
            System.out.println("adding item from "+Thread.currentThread().getName());
            for(int i=0;i<10;i++){
                integerQueue.add(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });


        t1.start();
        t2.start();


        t3.start();
        t4.start();


        try{

            t1.join();
            t2.join();


            t3.join();
            t4.join();


        }
        catch (Exception e){
            //
        }

        System.out.println(priorityBlockingQueue);
        System.out.println(integerQueue);



    }
}
