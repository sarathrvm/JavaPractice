package singletonImplementation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VehicleImpl {
    public static void main(String[] args) {

        Vehicle<String> vehicle = new Vehicle<>();

        vehicle.setValue("Sarath");
        if(vehicle.getValue().equals("Sarath")){
            System.out.println("true");
        }

        Vehicle<Integer> vehicle1 = new Vehicle<>();

        System.out.println(vehicle1);


        Bird bird = new Bird() {
            @Override
            public void fly() {
                System.out.println("flying from anonymous class");
            }
        };

        bird.fly();

        System.out.println(bird);


//        Bus bus= new Bus();

        Bird bird1 = ()->{
            System.out.println("flying from lambda expression");
        };

        bird1.fly();


        Comparator<Integer> integerComparator = (a,b)->a-b;

        List<Integer> integerList = new ArrayList<>(List.of(10, 11, 2, 13, 15, 1, 2, 3, 4));

        integerList.sort(integerComparator);

        System.out.println(integerList);


    }
}
