import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        ArrayList<Dog> dogArrayList = new ArrayList<>();
        for(int i=0;i<10;i++){
            Dog newDog = new Dog();
            dogArrayList.add(newDog);
        }

        System.out.println(dogArrayList);


    }

}
