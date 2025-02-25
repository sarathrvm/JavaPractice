package LinkedList;

import java.util.LinkedList;

public class LinkedListSample {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        //Linked List implements both deque and List methods

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.get(2));
        linkedList.addFirst(9);


    }
}
