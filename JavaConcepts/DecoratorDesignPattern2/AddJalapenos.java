package DecoratorDesignPattern2;

public class AddJalapenos extends BasePizza2{
    BasePizza2 basePizza2;
    public AddJalapenos(BasePizza2 basePizza2){
        this.basePizza2=basePizza2;
    }
    @Override
    public int getCost() {
        return basePizza2.getCost()+40;
    }
}
