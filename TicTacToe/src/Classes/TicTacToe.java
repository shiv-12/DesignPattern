/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author shivam
 */
public class TicTacToe {

    public static void main(String[] args) {
        Game game = new Game(new HumanPlayer('x'), new ComputerPlayer('o'), new Board());
        game.startGame();
    }
}
