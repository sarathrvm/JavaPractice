import java.util.Scanner;

public class palindromeString {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        boolean isPalidrome = true;

        //String reverseString = new StringBuilder(inputString).reverse().toString();

        for(int i=0;i<=(inputString.length())/2;i++){
            if (inputString.charAt(i)!=inputString.charAt(inputString.length()-1-i)){
                isPalidrome=false;
                break;
            }
        }

        if (isPalidrome){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

//        if (inputString.equals(reverseString)){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }
    }
}
