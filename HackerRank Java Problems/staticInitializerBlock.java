import java.io.*;
import java.util.*;

public class staticInitializerBlock {

     static int breadth;
     static int height;


    static {
        Scanner sc = new Scanner(System.in);
        breadth = sc.nextInt();
        height = sc.nextInt();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        if(breadth>0 && height>0 ){
            System.out.println(breadth*height);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}