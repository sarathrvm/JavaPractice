package AbstractFactoryMethod;

public class BenzCar implements Vehicle{

    @Override
    public void averageSpeed() {
        System.out.println("running at 150kmph");
    }
}
