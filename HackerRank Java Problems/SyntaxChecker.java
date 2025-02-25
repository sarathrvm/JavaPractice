import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //use this to avoid getting empty value in next string scanner
        int inputs = Integer.parseInt(scanner.nextLine());

        for(int i=1;i<=inputs;i++){
            String s = scanner.nextLine();

            try {
                Pattern regexPattern= Pattern.compile(s);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException exception){
                System.out.println("Invalid");
            }

        }


    }
}
