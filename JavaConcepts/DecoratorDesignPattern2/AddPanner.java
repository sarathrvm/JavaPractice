package DecoratorDesignPattern2;

public class AddPanner extends BasePizza2{

    BasePizza2 basePizza2;

    public AddPanner(BasePizza2 basePizza2){
        this.basePizza2=basePizza2;
    }

    @Override
    public int getCost() {
        return basePizza2.getCost()+50;
    }
}
