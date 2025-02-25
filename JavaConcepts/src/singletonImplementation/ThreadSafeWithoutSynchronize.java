package singletonImplementation;

public class ThreadSafeWithoutSynchronize {


    private ThreadSafeWithoutSynchronize(){}

    private static class createInstance{
        private static final ThreadSafeWithoutSynchronize instance = new ThreadSafeWithoutSynchronize();
    }

    public static ThreadSafeWithoutSynchronize getInstance(){
        return createInstance.instance;
    }
}
