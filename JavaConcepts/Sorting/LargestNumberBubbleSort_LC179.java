package Sorting;

import java.math.BigInteger;
import java.util.Arrays;

public class LargestNumberBubbleSort_LC179 {

    public static void main(String[] args) {

        int[] nums ={3,30,34,5,9};

        System.out.println(Arrays.toString(nums));
        LargestNumberBubbleSort_LC179 obj = new LargestNumberBubbleSort_LC179();
        System.out.println(obj.largestNumber(nums));

//        Arrays.sort(nums,(a,b)->(b+Integer.toString((Integer) a)).compareTo(a+Integer.toString((Integer) b)));


    }

    public String largestNumber(int[] nums) {


        int numslength = nums.length;
        boolean swapped = false;


        for(int i=0;i<numslength;i++){
            swapped = false;

            for(int j=numslength-1;j>i;j--){

//                BigInteger bigNum1 =new BigInteger(nums[j] + Integer.toString(nums[j - 1]));
//                BigInteger bigNum2 = new BigInteger(nums[j - 1] + Integer.toString(nums[j]));
//
//
//                if(bigNum1.compareTo(bigNum2)>0){
//                    nums[j]=nums[j]^nums[j-1];
//                    nums[j-1]=nums[j]^nums[j-1];
//                    nums[j]= nums[j]^nums[j-1];
//                    swapped=true;
//                }

                if(Long.parseLong(nums[j] + Integer.toString(nums[j - 1]))>Long.parseLong(nums[j-1] + Integer.toString(nums[j]))){
                    nums[j]=nums[j]^nums[j-1];
                    nums[j-1]=nums[j]^nums[j-1];
                    nums[j]= nums[j]^nums[j-1];
                    swapped=true;
                }

            }

            if(!swapped){
                break;
            }
        }

        if(nums[0]==0){
            return "0";
        }
        String largestNumber="";

        for(int k:nums){
            largestNumber = largestNumber+k;
        }


        return largestNumber;
    }
}
