import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        if(s.isEmpty()){
            System.out.println(0);
        }
        else{
            String[] tokens = s.split("[ !,?._'@]+");
//        System.out.println(Arrays.toString(tokens));
            System.out.println(tokens.length);
            for(int i=0;i< tokens.length;i++){
                System.out.println(tokens[i]);
            }
        }

    }
}