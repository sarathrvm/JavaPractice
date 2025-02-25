package Array;

public class maxSubArray_LC53 {
    public static void main(String[] args) {

//        Given an integer array nums, find the
//subarray
// with the largest sum, and return its sum.
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(arr));



    }

    public static int maxSubArray(int[] nums) {

        int maxEndingHere = 0;
        int maxSoFar =Integer.MIN_VALUE;
        int startIndex =0;
        int lastIndex =0;


        for(int i=0;i<nums.length;i++){
            maxEndingHere = maxEndingHere+nums[i];
            if(maxEndingHere<nums[i]){
                maxEndingHere=nums[i];
                startIndex=i;
            }

            if(maxSoFar<maxEndingHere){
                maxSoFar=maxEndingHere;
                lastIndex = i;
            }

        }


        System.out.println(startIndex+":"+lastIndex);
        return maxSoFar;




    }
}
