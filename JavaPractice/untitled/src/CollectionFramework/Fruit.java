package CollectionFramework;

public class Fruit {

    private String name;

    public Fruit() {
    }

    public String getName() {
        return name;
    }

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
}
