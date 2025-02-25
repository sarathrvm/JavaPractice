import java.util.*;
import java.math.BigInteger;

public class JavadataTypes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        BigInteger byteMin = BigInteger.valueOf(-128);
        BigInteger byteMax = BigInteger.valueOf(127);
        BigInteger shortMin = BigInteger.valueOf(-32768);
        BigInteger shortMax = BigInteger.valueOf(32767);
        BigInteger intMin = BigInteger.valueOf((long)Integer.MIN_VALUE);
        BigInteger intMax = BigInteger.valueOf((long)Integer.MAX_VALUE);
        BigInteger longMin = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger longMax = BigInteger.valueOf(Long.MAX_VALUE);


        for(int i=1;i<=testCases;i++){
            BigInteger givenValue = sc.nextBigInteger();
            if((givenValue.compareTo(longMin)<0) && (givenValue.compareTo(longMax)>0)){
                System.out.println(givenValue +" can't be fitted anywhere.");
            }
            else{
                System.out.println(givenValue +" can be fitted in:");
                if((givenValue.compareTo(byteMin)>=0) && (givenValue.compareTo(byteMax)<=0)){
                    System.out.println("* byte");
                }
                if((givenValue.compareTo(shortMin)>=0) && (givenValue.compareTo(shortMax)<=0)){
                    System.out.println("* short");
                }
                if(givenValue.compareTo(intMin)>=0 && givenValue.compareTo(intMax)<=0){
                    System.out.println("* int");
                }
                if(givenValue.compareTo(longMin)>=0 && givenValue.compareTo(longMax)<=0){
                    System.out.println("* long");
                }

            }


        }
    }
}