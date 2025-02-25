package MultiThreading.MonitoredLock;

public class MonitoredLockImpl {

    public synchronized void task1() {
        System.out.println("inside task 1");
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void task2() {
        System.out.println("inside task 2");
        synchronized (this){
            System.out.println("after synchronized of task2");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){
                System.out.println(ex.getMessage());
            }

        }
    }

    public void task3(){

        System.out.println("inside task 3");
    }
}
