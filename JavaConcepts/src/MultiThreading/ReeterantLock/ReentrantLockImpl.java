package MultiThreading.ReeterantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockImpl {
    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();

        SharedResourceReetrantLock sharedResource = new SharedResourceReetrantLock();

        Thread t1 = new Thread(()->{
            System.out.println("started thread using thread1 "+Thread.currentThread().getName());
            sharedResource.produceTask(lock);
        });

        Thread t2 = new Thread(()->{
            try {
//                Thread.sleep(2000);
                sharedResource.produceTask(lock);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println("started thread using thread2: "+Thread.currentThread().getName());
        });


        t1.start();
        t2.start();
    }
}
