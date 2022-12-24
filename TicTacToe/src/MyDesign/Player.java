package MyDesign;

import java.util.Scanner;

public class Player {

    char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }
    
    public char getSymbol()
    {
        return this.symbol;
    }

    public Move play() {
        System.out.println("Enter x - ");
        int x = new Scanner(System.in).nextInt();

        System.out.println("Enter y - ");
        int y = new Scanner(System.in).nextInt();

        Move move = new Move(x, y);
        return move;
    }

}
