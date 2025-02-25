package TemplateDesignPattern;

public class PaymentImpl {
    public static void main(String[] args) {

        PaymentAbstract onlinePayment = new OnlinePayment();

        onlinePayment.payAmount();

    }
}
