package MultiThreading.ReadWriteLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockImpl {

    public static void main(String[] args) {

        ReadWriteLockSharedResource obj = new ReadWriteLockSharedResource();

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
       // Condition readCondition = readWriteLock.readLock().newCondition();
        Condition writeCondition = readWriteLock.writeLock().newCondition();

        Thread thread1 = new Thread(()->{
            obj.produceTask(readWriteLock);
        });
        Thread thread2 = new Thread(()->{
            obj.produceTask(readWriteLock);
        });
        Thread thread3 = new Thread(()->{
            obj.produceTask(readWriteLock);
        });

        Thread thread4 = new Thread(()->{
            obj.produceTask(readWriteLock);
        });


        Thread thread5 = new Thread(()->{
            obj.consumeTask(readWriteLock,writeCondition);
        });


        thread1.start();
        thread2.start();

        thread3.start();
        thread4.start();
        thread5.start();



    }
}
