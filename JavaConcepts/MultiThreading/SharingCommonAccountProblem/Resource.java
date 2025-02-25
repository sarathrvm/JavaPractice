package MultiThreading.SharingCommonAccountProblem;

public class Resource implements Runnable{

    private AccountDetails accountDetails;
    private String name;
    private int amountToSpend;

    public Resource(AccountDetails accountDetails, String name, int amountToSpend) {
        this.accountDetails = accountDetails;
        this.name = name;
        this.amountToSpend = amountToSpend;
    }

    @Override
    public void run() {
        shopping(amountToSpend);
    }

    public synchronized void shopping(int amountToSpend){
        if(accountDetails.getAmount()>=amountToSpend){
            System.out.println("amount is there to shop for "+name);
            accountDetails.decrement(amountToSpend);
            System.out.println(name+"finishes shopping");
        }
        else{
            System.out.println("amount is not available to shop for "+name);
        }

    }
}
