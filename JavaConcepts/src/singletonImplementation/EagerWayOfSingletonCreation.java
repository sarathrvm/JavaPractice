package singletonImplementation;

public class EagerWayOfSingletonCreation {

    public static final EagerWayOfSingletonCreation instance = new EagerWayOfSingletonCreation();


    private EagerWayOfSingletonCreation(){

    }

    public static  EagerWayOfSingletonCreation getInstance(){
        return instance;
    }

}
