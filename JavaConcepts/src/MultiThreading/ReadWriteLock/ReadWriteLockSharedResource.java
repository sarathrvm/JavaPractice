package MultiThreading.ReadWriteLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class ReadWriteLockSharedResource {

    public void produceTask(ReadWriteLock lock){

        try{
            lock.readLock().lock();
            System.out.println("added a read lock by: "+Thread.currentThread().getName());
            Thread.sleep(2000);
        }
        catch (Exception e){
            //exception here
        }
        finally{
            System.out.println("unlocked the read lock by: "+Thread.currentThread().getName());
            lock.readLock().unlock();
        }

    }

    public void consumeTask(ReadWriteLock lock,Condition condition){
        try{
            lock.writeLock().lock();
            System.out.println("added a write lock by "+Thread.currentThread().getName());
            Thread.sleep(2000);
            condition.signal();
        }
        catch (Exception e){
            //exception here
        }

        finally {
            System.out.println("unlocked write lock by: "+Thread.currentThread().getName());
            lock.writeLock().unlock();

        }
    }
}
