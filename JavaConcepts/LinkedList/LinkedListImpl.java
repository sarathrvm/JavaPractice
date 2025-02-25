package LinkedList;



public class LinkedListImpl {

    public static void main(String[] args) {

        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(11);
        Node<Integer> n3 = new Node<>(12);

        Node<Integer> head = n1;
        head.next=n2;
        System.out.println(head.next);
        n2.next= n3;
        n3.next =null;




    }


}
class Node<T>{

    T data;
    Node<T> next;

    Node(T data){
        this.data = data;

    }
}

