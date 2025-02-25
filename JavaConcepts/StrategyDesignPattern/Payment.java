package StrategyDesignPattern;

public class Payment {


    PaymentStrategy paymentStrategy;

    public void setPayment(PaymentStrategy paymentStrategy){
       this.paymentStrategy = paymentStrategy;
    }


    public void payAmount(int amount){
        paymentStrategy.payAmount(amount);
    }


}
