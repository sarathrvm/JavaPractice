package MultiThreading.ProducerConsumerProblemWIthQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerQueueImpl {

    public static void main(String[] args) {

        ProducerConsumerQueue lock = new ProducerConsumerQueue(8);

        Thread producer = new Thread(()->{
            for(int i=0;i<20;i++){
                lock.addItem(i);
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        });

        Thread consumer = new Thread(()->{
            for(int i=0;i<15;i++){
                lock.consumeItem();

                try{
                    Thread.sleep(2000);
                }
                catch (Exception e){
                    //exception
                }
            }
        });


        producer.start();
        consumer.start();


    }
}
