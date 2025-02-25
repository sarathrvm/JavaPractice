package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableImpl {
    public static void main(String[] args) {
        List<Animal> dogsList= new ArrayList<>();

        dogsList.add(new Animal(1,"bruno",2));
        dogsList.add(new Animal(2,"raja",5));
        dogsList.add(new Animal(2,"doggie",20));


        System.out.println(dogsList);

        Collections.sort(dogsList);

        System.out.println(dogsList);
    }
}
