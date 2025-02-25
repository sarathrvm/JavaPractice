package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImpl {

    public static void main(String[] args) {
        List<Animal_1> dogsList= new ArrayList<>();

        dogsList.add(new Animal_1(1,"bruno",2));
        dogsList.add(new Animal_1(2,"raja",5));
        dogsList.add(new Animal_1(2,"doggie",20));


        System.out.println(dogsList);
        dogsList.sort(Comparator.comparing(Animal_1::getName));

        dogsList.sort((obj1,obj2)-> obj2.getAge()- obj1.getAge());
        dogsList.sort((obj1,obj2)->obj2.getName().compareTo(obj1.getName()));

        Collections.sort(dogsList, Comparator.comparingInt(Animal_1::getAge));

        System.out.println(dogsList);
    }
}
