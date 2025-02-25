package ProblemSolving_23rdDec;

import java.util.Scanner;

public class ReverseString_JavaBrains {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder reversed= new StringBuilder();

        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse());


        for(int i=0;i<sb.length();i++){

            reversed.append(sb.charAt(i));

        }

        System.out.println(reversed);





    }
}
