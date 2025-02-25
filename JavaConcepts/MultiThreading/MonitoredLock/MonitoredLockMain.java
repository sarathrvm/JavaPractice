package MultiThreading.MonitoredLock;

public class MonitoredLockMain {
    public static void main(String[] args) throws InterruptedException {
        MonitoredLockImpl obj = new MonitoredLockImpl();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.task1();
            }
        });
        Thread t2= new Thread(()->obj.task2());
        Thread t3 = new Thread(()->obj.task3());

        t1.start();
        t2.start();
        t3.start();

    }
}
