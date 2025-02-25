package CollectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueImpl {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1,o2)->o2.compareTo(o1));
        boolean offer = priorityQueue.offer(2);
        priorityQueue.add(3);
        priorityQueue.add(5);

        System.out.println(priorityQueue);

        //priority queue implements max heap and min heap

        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue.poll());


        Queue<Integer> queue= new LinkedList<>();

        queue.add(2);
        queue.offer(1);
        queue.offer(3);

        System.out.println(queue);
        System.out.println(queue.poll());

        System.out.println(queue.peek());







    }
}
