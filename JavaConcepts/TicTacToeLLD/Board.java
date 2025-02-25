package TicTacToeLLD;

import java.util.List;


public class Board {

    int size;
    PlayingPiece[][] playingPieceBoard;

    public Board(int size){
        this.playingPieceBoard = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column,PlayingPiece playingPiece){
        if(playingPieceBoard[row][column]==null){
            return false;
        }
        playingPieceBoard[row][column]=playingPiece;
        return true;
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(playingPieceBoard[i][j]!=null){
                    System.out.print(playingPieceBoard[i][j].type.name()+"  ");
                }
                else{
                    System.out.print("   ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }


}
