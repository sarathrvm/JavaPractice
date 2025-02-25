package BuilderDesignPattern;

public class BuilderImpl {

    public static void main(String[] args) {

        Student student = new StudentBuilder().setName("Sarath").setAge(20).build();
    }
}
