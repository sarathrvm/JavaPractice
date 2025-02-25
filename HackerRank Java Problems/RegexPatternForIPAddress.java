import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPatternForIPAddress {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String ipAddress = scanner.nextLine();

        String regexPattern = "";

        /*
        [0-9]{2} means 2 digits each with 0-9
        [1-9][0-9]? ? means its an optional digit, this will cover from 1-99
        \\. means its for escaping .
         */
//        "0|[1-9][0-9]?|1[0-9]{2}|2[0-4][0-9]|25[0-5]|"
        String[] ipValues = ipAddress.split("[[0-255].]+");

        for(String ipvalue: ipValues){
            System.out.println(ipvalue);

        }
        System.out.println(Arrays.toString(ipValues));


    }
}
