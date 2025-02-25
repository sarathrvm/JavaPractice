package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamImpl {
    public static void main(String[] args) {

        List<Integer> salaryList = new ArrayList<>();

        salaryList.add(2000);
        salaryList.add(1000);
        salaryList.add(5000);
        salaryList.add(10000);
        salaryList.add(3000);

        Long count = salaryList.stream().filter(salary->salary>=3000).count();

        System.out.println(count);
    }
}
