package InnerClassesAndAnonymousClasses;

public class InnerClassAndStaticClass {

    class Toy{
        int price;
    }

    static class PlayStation{
        int price;
    }

    public static void main(String[] args) {

        //if i want to call the toy inner class i can do like below

        InnerClassAndStaticClass obj = new InnerClassAndStaticClass();

        Toy toy = obj.new Toy();
        toy.price=20;

        //static class

        PlayStation playStation = new PlayStation();
        playStation.price=21;

    }
}
