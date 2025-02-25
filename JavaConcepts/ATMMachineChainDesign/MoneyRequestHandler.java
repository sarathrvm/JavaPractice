package ATMMachineChainDesign;

public abstract class MoneyRequestHandler {

    MoneyRequestHandler nextAmountRequestHandler;
    public static final int TWOTHOUSAND =1;
    public static final int FIVEHUNDRED =2;
    public static final int HUNDRED =3;

    public MoneyRequestHandler(MoneyRequestHandler nextAmountHandler){
        this.nextAmountRequestHandler = nextAmountHandler;
    }

    public void withdrawAmount(int amountType,int numberOfNotes){
        if(nextAmountRequestHandler!=null){
            nextAmountRequestHandler.withdrawAmount(amountType,numberOfNotes);
        }
    }
}
