package MultiThreading;

public class AddConsumeResourceMain {

    public static void main(String[] args) {
        SharedResource sharedResource= new SharedResource();

        Thread producerThread = new Thread(()->{
            System.out.println("in add item thread: "+Thread.currentThread().getName());
            sharedResource.addItem();
        });

        Thread thread2 = new Thread(()->sharedResource.consumeItem());


        producerThread.start();
        thread2.start();

    }
}
