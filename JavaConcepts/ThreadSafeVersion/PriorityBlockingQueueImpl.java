package ThreadSafeVersion;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueImpl {

    public static void main(String[] args) {

        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

        priorityBlockingQueue.add(1);
        priorityBlockingQueue.add(5);
        priorityBlockingQueue.add(10);
    }
}
