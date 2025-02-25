package Map;

import java.security.Key;
import java.util.*;

public class MapImpl {

    public static void main(String[] args) {

        Map<String,String> hashMap = new HashMap<>(1);

        hashMap.put("Sarath","Kumar");
        hashMap.put("Daivik","revuru");


        System.out.println(hashMap);

        System.out.println(hashMap.get("Sarath"));
        hashMap.putIfAbsent("sarath","kumar");
        System.out.println(hashMap);

        //if we want to iterate through items in the map, we can get entries
        Set<Map.Entry<String,String>> entries = hashMap.entrySet();

        for(Map.Entry<String,String> entry: entries){
            System.out.println(entry.getKey());
            System.out.println(entry.hashCode());

        }
        Set<String> keys=hashMap.keySet();

        System.out.println(keys);

        Collection<String> hashMapValues =hashMap.values();

        System.out.println(hashMapValues);

    }
}
