package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class QuickSelect_kthLargest_LC215 {
    public static void main(String[] args) {

        int[] arr ={3,2,1,5,6,4};
        System.out.println(findKthLargest(arr,2));


    }

    public static int findKthLargest(int[] nums, int k) {

        if(nums.length==1){
            return nums[0];
        }


        int pivot=findPivotElement(nums,0,nums.length-1);

        while((pivot+1)!=k){

            if((pivot+1)>k){

                pivot = findPivotElement(nums,0,pivot-1);

            }
            else{
                pivot = findPivotElement(nums,pivot+1,nums.length-1);
            }

        }

        return nums[pivot];





    }

    public static int findPivotElement(int[] nums,int low, int high){
        int i=low;
        int j=high;
        int pivot= j;

        while(i!=j){
            if(nums[i]>=nums[pivot]){
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
        if(nums[i]!=nums[pivot]){
            nums[i]=nums[i]^nums[pivot];
            nums[pivot]=nums[i]^nums[pivot];
            nums[i]=nums[i]^nums[pivot];
        }

        return i;
    }



}
