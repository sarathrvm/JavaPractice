class StaticSuper {
    static {
        System.out.println("super static block");
    }

    StaticSuper () {
        System.out.println("super constructor");
    }
}

public class StaticNonStaticExample extends StaticSuper {
    static int rand;

    static {
        rand = (int) (Math.random() * 6);
        System.out.println("static block " + rand);
    }

    StaticNonStaticExample() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        StaticNonStaticExample st = new StaticNonStaticExample();
    }
}