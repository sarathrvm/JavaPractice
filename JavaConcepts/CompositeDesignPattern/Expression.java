package CompositeDesignPattern;

public class Expression implements Arthematic{
    Arthematic leftNumber;
    Arthematic rightNumber;
    Operation operation;

    public Expression(Arthematic leftNumber, Arthematic rightNumber,Operation operation ){
        this.leftNumber=leftNumber;
        this.rightNumber =rightNumber;
        this.operation =operation;

    }


    @Override
    public int evaluate() {
        int value =0;
        switch (operation){
            case ADD:
                value = leftNumber.evaluate()+ rightNumber.evaluate();
                break;
            case DIVIDE:
                value =(leftNumber.evaluate())/ (rightNumber.evaluate());
                break;
            case MULTIPLY:
                value = leftNumber.evaluate() * rightNumber.evaluate();
                break;
            case SUBTRACT:
                value = leftNumber.evaluate()- rightNumber.evaluate();
                break;
        }
        return value;
    }
}
