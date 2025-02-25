package MultiThreading.ReeterantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceReetrantLock {

    public void produceTask(ReentrantLock reentrantLock){

       try{
           reentrantLock.lock();
           System.out.println("locked with reentrant lock");
           Thread.sleep(5000);
       }
       catch (Exception e){
           //
       }
       finally {
           reentrantLock.unlock();
           System.out.println("unlocked the reentrant lock");
       }

    }
}
