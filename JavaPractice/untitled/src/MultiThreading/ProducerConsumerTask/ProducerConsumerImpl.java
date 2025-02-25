package MultiThreading.ProducerConsumerTask;

public class ProducerConsumerImpl {


    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread producerTask = new Thread(()->{

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.addItem();
        });

        Thread consumerTask = new Thread(()-> {
            try {
                sharedResource.consumeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        producerTask.start();
        consumerTask.start();
    }
}
