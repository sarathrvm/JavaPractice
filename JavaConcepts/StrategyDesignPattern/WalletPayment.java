package StrategyDesignPattern;

public class WalletPayment implements PaymentStrategy{

    @Override
    public void payAmount(int amount) {
        System.out.println("paying "+amount+ " using wallet");
    }
}
