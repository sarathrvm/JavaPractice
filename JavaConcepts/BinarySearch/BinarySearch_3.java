package BinarySearch;

import java.util.Scanner;

public class BinarySearch_3 {
    /*
    slope problem where there will be a hiccup in between like [8,9,10,11,0,1,2,3,4].
    here till 11 it is in slope1 and from 0-4 it is in slope2
     */

    public static void main(String[] args){
        int[] input = {6,7,8,9,10,11,0,1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        //calling a non static method here.
        BinarySearch_3 bs =new BinarySearch_3();
        System.out.println(bs.searchTarget(input,target));

    }
    public int searchTarget(int[] input,int target){
        int left=0;
        int right = input.length-1;
        int mid;

        while(left<=right){
            mid = left +(right-left)/2;

            if(input[mid]==target){
                return mid;
            }
            else if(input[mid]>=input[left])
            {
                if(target>=input[left]&&target<input[mid]){
                    right = mid -1;
                }
                else{
                    left=mid+1;
                }

            }
            else{
                if(target>input[mid]&&target<=input[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }

        return -1;

    }
}
