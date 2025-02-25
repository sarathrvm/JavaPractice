package EvenOddThroughMultiThreading;

public class EvenOddImplMultiThreading implements Runnable{

    static int count=1;
    final Object object;

    public EvenOddImplMultiThreading(Object object){
        this.object = object;

    }
    @Override
    public void run() {

        while (count<=100){
            if(count%2==0 && Thread.currentThread().getName().equals("EVEN")){
                synchronized (object){
                    System.out.println("Even number is running on current thread: "+Thread.currentThread().getName()+" : "+count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if(count%2!=0 && Thread.currentThread().getName().equals("ODD")){
                synchronized (object){
                    System.out.println("Odd number is running on current thread: "+Thread.currentThread().getName()+" : "+count);
                    count++;
                    object.notify();
                }
            }
        }


    }

    public static void main(String[] args) {
        Object lock = new Object();

        Runnable r1 = new EvenOddImplMultiThreading(lock);
        Runnable r2 = new EvenOddImplMultiThreading(lock);

        Thread t1 = new Thread(r1,"EVEN");
        Thread t2 = new Thread(r2, "ODD");

        t1.start();
        t2.start();
    }
}
