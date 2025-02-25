package MultiThreading;

public class MultiThreadingImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("Running on current thread: "+Thread.currentThread().getName());
    }
}
