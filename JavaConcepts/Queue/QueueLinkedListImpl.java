package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListImpl {

    public static void main(String[] args) {

        /*
        Queue Interface has Linked list implementation
        queue has add and offer(preferred)
        remove and poll(preferred)
        Element and peek(preferred)
         */

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue.isEmpty()); //this will check if the queue is empty or not


    }
}
