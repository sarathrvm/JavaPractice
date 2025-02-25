package ProblemSolving_23rdDec;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstInList {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(5);
        integerList.add(7);
        integerList.add(8);

        int firstValue = integerList.stream().findFirst().orElse(null);

        System.out.println(firstValue);

        //total number of elements in the list using streams

        long totalElements = integerList.stream().count();

        //find if the given number is even or odd

        integerList.stream().filter(a->a%2==0).forEach(a-> System.out.println(a));
        integerList.stream().filter(a->a%2!=0).forEach(System.out::println);

        //find out all the numbers starting with 5

        integerList.stream().filter(a->a.toString().startsWith("5")).forEach(a-> System.out.println(a));

        //find duplicate elements in the given integer list

        Set<Integer> integerSet = new HashSet<>();
        integerList.stream().filter(a-> !integerSet.add(a)).forEach(a-> System.out.println(a));


//        find the min and max values present in the integer list

       Optional<Integer> maxValue= integerList.stream().max((a,b)->a.compareTo(b));
       Optional<Integer> minValue = integerList.stream().min((a,b)->a.compareTo(b));

        System.out.println("min: "+minValue.orElse(null)+" max: "+maxValue.orElse(null));

        //sort all integers in the list

        List<Integer> sortedIntegerList = integerList.stream().sorted((a,b)->a.compareTo(b)).toList();
        System.out.println(sortedIntegerList);
        sortedIntegerList = integerList.stream().sorted((a,b)->b.compareTo(a)).toList();

        System.out.println(sortedIntegerList);

        //check if there is a duplicate element or not in a list

        if(integerList.stream().distinct().count()!=integerList.stream().count()){
            System.out.println("contains duplicate");
        }

        //square the numbers in the list and filter those with greater than 50

        integerList.stream().map(a->a*a).filter(a->a>20).forEach(a-> System.out.println(a));

        Collections.sort(integerList);

       Stream<Integer> streamList = integerList.stream();
        System.out.println(streamList);

        //convert to uppercase

        List<String> stringList= new ArrayList<>();

        stringList.add("Sarath");
        stringList.add("KUMAr");
        stringList.add("reVuRU");

        stringList = stringList.stream().map(a->a.toLowerCase()).toList();

        System.out.println(stringList);

        int[] intArray = {1,2,4,2,3};

       Arrays.stream(intArray).max().ifPresent(a-> System.out.println(a));

       //write a program to concatenate two streams

        Stream<Integer> listStream = integerList.stream();

        Stream<Integer> arrayStream = Arrays.stream(intArray).boxed();

        List<Integer> concatList=Stream.concat(listStream,arrayStream).toList();


        //write a program to print random numbers using stream

        Stream.builder().add(Math.random()).build();

        Random random = new Random();

       List<Integer> randomNumberList = Stream.generate(()->random.nextInt()).limit(10).toList();

        System.out.println(randomNumberList);

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        System.out.println(dateTimeFormatter.format(localDateTime));

        integerList.isEmpty();

        List<String> list = Arrays.asList("Sarath","Kumar","RVM");


        Optional<List<String>> optionalStrings = Optional.ofNullable(list);

        optionalStrings.ifPresent(i->i.stream().forEach(a-> System.out.println(a)));


        //given an array, find the occurrances of target number

        int[] intArr = {1,2,3,4,5,3,4,5,2};

        long count =Arrays.stream(intArray).filter(i->i==2).count();

        if(count>0){
            System.out.println("given number is occurred: "+count+" times");
        }

        //convert the list into Map

        List<String> wordsList = Arrays.asList("Sarath","Revuru","Daivik","Revuru");

        Map<String,Long> mapString =wordsList.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));


        mapString.entrySet().stream().filter(a->a.getValue()>1).forEach(e-> System.out.println("for "+e.getKey()+" : "+e.getValue()));

        //get sum of salaries of all the employees

        List<Employee> employeeList = new ArrayList<>();
//        Employee employee1 = new Employee(30.00,"Sarath",20);
//        Employee employee2 = new Employee(40.00,"Kumar");
//        employeeList.add(employee1);
//        employeeList.add(employee2);

        double sumOfSalary= employeeList.stream().mapToDouble(a->a.getSalary()).sum();

        System.out.println(sumOfSalary);

        String wordsString = "I am Sarath";

//       Map<char,Integer> charMap = wordsString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity));

        System.out.println(wordsString.chars().count());








    }
}
