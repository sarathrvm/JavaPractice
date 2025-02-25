package BuilderDesignPattern;

public class StudentBuilder {

    private String name;
    private int age;
    private String city;
    private String state;


    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public StudentBuilder setState(String state) {
        this.state = state;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}
