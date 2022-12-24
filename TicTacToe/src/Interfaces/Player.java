/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Board;
import Classes.Move;

public interface Player {

    public Move play(Board board);
    public char getSymbol();
}
