package MultiThreading;

public class MultiThreadingWithExtends extends Thread{

    @Override
    public void run(){
        System.out.println("running from extends method class of thread "+Thread.currentThread().getName());

    }
}
