package MultiThreading.SharingCommonAccountProblem;

public class SharedBankAccountImpl {

    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails(100);
        Resource resource1 = new Resource(accountDetails,"sarath",100);
        Resource resource2 = new Resource(accountDetails,"vaishu",70);

        Thread thread1 = new Thread(resource1);

        Thread thread2 = new Thread(resource2);


        thread1.start();
        thread2.start();






    }
}
