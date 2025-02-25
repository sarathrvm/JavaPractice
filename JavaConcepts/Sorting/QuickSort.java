package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {1,2,3,2,6,1,8,3};
        mergeSort(intArray,0,intArray.length-1);
        System.out.println(Arrays.toString(intArray));

    }

    public static void mergeSort(int[] nums, int low, int high){
        if(low>= high) return;

        int i=low;
        int j=high;
        int p=high;

        while(i<j){
            if(nums[i]<=nums[p]){
                i++;
            }
            else{
                j--;
                if(nums[i]!=nums[j]){
                    nums[i]=nums[i]^nums[j];
                    nums[j]=nums[i]^nums[j];
                    nums[i]=nums[i]^nums[j];
                }

            }
        }

        if(nums[i]!=nums[p]){
            nums[i]=nums[i]^nums[p];
            nums[p]=nums[i]^nums[p];
            nums[i]=nums[i]^nums[p];
        }



        mergeSort(nums,low,i-1);
        mergeSort(nums,i+1,high);
    }
}
