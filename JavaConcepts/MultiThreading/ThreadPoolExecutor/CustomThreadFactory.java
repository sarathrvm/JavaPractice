package MultiThreading.ThreadPoolExecutor;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
//        thread.setName("myCustomThread");
//        thread.setPriority(1);
//        thread.setDaemon(true);
        return thread;
    }
}
