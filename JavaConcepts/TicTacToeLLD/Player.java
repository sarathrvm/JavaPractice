package TicTacToeLLD;

public class Player {

    private String name;
    private PlayingPiece playingPiece;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }

    public Player(String playerName, PlayingPiece playingPiece){
        this.playingPiece = playingPiece;
        this.name = playerName;
    }
}
