package Array;

public class minSubArray {
    public static void main(String[] args) {
        int[] arr ={1,2,-1,-2,-3,4,5};
        System.out.println(minSubArray(arr));
    }

    public static int minSubArray(int[] nums){
        int minSumEndingHere =0;
        int minSumSoFar = Integer.MAX_VALUE;
        int startIndex =0;
        int endIndex =0;

        for(int i=0;i<nums.length;i++){
            minSumEndingHere =minSumEndingHere+nums[i];
            if(minSumEndingHere>nums[i]){
                minSumEndingHere=nums[i];
                startIndex =i;

            }
            if(minSumEndingHere<minSumSoFar){
                minSumSoFar=minSumEndingHere;
                endIndex=i;
            }

        }
        System.out.println("min sum will be in the range of index: "+startIndex+":"+endIndex);
        return minSumSoFar;
    }
}
