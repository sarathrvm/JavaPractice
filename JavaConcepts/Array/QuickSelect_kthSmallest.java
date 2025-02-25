package Array;

public class QuickSelect_kthSmallest {
    public static void main(String[] args) {

        int[] arr ={1,2,2,5,6,2,3,1,1,2,4,9};
        System.out.println(findKthsmallest(arr,2));


    }

    public static int findKthsmallest(int[] nums, int k) {

        if(nums.length==1){
            return nums[0];
        }


        int pivot=findPivotElement(nums,0,nums.length-1);

        while((pivot)!=k){

            if(pivot>k){

                pivot = findPivotElement(nums,0,pivot-1);

            }
            else{
                pivot = findPivotElement(nums,pivot+1,nums.length-1);
            }

        }

        return nums[pivot-1];





    }

    public static int findPivotElement(int[] nums,int low, int high){
        int i=low;
        int j=high;
        int pivot= j;

        while(i<j){
            if(nums[i]<=nums[pivot]){
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
