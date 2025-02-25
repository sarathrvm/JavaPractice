import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Loops2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int queryCount = sc.nextInt();
        for(int i=1;i<=queryCount;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            BigInteger bigInteger= sc.nextBigInteger();

            int sum = a + b;
            System.out.print(sum+" ");

            for(int j=1;j<n;j++){
                sum += (int) ((Math.pow(2,j))*b);
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}