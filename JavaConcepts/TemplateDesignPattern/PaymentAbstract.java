package TemplateDesignPattern;

public abstract class PaymentAbstract {

    public abstract void validateRequest();
    public abstract void addPaymentDescription();
    public abstract void calculateDiscount();
    public abstract void calculateAmount();
    public abstract void debitAmount();
    public abstract void creditAmount();

    public final void payAmount(){
        validateRequest();
        addPaymentDescription();
        calculateDiscount();
        calculateAmount();
        debitAmount();
        creditAmount();
    }



}
