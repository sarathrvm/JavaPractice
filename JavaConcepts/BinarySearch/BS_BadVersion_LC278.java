package BinarySearch;

import java.math.BigInteger;

public class BS_BadVersion_LC278 {

    public static void main(String[] args) {

       int age = 12;
       long salary = 20000L;

       long maxValue = Long.MAX_VALUE;

       long mid = (long)age;

       mid = maxValue;





    }


    public static int firstBadVersion(int n) {

        long low =1;
        long high =n;
        long mid;
        long result= Long.MAX_VALUE;

        while(low<=high){
            mid = (low + (high-low)/2);

            if(isBadVersion((int)mid)){
                result =mid;
                high =mid-1;
            }
            else{
                low = mid+1;
            }
        }

        if(result != Long.MAX_VALUE){
            return (int)result;
        }
        else{
            return -1;
        }




    }

    public static boolean isBadVersion(int value){
        return true;
    }

}
