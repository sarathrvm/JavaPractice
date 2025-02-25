package BinarySearch;

public class BS_FindTargetInRotatedSortedArray_33 {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8};
        int target =8;

        System.out.println(search(arr,target));

    }

    public static int search(int[] nums, int target) {

        int low =0;
        int high=nums.length-1;
        int mid;

        while(low<=high){
            mid = low +(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[low]){
                if(target<=nums[mid]&&target>=nums[low]){
                    high = mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>=nums[mid]&&target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }

        return -1;


    }
}
