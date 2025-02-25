import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

    public static List<String> getSongsList(){
        List<String> songsList = new ArrayList<>();

        songsList.add("abc");
        songsList.add("abcd");
        songsList.add("abcde");
        songsList.add("abcdef");
        songsList.add("abcdefg");
        songsList.add("abchig");
        songsList.add("abcafkj");


        return songsList;



    }

    public static void main(String[] args){
        SortArrayList sortArrayList = new SortArrayList();
        sortArrayList.go();


    }

    public void go(){
        List<String> songsList = new ArrayList<>();
        songsList =SortArrayList.getSongsList();

        System.out.println(songsList);

    }
}
