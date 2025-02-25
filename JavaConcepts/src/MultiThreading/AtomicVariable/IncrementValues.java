package MultiThreading.AtomicVariable;

import java.util.concurrent.atomic.AtomicInteger;

public class IncrementValues {

    private static final AtomicInteger count = new AtomicInteger(0);


    public void increment(int value){
        count.incrementAndGet();
    }

    public int get(){
        return count.get();
    }
}
