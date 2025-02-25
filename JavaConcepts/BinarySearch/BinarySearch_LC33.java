package BinarySearch;

public class BinarySearch_LC33 {
    public static void main(String[] args){

        int[] nums = {5,1,3};
        int target = 5;

        System.out.println(searchTargetInRotated(nums,target));

    }
    private static int searchTargetInRotated(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int mid;

        while(low<=high){
            mid = low +(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else{
                if(nums[mid]>=nums[low]){
                    if(target>=nums[low]&& target<nums[mid]){
                        high = mid-1;
                    }
                    else{
                        low = mid+1;
                    }

                }
                else{
                    if(target>nums[mid]&&target<=nums[high]){
                        low = mid+1;
                    }
                    else{
                        high = mid-1;
                    }
                }
            }
        }

        return -1;

    }
}
