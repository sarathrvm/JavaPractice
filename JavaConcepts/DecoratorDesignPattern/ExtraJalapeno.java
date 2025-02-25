package DecoratorDesignPattern;

public class ExtraJalapeno extends BasePizza{

    BasePizza basePizza;

    public ExtraJalapeno(BasePizza basePizza){
        this.basePizza =basePizza;

    }
    @Override
    public int cost() {
        return basePizza.cost()+40;
    }
}
