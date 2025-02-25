package DecoratorDesignPattern;

public class ExtraCheese extends BasePizza {
    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
