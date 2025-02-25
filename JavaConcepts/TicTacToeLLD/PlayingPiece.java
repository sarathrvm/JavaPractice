package TicTacToeLLD;

public class PlayingPiece {
    PieceType type;

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    public PlayingPiece(PieceType t){
        this.type = t;
    }
}
