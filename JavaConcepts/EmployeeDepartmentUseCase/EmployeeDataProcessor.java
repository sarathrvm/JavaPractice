package EmployeeDepartmentUseCase;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDataProcessor {
    public static void main(String[] args) throws ParseException, InterruptedException {

        List<Object> employeeList = new ArrayList<>();

        Project p1 = new Project("P001", "Alpha", "ABC Corp", "Alice");
        Project p2 = new Project("P002", "Beta", "XYZ Ltd", "Bob");
        Project p3 = new Project("P003", "Gamma", "ABC Corp", "Alice");
        Project p4 = new Project("P004", "Delta", "TechWorld", "Charlie");
        Project p5 = new Project("P005", "Epsilon", "MoneyMatters", "Daniel");
        Project p6 = new Project("P006", "Zeta", "SmartTech", "Eva");
        Project p7 = new Project("P007", "Eta", "BrandBoost", "George");
        Project p8 = new Project("P008", "Theta", "InnoSoft", "Hannah");
        Project p9 = new Project("P009", "Iota", "FastTrack", "Ian");
        Project p10 = new Project("P010", "Kappa", "DigitalWave", "Jessica");
        Project p11 = new Project("P011", "Zeta", "SmartTech", "Eva");
        Project p12 = new Project("P012", "Eta", "BrandBoost", "George");
        Project p13 = new Project("P013", "Theta", "InnoSoft", "Hannah");
        Project p14 = new Project("P014", "Iota", "FastTrack", "Ian");
        Project p15 = new Project("P015", "Kappa", "DigitalWave", "Jessica");
        Project p16 = new Project("P016", "Alpha", "ABC Corp", "Alice");

        employeeList.add(new Employee(1, "sarath", 20, "HR", 45000, LocalDate.of(2023, 5, 20),Arrays.asList(p1)));

        employeeList.add(new Employee(2, "kumar", 22, "ECE", 70000, LocalDate.of(2024, 1, 20), Arrays.asList(p2)));

        employeeList.add(new Employee(3, "rvm", 25, "EEE", 46000, LocalDate.of(2022, 5, 20), Arrays.asList(p1)));
        employeeList.add(new Employee(4, "revuru", 29, "IT", 68000, LocalDate.of(2024, 5, 20), Arrays.asList(p1)));
        employeeList.add(new Employee(5, "daivik", 30, "Manager", 55000, LocalDate.of(2021, 5, 20), Arrays.asList(p1)));
        employeeList.add(new Employee(6, "sarath2", 31, "IT", 70000, LocalDate.of(2015, 5, 20), Arrays.asList(p1)));
        employeeList.add(new Employee(7, "kumar2", 35, "EEE", 60000, LocalDate.of(2024, 9, 20), Arrays.asList(p1)));
        employeeList.add(new Employee(8, "revuru2", 41, "HR", 80000, LocalDate.of(2025, 1, 1), Arrays.asList(p1)));

        employeeList.add(new Employee(9, "Alice", 28, "IT", 60000, LocalDate.of(2018, 5, 20), Arrays.asList(p1)));
        employeeList.add(new Employee(10, "Bob", 35, "HR", 75000, LocalDate.of(2015, 3, 15), Arrays.asList(p1)));
        employeeList.add(new Employee(11, "Charlie", 40, "Finance", 90000, LocalDate.of(2010, 1, 10), Arrays.asList(p1)));
        employeeList.add(new Employee(12, "David", 25, "IT", 55000, LocalDate.of(2021, 7, 8), Arrays.asList(p1)));
        employeeList.add(new Employee(13, "Eve", 30, "Marketing", 65000, LocalDate.of(2019, 11, 30), Arrays.asList(p1)));
        employeeList.add(new Employee(14, "Frank", 45, "Finance", 95000, LocalDate.of(2008, 6, 25), Arrays.asList(p1)));
        employeeList.add(new Employee(15, "Grace", 32, "HR", 72000, LocalDate.of(2016, 9, 18), Arrays.asList(p1)));
        employeeList.add(new Employee(16, "Hank", 29, "IT", 58000, LocalDate.of(2020, 4, 14), Arrays.asList(p1)));

        //Employee employee = (Employee) (employeeList.get(0));

        System.out.println(employeeList);

        Predicate<Object> employeePredicate = object -> {
            if (object instanceof Employee) {
                Employee employee = (Employee) object;
                return (employee.getSalary() > 5000);
            }
            return false;
        };

        //convert to Map

        Map<Integer, Employee> employeeMap = employeeList.stream().filter(employeePredicate).map(object -> (Employee) object).collect(Collectors.toMap(employee -> employee.getId(), employee -> employee));

        employeeMap.forEach((k, v) -> System.out.println(k + ": " + v.getName()));

        //get distinct

        List<String> distinctDept = employeeList.stream().map(object -> (Employee) object).map(dept -> dept.getDepartment()).distinct().collect(Collectors.toList());

        Comparator<Integer> integerComparator = (a,b)->a-b;

        Set<Employee> employeeSet = employeeList.stream().map(object -> (Employee) object).collect(Collectors.toSet());

//        System.out.println(employeeSet);

        employeeSet.stream().forEach(employee -> System.out.println(employee));

        Map<Integer, Long> groupingBy = employeeList.stream().map(object -> (Employee) object).collect(Collectors.groupingBy(employee -> employee.getId(), Collectors.counting()));

        Map<String, Integer> listToMap = employeeList.stream().map(object -> (Employee) object).collect(Collectors.toMap(employee -> employee.getName(), employee -> employee.getId()));

        //get genders and number of people in each gender

        employeeList.stream().map(object -> (Employee)object).collect(Collectors.groupingBy(employee -> employee.getDepartment(),Collectors.counting())).forEach((k,v)-> System.out.println(k+": "+v));

        //System.out.println(listToMap);

        //get the top 4 paid employees
        List<Employee> employees = employeeList.stream().map(object -> (Employee)object).collect(Collectors.toList());

        Map<String, Double> topSalariedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(4).collect(Collectors.toMap(employee -> employee.getName(), employee -> employee.getSalary()));

        topSalariedEmployees.forEach((k,v)-> System.out.println(k + " : "+v));

        Set<Employee> top4EmployeesSet = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(4).collect(Collectors.toSet());

        Optional<Employee> first = top4EmployeesSet.stream().findFirst();

        Employee employee = first.orElseThrow(() -> new InterruptedException("failed to"));

        List<Stream<String>> collect = employees.stream().map(e -> e.getProjects().stream().map(project -> project.getName())).collect(Collectors.toList());

        Set<String> projectCodesSet = employees.stream().flatMap(e -> e.getProjects().stream()).map(e -> e.getProjectCode()).collect(Collectors.toSet());


        System.out.println(projectCodesSet);
    }
}
