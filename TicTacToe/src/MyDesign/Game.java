/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyDesign;

public class Game {

    private Player player1, player2;
    private Board board;

    public Game(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
    }

    public static void startGame() {

        Player player1 = new Player('o');
        Player player2 = new Player('x');
        Board board = new Board();

        Player currentPlayer = player1;
        while (!board.isFull()) {
            Move currentMove = currentPlayer.play();
            board.applyMove(currentMove, currentPlayer.getSymbol());
            if (board.hasWinningLine(currentPlayer.getSymbol())) {
                System.out.println("Player with symbol - " + currentPlayer.getSymbol() + " won...");
                break;
            }
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }
        }
        System.out.println("Match Drawn");

    }
}
