package BinarySearch;

import java.util.Arrays;

public class BS_34 {

    public static void main(String[] args) {

        int[] nums = {3,4,5,1,2};
        int target = 1;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }


        public static int[] searchRange(int[] nums, int target) {
            int minValue = Integer.MIN_VALUE;
            int maxValue = Integer.MAX_VALUE;
            int low =0;
            int high =nums.length-1;
            int mid;
            int[] minMax = new int[2];

            if((nums.length==0)||(nums.length==1 && nums[0]!=target)){
                minMax[0]=-1;
                minMax[1]=-1;
                return minMax;
            }

            if(nums.length==1 && nums[0]==target){
                minMax[0]=0;
                minMax[1]=0;
                return minMax;
            }



            while(low<=high){
                mid=low +(high-low)/2;

                if(nums[mid]==target){
                    minValue =mid;
                    high=mid-1;
                }
                else{
                    if(nums[mid]<target){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
            }

            low=0;
            high=nums.length-1;

            while(low<=high){
                mid=low+(high-low)/2;

                if(nums[mid]==target){
                    maxValue = mid;
                    low =mid+1;
                }
                else{
                    if(nums[mid]<target){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }


            }

            if(minValue==Integer.MIN_VALUE){
                minValue=-1;
            }
            if(maxValue==Integer.MAX_VALUE){
                maxValue=-1;
            }

            minMax[0]=minValue;
            minMax[1]=maxValue;

            return minMax;

        }
}
