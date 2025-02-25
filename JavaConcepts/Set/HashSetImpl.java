package Set;

import java.util.*;

public class HashSetImpl {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();

        /*
        Set will allow unique elements. HashSet will randomly arrange the elements. HashSet is faster than LinkedHashSet,TreeSet
        HashSet internally uses Hashcode which will generate unique hashcode for each element
         */
        hashSet.add(20);
        hashSet.add(0);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);

        System.out.println(hashSet); //this will only add unique elements and add the elements in sorted way

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(20);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(5);
        linkedHashSet.add(0);

        System.out.println(linkedHashSet); //this will add the elements in the order we have added

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(11);

        System.out.println(treeSet); //this will also add the elements in default ascending order for integers


        Set<String> treeSetString = new TreeSet<>();
        treeSetString.add("sarath");
        treeSetString.add("kumar");
        treeSetString.add("daivik");
        treeSetString.add("revuru");

        System.out.println(treeSetString);


        //if we dont override equals and hashcode then all the elements will be printed.
        // so we will have to override equals and hashcode method with the implementation of only primary key to check uniqueness

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(1,"sarath"));
        studentSet.add(new Student(1,"kumar"));
        studentSet.add(new Student(1,"rvm"));

        System.out.println(studentSet);





        /*
        if we dont implement custom equals and hashcode, above code will return all the 3 values
         */


    }
}

class Student {

    private int rollNo;
    private String name;

    public Student(int rollNo,String name){
        this.name= name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(rollNo, student.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }
}
