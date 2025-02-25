package InnerClassesAndAnonymousClasses;

import org.w3c.dom.ls.LSOutput;

public class AnonymousClassImpl {

    //with class name

    class InnerClass extends OuterClass{

    }

    //with Anonymous class impl

    OuterClass obj = new OuterClass(){

        @Override
        public void outerMethod() {
            super.outerMethod();
        }
    };

    //this is another way of anonymous class implementation

    OuterInterface obj2 = new OuterInterface() {
        @Override
        public void interfaceMethod() {

        }
    };

    //using Lambda expression if we have only one method inside an interface and it is called as functional interface

    OuterInterface obj3 =()->{

    };


}

class OuterClass{

    public void outerMethod(){

    }
}

@FunctionalInterface
interface OuterInterface{
    void interfaceMethod();
}
