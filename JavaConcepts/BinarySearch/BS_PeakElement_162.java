package BinarySearch;

public class BS_PeakElement_162 {

    public static void main(String[] args) {
        int[] nums= {1,2,1,2,1};

        System.out.println(findPeakElement(nums));

    }

    public static int findPeakElement(int[] nums) {

        int low =0;
        int high =nums.length-1;
        int mid;
        if(nums.length==0){
            return -1;
        }
        else if(nums.length==1){
            return 0;
        }
        else if(nums.length==2){
            if(nums[0]>nums[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
        else if(nums[high]>nums[high-1]){
            return high;
        }
        else if(nums[0]>nums[1]){
            return 0;
        }

        low=low+1;
        high=high-1;

        while(low<=high){
            mid = low +(high-low)/2;

            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]>nums[mid-1]){
                low =mid+1;
            }
            else {
                high=mid-1;
            }

        }
        return -1;

    }
}
