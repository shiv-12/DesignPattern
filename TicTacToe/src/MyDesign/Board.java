package MyDesign;

class Board {

    private char[][] board;

    public Board() {
        board = new char[3][3];
    }

    public boolean isFull() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void applyMove(Move move, char symbol) {

        int x = move.getX();
        int y = move.getY();
        this.board[x][y] = symbol;

    }

    public boolean hasWinningLine(char symbol) {
        if (isRowSame(symbol) || isColSame(symbol) || isDigoSame(symbol)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isRowSame(char symbol) {

        for (int i = 0; i < 3; i++) {
            int countRow = 0;
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == symbol) {
                    countRow++;
                }
            }
            if (countRow == 3) {
                return true;
            }
        }
        return false;

    }

    private boolean isColSame(char symbol) {

        for (int i = 0; i < 3; i++) {
            int countCol = 0;
            for (int j = 0; j < 3; j++) {
                if (board[j][i] == symbol) {
                    countCol++;
                }
            }
            if (countCol == 3) {
                return true;
            }
        }
        return false;

    }

    private boolean isDigoSame(char symbol) {

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        } else if (board[2][0] == symbol && board[1][1] == symbol && board[0][2] == symbol) {
            return true;
        } else {
            return false;
        }

    }

}
