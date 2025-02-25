package MultiThreading.ProducerConsumerTask;

public class SharedResource {

    private static boolean isAvailable=false;


    public synchronized void addItem(){
        System.out.println("item is added by thread: "+Thread.currentThread().getName());


        isAvailable = true;
        notifyAll();

    }

    public synchronized void consumeItem() throws InterruptedException {
        System.out.println("inside consumeItem Task by thread:"+ Thread.currentThread().getName());

        while (!isAvailable){
            System.out.println(" thread is waiting to consume "+Thread.currentThread().getName());
            wait();//release all the locks
            System.out.println("waiting is completed");
        }

        System.out.println("consumed item by thread "+Thread.currentThread().getName());
        isAvailable= false;

    }
}
