package JavaTechieInterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FailFastIssue {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("abc");
        stringList.add("def");

        ListIterator<String> listIterator = stringList.listIterator();

        while (listIterator.hasNext()){
            String element = listIterator.next();
            System.out.println(element);
            stringList.add("ghi");
        }

        System.out.println(stringList);

    }
}
