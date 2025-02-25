import java.io.*;
import java.util.*;

public class Formatting {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        int int1 = sc.nextInt();
        sc.nextLine();
        String string2 = sc.next();
        int int2 = sc.nextInt();
        sc.nextLine();
        String string3 = sc.next();
        int int3 = sc.nextInt();
        sc.close();

        System.out.println("================================");
        System.out.printf("%-15s%03d %n",string1,int1);
        System.out.printf("%-15s%03d %n",string2,int2);
        System.out.printf("%-15s%03d %n",string3,int3);
        System.out.println("================================");

    }
}
