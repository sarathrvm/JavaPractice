package MultiThreading;

public class SharedResource{

    boolean isItemPresent;

    public synchronized void addItem(){
        isItemPresent =true;
        System.out.println("added items in shared resource class from thread "+Thread.currentThread().getName());
        notify();
        notifyAll();
    }


    public synchronized void consumeItem(){

        while(!isItemPresent){
            System.out.println("consumed items in shared resource class from thread: "+Thread.currentThread().getName());
            try{
                wait(5000);
            }
            catch (Exception exception){
                //exception handling here
            }

        }
        isItemPresent=false;

    }
}
