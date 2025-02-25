package CollectionFramework.IteratorsDemo;

import java.util.Comparator;

public class Car implements Comparable<Car> {

    private String name;

    private String vehicleType;

    public String getName() {
        return name;
    }

    public Car() {
    }

    public Car(String name, String vehicleType) {
        this.name = name;
        this.vehicleType = vehicleType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.getName());
    }
}
