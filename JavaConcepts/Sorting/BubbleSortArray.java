package Sorting;

import java.util.Arrays;

public class BubbleSortArray {

    public static void main(String[] args){

        int[] nums = {2,3,1};

        bubbleSort(nums);

        System.out.println(Arrays.toString(nums));


    }

    public static void bubbleSort(int[] nums){
        int n = nums.length;
        boolean swapped;

        //here we can keep n-1 because by the time n-1th iteration happens the array is already sorted
        for(int i=0;i<n-1;i++){
            swapped=false;

            for(int j=0;j<n-i-1;j++){

                if(nums[j]>nums[j+1]){
                    nums[j]= nums[j]^nums[j+1];
                    nums[j+1]= nums[j]^nums[j+1];
                    nums[j]=nums[j]^nums[j+1];
                    swapped=true;
                }

            }
            if(!swapped){
                break;
            }
        }


    }
}
