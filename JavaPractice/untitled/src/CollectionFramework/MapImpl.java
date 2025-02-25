package CollectionFramework;

import java.util.*;
import java.util.stream.Collectors;

public class MapImpl {

    public static void main(String[] args) {

        Map<Integer,String> stringMap = new HashMap<>();
        
        stringMap.put(1,"sarath");
        stringMap.put(2,"kumar");
        stringMap.put(3,"malli");
        stringMap.put(4,"revuru");
        stringMap.put(5,"rvm");
        //stringMap.put(7,null);
        stringMap.put(null,"hero");

        

        System.out.println(stringMap.values());

        Set<Map.Entry<Integer, String>> entries = stringMap.entrySet();


        Map<Integer, String> StringMap = entries.stream().collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue().toUpperCase()));

        List<String> stringList = new ArrayList<>();


        List<Fruit> fruitList = new ArrayList<>();

        fruitList.add(new Fruit("apple","Red"));
        fruitList.add(new Fruit("orange","orange"));
        fruitList.add(new Fruit("lemon","yellow"));
        fruitList.add(new Fruit("banana","yellow"));
        fruitList.add(new Fruit("apple","Red"));
        boolean add = fruitList.add(new Fruit("grapes", "black"));


        Map<String, Long> collect = fruitList.stream().collect(Collectors.groupingBy(o -> o.getColor(), Collectors.counting()));

        System.out.println(collect);

    }
}
