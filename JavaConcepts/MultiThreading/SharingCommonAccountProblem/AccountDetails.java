package MultiThreading.SharingCommonAccountProblem;

public class AccountDetails {
    private int amount;

    public AccountDetails(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void increment(int amountToBeAdded){
        this.amount = amountToBeAdded+amount;
    }

    public synchronized void decrement(int amountToBeDecreased){
        if(amountToBeDecreased<=amount){
            this.amount= amount-amountToBeDecreased;
        }
        else{
            System.out.println("amount is overdraft");
        }

    }
}
