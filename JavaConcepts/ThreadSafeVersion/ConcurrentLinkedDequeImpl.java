package ThreadSafeVersion;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeImpl {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> concurrentLinkedDeque= new ConcurrentLinkedDeque<>();
        concurrentLinkedDeque.add(1);
        concurrentLinkedDeque.add(2);
        concurrentLinkedDeque.add(4);


    }
}
