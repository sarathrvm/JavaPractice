package Generics;

public class GenericsExample {

    public static void main(String[] args) {

        Dog<String,Integer> obj = new Dog<>();
        obj.myDog("Raju",1);

    }

}

class Dog<T,V>{
    T name;
    V age;

    public void myDog(T name,V age){
        this.name=name;
        this.age =age;


    }

    public T getId(T name, V age){
        name = name;
        age = age;

        return name;
    }
        }
