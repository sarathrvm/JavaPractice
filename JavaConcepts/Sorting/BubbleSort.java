package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(1);
        integerList.add(25);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(21);

        System.out.println(sortByBubbleSort(integerList));


    }

    public static List<Integer> sortByBubbleSort(List<Integer> integerList){

        boolean swapped = false;
        System.out.println(integerList);

        for(int i=0;i<integerList.size()-1;i++){
            swapped = false;
            for(int j=0;j<integerList.size()-1-i;j++){
                if(integerList.get(j)>integerList.get(j+1)){
                    Collections.swap(integerList,j,j+1);
                    System.out.println(integerList);
                    swapped=true;
                }
            }
            System.out.println(swapped);
            if(!swapped){
                break;
            }
        }

        return integerList;

    }
}
