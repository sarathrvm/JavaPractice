package MultiThreading.ReadWriteLock;

import MultiThreading.ReadWriteLock.SharedResource;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource1 = new SharedResource();
        ReadWriteLock lock = new ReentrantReadWriteLock();


        Thread thread1 = new Thread(()->{
            System.out.println("inside thread1 read lock");
            sharedResource1.produceTask(lock);
        });

        SharedResource sharedResource2 = new SharedResource();


        Thread thread2 = new Thread(()->{
            System.out.println("inside thread2 read lock");
            sharedResource2.produceTask(lock);
        });


        SharedResource sharedResource3 = new SharedResource();


        Thread thread3 = new Thread(()->{
            System.out.println("inside thread3 write lock");
            sharedResource3.consumeTask(lock);
        });


        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("finishing main task");
    }
}
