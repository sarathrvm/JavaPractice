package MultiThreading.ProducerConsumerProblemWIthQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerQueue {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public ProducerConsumerQueue(int bufferSize){
        this.bufferSize = bufferSize;
        this.sharedBuffer = new LinkedList<>();
    }


    public synchronized void addItem(int item){
        if(sharedBuffer.size()==bufferSize){
            System.out.println("queue is full. thread is waiting"+Thread.currentThread().getName());
            try{
                wait();
            }
            catch (Exception e ){
                //exception
            }

        }

        sharedBuffer.add(item);
        System.out.println("added item into shared buffer with thread: "+Thread.currentThread().getName());
    }


    public synchronized void consumeItem(){
        if(sharedBuffer.isEmpty()){
            System.out.println("queue is empty on thread: "+Thread.currentThread().getName());
            notifyAll();
        }

        Integer poll = sharedBuffer.poll();

        System.out.println("consumed value: "+poll+" from thread "+Thread.currentThread().getName());


    }



}
