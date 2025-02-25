package BinarySearch;

public class BS_FindMinInSlope_153 {

    public static void main(String[] args){

        int[] intArr ={6,7,8,9,10,0,1,2,3,4,5};

        System.out.println(findMinValue(intArr));
    }

    public static int findMinValue(int[] nums){
        int low = 0;
        int high = nums.length-1;
        int mid;
        int ans = Integer.MAX_VALUE;

        while(low<=high) {
            mid = low + (high-low)/2;

            if(nums[mid]>=nums[low]){
               ans=Math.min(nums[low],ans);
               low=mid+1;

            }
            else{
                ans=Math.min(nums[mid],ans);
                high =mid-1;
            }
        }

        return ans;
    }



}
