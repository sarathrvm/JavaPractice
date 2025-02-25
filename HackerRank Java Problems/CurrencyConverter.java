import java.io.*;
import java.util.*;
import java.text.*;

public class CurrencyConverter {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        NumberFormat numberFormatUs = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatIn = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat numberFormatCh = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormatFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        Scanner sc = new Scanner(System.in);
        Double inputValue = sc.nextDouble();
        sc.close();
        String indianValue = numberFormatIn.format(inputValue);
        indianValue = "Rs."+ indianValue.substring(1);
        Locale[] availableLocals=Locale.getAvailableLocales();


        System.out.println("US: "+ numberFormatUs.format(inputValue));
        System.out.println("India: "+ indianValue);
        System.out.println("China: "+ numberFormatCh.format(inputValue));
        System.out.println("France: "+ numberFormatFr.format(inputValue));
    }
}
