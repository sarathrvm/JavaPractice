package CompositeDesignPattern;

public class Number implements Arthematic{
    int value;

    public Number(int value){
        this.value = value;

    }

    @Override
    public int evaluate() {
        return value;
    }
}
