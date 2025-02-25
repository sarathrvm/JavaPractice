import java.io.*;
import java.util.*;

public class intToString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        // int input =100;
//        Integer input1 = (Integer)input;
//        String output = input1.toString();

        String output = Integer.toString(input);



        if(input== Integer.parseInt(output)){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}