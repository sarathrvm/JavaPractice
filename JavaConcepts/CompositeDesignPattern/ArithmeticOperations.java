package CompositeDesignPattern;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Arthematic leftNumber = new Number(2);
        Arthematic rightNumber = new Number(3);

        Arthematic expression = new Expression(leftNumber,rightNumber,Operation.ADD);

        int output = expression.evaluate();

        System.out.println(output);
    }
}
