package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args){

        List<Integer> inputList = new ArrayList<>(Arrays.asList(42,23,1,2,3,10,41,21,0,3,2,22));

        //declaring the arraylist from Arrays.

        inputList = bySelectionSort(inputList);

        System.out.println(inputList);


    }

    public static List<Integer> bySelectionSort(List<Integer> input){
        int count = input.size();
        int minIndex;

        for(int i=0;i<count;i++){
            minIndex =i;

            for(int j=i+1;j<count;j++){
                if(input.get(j) < input.get(minIndex)){
                    minIndex=j;
                }
            }

            Collections.swap(input,i,minIndex);
        }

        return input;
    }
}
