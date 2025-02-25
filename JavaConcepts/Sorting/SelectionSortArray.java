package Sorting;

import java.util.Arrays;

public class SelectionSortArray {

    public static void main(String[] args){

        int[] arr ={2,7,1,0};

        SelectionSortArray obj=new SelectionSortArray();
        obj.selectionSort(arr);
        System.out.println(Arrays.toString(arr));



    }

    public void selectionSort(int[] nums){

        int minIndex =0;

        for(int i=0;i<nums.length;i++){
            minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[minIndex]){
                    minIndex=j;
                }
            }
            int k = nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=k;
        }

        System.out.println(Arrays.toString(nums));
    }


}


