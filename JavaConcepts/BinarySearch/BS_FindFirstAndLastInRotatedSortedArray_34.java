package BinarySearch;

import java.util.Arrays;

public class BS_FindFirstAndLastInRotatedSortedArray_34 {

    public static void main(String[] args) {

        int[] arr ={5,6,7,8,8,8,9,1,2,3,4,4,4};
        int target =8;

        System.out.println(Arrays.toString(findTarget(arr,target)));
    }

    public static int[] findTarget(int[] arr, int num){
        int low = 0;
        int high =arr.length-1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        int mid;

        while(low<=high){
            mid =low + (high-low)/2;

            if(num==arr[mid]){
                min =mid;
                high =mid-1;
            }
            else if(arr[mid]>=arr[low]){
                if(num>=arr[low]&& num<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low =mid+1;
                }
            }
            else{
                if(num>=arr[mid]&&num<=arr[high]){
                    low=mid+1;
                }
                else{
                    high =mid-1;
                }
            }
        }

        low = 0;
        high =arr.length-1;


        while(low<=high){
            mid=low+(high-low)/2;

            if(num==arr[mid]){
                max=mid;
                low=mid+1;
            }
            else if(arr[mid]>=arr[low]){
                if(num>=arr[low]&&num<=arr[mid]){
                    high = mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(num>=arr[mid]&&num<arr[high]){
                    low =mid+1;
                }
                else{
                    high =mid-1;
                }
            }

        }

        int[] minMax = new int[2];
        minMax[0]=min;
        minMax[1]=max;

        return minMax;
    }

}
