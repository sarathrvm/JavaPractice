package singletonImplementation;

public class Vehicle<T>{


    public Vehicle(){
        System.out.println("printing from vehicle");
    }

    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T newValue){
        this.value = newValue;
    }
}
