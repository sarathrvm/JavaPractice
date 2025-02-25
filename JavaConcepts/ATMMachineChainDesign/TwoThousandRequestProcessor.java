package ATMMachineChainDesign;

public class TwoThousandRequestProcessor extends MoneyRequestHandler{

    public TwoThousandRequestProcessor(MoneyRequestHandler nextAmountHandler) {
        super(nextAmountHandler);
    }

    @Override
    public void withdrawAmount(int amountType,int numberOfNotes) {
        if(amountType==1){
            System.out.println("withdrawing "+numberOfNotes+" 2000 notes");
        }
        else{
            super.withdrawAmount(amountType,numberOfNotes);
        }
    }
}
