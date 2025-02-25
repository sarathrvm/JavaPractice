import java.io.*;
import java.util.*;
//added extra nextLine to move the cursor to next line.
// whenever we read int or double the cursor doesn't move to the next line immediately
// and return empty string when we do nextline()
public class StdInAndStdOut {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int myInt = sc.nextInt();
        double myDouble = sc.nextDouble();
        sc.nextLine();
        String myString = sc.nextLine();
        sc.close();

        System.out.println("String: "+ myString);
        System.out.println("Double: "+ myDouble);
        System.out.println("Int: "+ myInt);
    }
}