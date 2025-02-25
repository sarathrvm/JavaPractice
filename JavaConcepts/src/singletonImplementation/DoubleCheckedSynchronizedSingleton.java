package singletonImplementation;

public class DoubleCheckedSynchronizedSingleton {

    public static DoubleCheckedSynchronizedSingleton instance;

    private DoubleCheckedSynchronizedSingleton(){}

    public static DoubleCheckedSynchronizedSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckedSynchronizedSingleton.class){

                if(instance==null){
                    return new DoubleCheckedSynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
