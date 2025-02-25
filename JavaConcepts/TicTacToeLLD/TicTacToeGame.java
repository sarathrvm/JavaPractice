package TicTacToeLLD;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> players;

    Board gameBoard;

    public void initialiseGame(){
        players = new LinkedList<>();

        PlayingPiece playingPieceO = new PlayingPiece(PieceType.O);
        PlayingPiece playingPieceX = new PlayingPiece(PieceType.X);

        Player player1 = new Player("sarathrvm",playingPieceX);
        Player player2 = new Player("daivik",playingPieceO);

        gameBoard = new Board(3);
    }

    public String startGame(){
        boolean noWinner = true;

        while (noWinner){
            Player playerTurn = players.removeFirst();

            System.out.println("Player name: " + playerTurn.getName()+" is playing now!!. Please enter row and column: ");
            Scanner inputScanner = new Scanner(System.in);
            String inputValue = inputScanner.nextLine();
            String[] stringValues = inputValue.split(",");

            int rowValue = Integer.valueOf(stringValues[0]);
            int columnValue = Integer.valueOf(stringValues[1]);

//            place a piece

            boolean pieceAddedSuccessfully = gameBoard.addPiece(rowValue,columnValue,playerTurn.getPlayingPiece());
            if(!pieceAddedSuccessfully){
                System.out.println("piece added in incorrect position. please enter correct row and column!!");
                players.addFirst(playerTurn);
                continue;
            }

        }

        return "";

    }
}
