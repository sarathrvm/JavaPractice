package Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImpl {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        /*
        priority queue takes the default implementation when a comparator is not defined.
        in Integer it takes the lowest value as the first priority.
         */

        priorityQueue.offer(40);
        priorityQueue.offer(20);
        priorityQueue.offer(-1);
        priorityQueue.offer(0);
        priorityQueue.offer(10);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());

        System.out.println(priorityQueue.peek());

        //Adding a comparator

        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        //it will take the highest value as top priority now because of the comparator condition

        pq.offer(10);
        pq.offer(20);
        pq.offer(0);
        pq.offer(200);
        pq.offer(50);


        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());

        System.out.println(pq);

    }
}
