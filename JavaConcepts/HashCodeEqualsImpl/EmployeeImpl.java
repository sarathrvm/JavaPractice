package HashCodeEqualsImpl;

public class EmployeeImpl {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Sarath","12300");
        Employee employee2 = new Employee("Sarath","12300");

        System.out.println(employee1.equals(employee2));

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());


    }
}
