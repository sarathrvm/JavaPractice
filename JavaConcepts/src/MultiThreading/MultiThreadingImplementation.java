package src.MultiThreading;

public class MultiThreadingImplementation implements Runnable{
    @Override
    public void run() {
        System.out.println("inside thread: "+Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        MultiThreadingImplementation multiThreading = new MultiThreadingImplementation();

       Thread thread = new Thread(multiThreading);

       thread.start();

    }
}
