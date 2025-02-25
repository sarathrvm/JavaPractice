package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertionSort {

    public static void main(String[] args){
//        List<Integer> integerList = Arrays.asList(1,2,3,4,5,10,21,41,55);
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(10);
        integerList.add(11);
        integerList.add(13);
        integerList.add(14);
        integerList.add(16);
        integerList.add(21);
        integerList.add(25);
        integerList.add(41);
        System.out.println(sortByInsertionSort(integerList,20));
    }

    public static List<Integer> sortByInsertionSort(List<Integer> integerList, int itemNumber){

        integerList.add(itemNumber);
        System.out.println(integerList);
        int n = integerList.size();
        int i = n-1;
        while (i>=1 && integerList.get(i-1)>integerList.get(i)){

            Collections.swap(integerList,i-1,i);

            System.out.println(integerList);
            i--;
        }

        return integerList;
    }




}
