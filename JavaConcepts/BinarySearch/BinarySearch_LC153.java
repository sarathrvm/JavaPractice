package BinarySearch;

public class BinarySearch_LC153 {

    /*
    find the minimum element in a sorted Array using binary partition
     */

    public static void main(String[] args) {

        int[] input = {4,5,6,7,1,2};
        System.out.println(findSearchElement(input));

    }

    public static int findSearchElement(int[] inputArray) {

        int n=inputArray.length;
        int low =0;
        int high = n-1;
        int mid;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            mid = low +((high-low)/2);

            if(inputArray[mid]>=inputArray[low]){
                ans = Math.min(ans,inputArray[low]);
                low=mid+1;
            }
            else{
                ans = Math.min(ans,inputArray[mid]);
                high = mid-1;
            }

        }
        if(ans!=Integer.MAX_VALUE){
            return ans;
        }
        else{
            return -1;
        }
        
    }

}
