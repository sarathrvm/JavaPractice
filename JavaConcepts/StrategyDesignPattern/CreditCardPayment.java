package StrategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy{


    @Override
    public void payAmount(int amount) {
        System.out.println("paying "+amount+" from credit Card!!");
    }
}
