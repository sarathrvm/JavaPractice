package ProblemSolving_23rdDec;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum_JavaBrains {
    public static void main(String[] args) {

        //check if the sum of any two integers is equal to target

        Scanner scanner = new Scanner(System.in);

        int[] intArray = {1,2,3,4,5,6};

        int target = 9;

        Map<Integer,Integer> hashMap = new HashMap<>();
        int delta;
        boolean targetFound = false;

        for(int i=0;i<intArray.length;i++){
            delta= target-intArray[i];

            if(hashMap.containsKey(delta)){
//                hashMap.values().stream().filter(()->)

                System.out.println(hashMap.get(delta)+","+i);
                targetFound = true;
                break;
            }
            else{
                hashMap.put(intArray[i],i);
            }

        }

        if(!targetFound){
            System.out.println("target is not found after adding the input values in the given input");
        }







    }
}
