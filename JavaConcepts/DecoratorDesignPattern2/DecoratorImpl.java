package DecoratorDesignPattern2;

public class DecoratorImpl {
    public static void main(String[] args) {

        BasePizza2 pizza = new AddJalapenos(new AddPanner(new FarmPizza()));

        System.out.println(pizza.getCost());

    }
}
