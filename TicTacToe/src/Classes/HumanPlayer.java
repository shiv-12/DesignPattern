/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.Player;
import java.util.Scanner;


public class HumanPlayer implements Player {

    private final char symbol;

    public HumanPlayer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public char getSymbol() {
        return this.symbol;
    }

    @Override
    public Move play(Board board) {
        System.out.println("Enter x - ");
        int x = new Scanner(System.in).nextInt();

        System.out.println("Enter y - ");
        int y = new Scanner(System.in).nextInt();

        Move move = new Move(x, y);
        return move;
    }

}
