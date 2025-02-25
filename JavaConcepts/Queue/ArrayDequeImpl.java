package Queue;

import java.util.ArrayDeque;

public class ArrayDequeImpl {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        //stack implementation Last in first out

        arrayDeque.push(10);
        arrayDeque.push(20);
        arrayDeque.push(30);

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.pop());

        System.out.println(arrayDeque);


        //Queue implementation singly ended queue with first in last out

        arrayDeque.offer(110);
        arrayDeque.offer(120);
        arrayDeque.offer(130);

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque);


        //Deque Implementation of a doubly ended queue

        arrayDeque.offerFirst(210);
        arrayDeque.offerLast(220);
        arrayDeque.offer(230);

        System.out.println(arrayDeque);

        System.out.println(arrayDeque.pollFirst());

        System.out.println(arrayDeque.pollLast());

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.poll());

    }
}
