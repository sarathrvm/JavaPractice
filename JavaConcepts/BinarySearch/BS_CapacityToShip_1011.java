package BinarySearch;

import java.util.Arrays;
import java.util.OptionalInt;

public class BS_CapacityToShip_1011 {

    public static void main(String[] args) {

        int[] arr = {3,2,2,4,1,4};

        int sum = Arrays.stream(arr).sum();

        System.out.println(sum);
        System.out.println(shipWithinDays(arr,3));
    }

    public static int shipWithinDays(int[] weights, int days) {

        int length = weights.length-1;

        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        int mid=low;
        int ans = Integer.MAX_VALUE;

        while(low<=high){
            mid = low +(high-low)/2;
            if(canShip(weights,mid,days)){
                high = mid-1;
                ans=Math.min(ans,mid);
            }
            else{
                low = mid+1;
            }

        }

        return mid;

    }

    public static boolean canShip(int[] weights, int mid,int days){
        int weightsSum=0;
        for(int i=0;i<weights.length;i++){
            weightsSum +=weights[i];
            if(weightsSum>mid){
                weightsSum = weights[i];
                days--;
            }
            if(days<0){
                return false;
            }

        }
        if(weightsSum>0 && days ==0){
            return false;
        }
        else{
            return true;
        }
    }
}
