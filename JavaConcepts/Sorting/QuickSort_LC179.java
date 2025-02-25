package Sorting;

import java.util.Arrays;

public class QuickSort_LC179 {
    public static void main(String[] args) {

        int[] nums ={3,30,34,5,9};

        System.out.println(Arrays.toString(nums));
        quickSort(nums,0,nums.length-1);
        StringBuilder sb = new StringBuilder();
        for(int num: nums){
            sb.append(num);
        }
        System.out.println(sb);

    }

    public static void quickSort(int[] nums, int low, int high){
        if(low>=high) return;

        int i=low;
        int j=high;
        int p=high;

        while(i<j){
            if(Long.parseLong(nums[i]+String.valueOf(nums[p]))>=Long.parseLong(nums[p]+String.valueOf(nums[i]))){
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

        quickSort(nums,low,i-1);
        quickSort(nums,i+1,high);


    }
}
