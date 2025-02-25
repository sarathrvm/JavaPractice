package MultiThreading;

public class MultiThreadingImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("inside thread: "+Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        MultiThreadingImpl multiThreading = new MultiThreadingImpl();

       Thread thread = new Thread(multiThreading);

       thread.start();

    }
}
