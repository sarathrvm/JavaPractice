package JavaTechieInterviewQuestions;

import java.util.*;

public class CustomizedHashMap extends Thread{

    static Map<Integer,String> map = new HashMap<>();


    public void run(){

        try {
            Thread.sleep(5000);
            map.put(2,"hello");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        CustomizedHashMap customizedHashMap = new CustomizedHashMap();

        customizedHashMap.start();
        System.out.println(Thread.currentThread().getName());

        map.put(1,"abc");
        map.put(4,"hello");
        map.put(2,"def");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        Collection<String> values = map.values();

        Set<Integer> integerSet = map.keySet();




    }
}
