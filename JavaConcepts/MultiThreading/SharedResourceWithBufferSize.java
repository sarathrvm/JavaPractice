package MultiThreading;

import java.util.PriorityQueue;
import java.util.Queue;

public class SharedResourceWithBufferSize {

    Queue<Integer> bufferQueue;
    int bufferSize;

    public SharedResourceWithBufferSize(int bufferSize){
        this.bufferSize= bufferSize;
    }



    public synchronized void addItem(Integer item) throws InterruptedException {

        if(bufferQueue.size()==bufferSize){
            System.out.println("queue is full, waiting "+Thread.currentThread().getName());
            wait(5000);
        }

        bufferQueue.offer(item);
        System.out.println("added item into the queue");


    }

    public synchronized void consumeItem(){
        if(bufferQueue.isEmpty()){
            System.out.println("queue is empty "+Thread.currentThread().getName());

        }
    }
}
