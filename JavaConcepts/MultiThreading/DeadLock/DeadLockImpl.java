package MultiThreading.DeadLock;

public class DeadLockImpl {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        System.out.println("in main thread: "+Thread.currentThread().getName());

        Thread thread1 = new Thread(()->{
            System.out.println("starting produce task with thread1: "+Thread.currentThread().getName());
            sharedResource.produceTask();
        });

        Thread thread2 = new Thread(()->{
            System.out.println("inside thread2: "+Thread.currentThread().getName());
        });

        thread1.start();
//        thread2.start();

        try {
            System.out.println("main thread is waiting for the thread 1 to complete");
            thread1.join();
        }
        catch (Exception e){
            //handling exception here
        }

        System.out.println("main thread is finishing the work");
    }
}
