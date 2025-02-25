package StrategyDesignPattern;

public class paymentImpl {

    public static void main(String[] args) {
        //through credit card
       Payment payment = new Payment();

       payment.setPayment(new CreditCardPayment());

       payment.payAmount(100);







    }
}
