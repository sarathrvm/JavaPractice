package MultiThreading.AtomicVariable;

public class AtomicVariablesImpl {


    public static void main(String[] args) {

        IncrementValues obj = new IncrementValues();

        Thread t1 = new Thread(()->{
            for(int i=0;i<=50;i++){
                obj.increment(i);

            }
        });


        Thread t2 = new Thread(()->{
            for(int i=0;i<=50;i++){
                obj.increment(i);

            }
        });

        Thread t3 = new Thread(()->{
            for(int i=0;i<=50;i++){
                obj.increment(i);

            }
        });


        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch (Exception e){
            //
        }






        System.out.println(obj.get());

    }
}
