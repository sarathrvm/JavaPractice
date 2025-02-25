import java.util.Arrays;
import java.util.Scanner;

public class Anagaram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputString1 = scanner.nextLine();
        String inputString2 = scanner.next();
        int[] string1 = new int[26];
        int[] string2 = new int[26];
        char temp,temp2;
        if(inputString1.length()==inputString2.length()){
            for(int i=0;i<inputString1.length();i++){
                temp = inputString1.charAt(i);
                temp2 = inputString2.charAt(i);
                if(temp>='A'&& temp<='Z'){
                    string1[temp-'A']++;
                }
                else if((temp>='a'&& temp<='z')){
                    string1[temp-'a']++;
                }
                if(temp2>='A'&& temp2<='Z'){
                    string2[temp2-'A']++;
                }
                else if((temp2>='a'&& temp2<='z')){
                    string2[temp2-'a']++;
                }
            }
            if(Arrays.equals(string1, string2)){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
        else{
            System.out.println("Not Anagram");
        }

    }
}
