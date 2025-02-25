package Sorting;

import java.util.Arrays;

public class MergeSort_LC179 {

    public static void main(String[] args) {
        int[] intArr = {9,5,34,0,15,25};

        System.out.println(Arrays.toString(intArr));
        divide(intArr,0,intArr.length-1);
        System.out.println(Arrays.toString(intArr));

        StringBuilder result = new StringBuilder();


        for(int n=0;n<intArr.length;n++){
            result=result.append(intArr[n]);

        }

        System.out.println(result.toString());


    }

    public static void divide(int[] nums, int low, int high){
        if(low>=high) return;

        int mid = low +(high-low)/2;

        divide(nums,low,mid);
        divide(nums,mid+1,high);
        merge(nums,low,mid,high);
    }


    public static void merge(int[] nums, int low, int mid, int high){
        int[] mergedArray = new int[high-low+1];
        int k=0;
        int indx1=low;
        int indx2 =mid+1;

        while(indx1<=mid && indx2<=high){
            if(Long.parseLong(nums[indx1]+""+nums[indx2])>Long.parseLong(nums[indx2]+""+nums[indx1])){
                mergedArray[k++]=nums[indx1++];
            }
            else{
                mergedArray[k++]=nums[indx2++];
            }
        }

        while(indx1<=mid){
            mergedArray[k++]=nums[indx1++];
        }

        while (indx2<=high){
            mergedArray[k++]=nums[indx2++];
        }


        for(k=0;k<mergedArray.length;k++){
            nums[low++]=mergedArray[k];
        }

    }


}
