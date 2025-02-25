package Array;

import java.util.Arrays;

public class quickSort_colors_LC75 {

    public static void main(String[] args) {

        int[] arr={2,0,1};
        sortColors(arr);

        System.out.println(Arrays.toString(arr));


    }
    public static void sortColors(int[] nums) {
        sortAscendingOrder(nums,0,nums.length-1);
        //System.out.println(Arrays.toString(nums));

    }

    public static void sortAscendingOrder(int[] nums,int low, int high){
        if(low>=high) return;

        int pivot = high;
        int i =low;
        int j=high;

        while(low<high){
            if(nums[low]<=nums[pivot]){
                low++;
            }
            else{
                high--;
                if(nums[low]!=nums[high]){
                    nums[low]=nums[low]^nums[high];
                    nums[high]=nums[low]^nums[high];
                    nums[low]=nums[low]^nums[high];
                }
            }
        }
        if(nums[low]!=nums[pivot]){
            nums[low]=nums[low]^nums[pivot];
            nums[pivot]=nums[low]^nums[pivot];
            nums[low]=nums[low]^nums[pivot];
        }
        pivot =low;

        if(pivot!=i){
            sortAscendingOrder(nums,i,pivot-1);
        }
        if(pivot!=j){
            sortAscendingOrder(nums,pivot+1,j);
        }



    }
}
