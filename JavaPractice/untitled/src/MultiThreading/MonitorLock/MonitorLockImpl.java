package MultiThreading.MonitorLock;

public class MonitorLockImpl {

    public synchronized void task1(){
        System.out.println("inside task1 synchronized method");
    }

    public void task2(){
        System.out.println("inside task2 before synchronized block");
        synchronized (this){
            System.out.println("inside task2 synchronized block");
        }
    }

    public void task3(){
        System.out.println("inside task3");
    }
}
