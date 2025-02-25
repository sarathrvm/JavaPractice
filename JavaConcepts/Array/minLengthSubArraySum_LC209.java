package Array;

public class minLengthSubArraySum_LC209 {
    public static void main(String[] args) {

//        this works only for positive values

        int[] arr ={1,2,3,4,5};
        System.out.println(minSubArrayLen(11,arr));

    }

    public static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int currentLength=0;
        int sumSoFar = 0;

        int left =0;
        int right =0;
/*
here we need to follow two pointer approach.
step1. we need to move the right pointer towards right until it is >=target
step2. we need to move the left pointer towards right until the sum is less than the target.
when we are moving we need to reduce the value at left index from the sum value.
when we get the sum value is less than target, then we need to take the length as (right index - left index +1)+1

here when the right index is at 5 and right index at 3 when we subtract we get 2, but actually there are 3 values, 3,4,5 so we are adding 1

since the boundary sum is less than target, we are adding the previous value as well which is on the left, so we are adding another 1 as well

so finally R-L+1+1
 */


        while(right<nums.length){

            sumSoFar=sumSoFar+nums[right];
            if(sumSoFar>=target){
                sumSoFar=sumSoFar-nums[left];
                left=left+1;
                while(sumSoFar>=target){
                    sumSoFar=sumSoFar-nums[left];
                    left=left+1;
                }

                currentLength=(right-left+1)+1;
                result = Math.min(result,currentLength);

            }

            right++;


        }

        if(result!=Integer.MAX_VALUE){
            return result;
        }
        else{
            return 0;
        }



    }
}
