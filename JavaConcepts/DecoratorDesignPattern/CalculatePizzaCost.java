package DecoratorDesignPattern;

public class CalculatePizzaCost {

    public static void main(String[] args) {

        BasePizza basePizza = new ExtraJalapeno(new ExtraCheese(new FarmHousePizza()));


        System.out.println(basePizza.cost());

    }
}
