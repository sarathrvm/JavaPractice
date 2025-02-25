package MultiThreading.ReadWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {

    boolean isItemAvailable =false;

    public void produceTask(ReadWriteLock lock){

        try{
            System.out.println("inside produce task with thread: "+Thread.currentThread().getName());
            lock.readLock().lock();
            Thread.sleep(8000);
        }
        catch (Exception e){
            //exception handling here
        }
        finally {
            System.out.println("releasing lock from thread: "+Thread.currentThread().getName());
            lock.readLock().unlock();

        }

    }


    public void consumeTask(ReadWriteLock lock){

        try{
            System.out.println("inside consume task and locking with write lock with thread: "+Thread.currentThread().getName());
            lock.writeLock().lock();
            isItemAvailable = true;
            Thread.sleep(8000);
        }
        catch (Exception e){
            //exception handling here
        }
        finally {
            System.out.println("releasing write lock from thread: "+Thread.currentThread().getName());
            lock.writeLock().unlock();

        }

    }
}
