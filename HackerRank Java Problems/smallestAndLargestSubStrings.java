import java.util.Scanner;

public class smallestAndLargestSubStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int lengthOfSubString = scanner.nextInt();

        String smallest = inputString.substring(0,lengthOfSubString);
        String largest = inputString.substring(0,lengthOfSubString);

        for(int i=0;i<=(inputString.length()-lengthOfSubString);i++){
            if (inputString.substring(i,lengthOfSubString+i).compareTo(smallest)<0){
                smallest = inputString.substring(i,lengthOfSubString+i);
            }
            else if (inputString.substring(i,lengthOfSubString+i).compareTo(largest)>0){
                largest = inputString.substring(i,lengthOfSubString+i);
            }
        }

        System.out.println("smallest is: "+smallest+"\n largest is: "+largest);
    }
}
