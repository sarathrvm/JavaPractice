package ImmutableClass;


import java.util.ArrayList;
import java.util.List;

final class ImmutableEmployee {

    private final String name;
    private final List<String> stringList;

    ImmutableEmployee(String name, List<String> stringList) {
        this.name = name;
        this.stringList = stringList;
    }

    public String getName(){
        return name;
    }

    public List<String> getStringList(){
        //if we directly return the list, then it will get updated to the list.
        //we need to create a copy of this list and assign stringlist to it
        return new ArrayList<>(stringList);
    }



}


public class ImmutableImpl{


    public static void main(String[] args) {

        List<String> arrayList = new
                ArrayList<>();
        arrayList.add("kumar");

        ImmutableEmployee immutableEmployee = new ImmutableEmployee("sarath",arrayList);
        immutableEmployee.getStringList().add("Sarath");


        System.out.println(immutableEmployee.getStringList());




    }



}
