package TemplateDesignPattern;

public class OnlinePayment extends PaymentAbstract{
    @Override
    public void validateRequest() {
        System.out.println("validated request");
    }

    @Override
    public void addPaymentDescription() {

        System.out.println("sending money for online payment");
    }

    @Override
    public void calculateDiscount() {
        System.out.println("calculated discount");

    }

    @Override
    public void calculateAmount() {
        System.out.println("calculated total amount to be paid");

    }

    @Override
    public void debitAmount() {

        System.out.println("debited the total amount");
    }

    @Override
    public void creditAmount() {

        System.out.println("credited the total amount");
    }
}
