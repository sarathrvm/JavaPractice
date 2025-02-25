package BinarySearch;

import java.util.Arrays;

public class BS_DistributeCandies_LC1103 {

    public static void main(String[] args) {

        int candies =10;
        int people =3;
        System.out.println(Arrays.toString(distributeCandies(candies,people)));

    }

    public static int[] distributeCandies(int candies, int num_people) {
        int n = num_people;
        int[] arr = new int[n];
        int prevValue = 0;

        while(candies>0){
            for(int i=0;i<n;i++)
            {
                if(candies>prevValue)
                {
                    prevValue=prevValue+1;
                    arr[i]+=prevValue;
                    candies -=prevValue;
                }
                else{
                    arr[i]+=candies;
                    return arr;
                }

            }

        }


        return arr;
    }
}
