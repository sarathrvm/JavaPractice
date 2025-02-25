public class Dog {

    static int count;

//    static {
//         int count =0;
//    }

    int age;

//    public void makeNoise(){
//        System.out.println("Dog is Barking");
//    }
    public Dog(){
        count+=1;
        System.out.println("current object creation count is "+count);
        age = 21;
    }
}
