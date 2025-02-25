import java.util.*;

public class SortSongObjects {

    public static List<Songs> getSongsList(){
        List<Songs> songsList = new ArrayList<>();

        songsList.add(new Songs("hello","sarath","123"));
        songsList.add(new Songs("hello","sarath","123"));
        songsList.add(new Songs("bye","sarath","123"));
        songsList.add(new Songs("bye","sarath","123"));
        songsList.add(new Songs("jake","sarath","123"));
        songsList.add(new Songs("jake","sarath","123"));

        //songsList.sort((one,two)->one.getTitle().compareTo(two.getTitle()));
//        songsList.sort(Comparator.comparing(Songs::getTitle));

        return songsList;



    }

    public static void main(String[] args){
        SortSongObjects sortArrayList = new SortSongObjects();
        sortArrayList.go();


    }

    public void go(){
       List<Songs> songsList =new ArrayList<>();
       songsList=getSongsList();
        System.out.println(songsList);
        songsList.sort((one, two)->one.getArtist().compareTo(two.getArtist()));
       Set<Songs> songsSet = new HashSet<>(songsList);


        System.out.println(songsSet);

    }
}
