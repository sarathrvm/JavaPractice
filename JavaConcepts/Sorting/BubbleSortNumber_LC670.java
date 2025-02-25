package Sorting;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSortNumber_LC670 {

    public static void main(String[] args){
        int num=67829;

        int[] numArr= String.valueOf(num)
                .chars()
                .map(c ->c-'0')
                .toArray();




        System.out.println(Arrays.toString(numArr));
        bubbleSortMax(numArr);
        System.out.println(Arrays.toString(numArr));
        int result =0;
        for(int mynum: numArr){
             result =(result*10)+mynum;
        }

        String result1 = String.valueOf(result);


        System.out.println(result1);
    }


    public static void bubbleSortMax(int[] nums){
        int n=nums.length;

        int maxIndex = 0;
        for(int i=0;i<n;i++){
            maxIndex=i;
            for(int j=i;j<n;j++){
                if(nums[j]>nums[maxIndex]){
                    maxIndex=j;
                }
            }

            if(maxIndex!=i){
               nums[i]=nums[i]^nums[maxIndex];
               nums[maxIndex]=nums[i]^nums[maxIndex];
               nums[i]=nums[i]^nums[maxIndex];
                break;
            }



        }

    }
}
