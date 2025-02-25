package MultiThreading;

public class MultiThreadingMain {
    public static void main(String[] args) {

        //pass the runnable object to the thread object
        System.out.println("Running on current thread: "+Thread.currentThread().getName());

        MultiThreadingImpl multiThreadingObj = new MultiThreadingImpl();

        Thread thread = new Thread(multiThreadingObj);

        thread.start();

        System.out.println("finish the thread"+Thread.currentThread().getName());


        MultiThreadingWithExtends multiThreadingWithExtends = new MultiThreadingWithExtends();

        multiThreadingWithExtends.start();


        System.out.println("finish the thread"+Thread.currentThread().getName());



    }
}
