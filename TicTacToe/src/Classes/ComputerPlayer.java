/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.Player;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ComputerPlayer implements Player {

    private final char symbol;

    public ComputerPlayer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public char getSymbol() {
        return this.symbol;
    }

    @Override
    public Move play(Board board) {
        return board.getEmptyCellForComputer();
    }

}
