package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamImpl2 {
    public static void main(String[] args) {

        List<List<String>> listOfStrings = Arrays.asList(Arrays.asList("Hello","How","are"),Arrays.asList("you","i","love","java"),Arrays.asList("what","about","you"));


        //when we have complex collections like list of lists.. we need to use flat map to get them

       Stream<String> stringStream = listOfStrings.stream()
                .flatMap( (List<String> list)->list.stream().filter(word->word.length()>2).map(word->word.toLowerCase()));

        //System.out.println(stringStream.collect(Collectors.joining(" ")));
        System.out.println(stringStream.collect(Collectors.toList()));


        //usage of IntStream

        List<String> integerList = Arrays.asList("1","2","3","4","5","6","7");

        IntStream numberStream =integerList.stream().mapToInt((String number)->Integer.parseInt(number));

        int[] numberArray = numberStream.toArray();

        System.out.println(Arrays.toString(numberArray));


        int[] numbers=Arrays.stream(numberArray).filter((int number)->number>1).map((int number)->number+5).toArray();

        System.out.println(Arrays.toString(numbers));
    }
}
