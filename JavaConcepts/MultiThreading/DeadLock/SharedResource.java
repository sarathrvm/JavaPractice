package MultiThreading.DeadLock;

public class SharedResource {

    boolean isItemAvailable = false;

    public synchronized void produceTask(){
        isItemAvailable =true;
        System.out.println("locked acquired inside produce task with thread: "+Thread.currentThread().getName());
        try{
            Thread.sleep(8000);
        }
        catch (Exception e){
//            exception details here
        }
        System.out.println("Lock released from thread: "+Thread.currentThread().getName());

    }
}
