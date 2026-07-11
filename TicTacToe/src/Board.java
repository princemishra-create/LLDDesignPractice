public class Board {
    private Symbol[][] board;
    private int board_size;
    private int boxesLeft;

    public Board(int size) {
        this.board_size = size;
        this.board = new Symbol[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.board[i][j] = Symbol.EMPTY;
            }
        }

        boxesLeft = size * size;
    }

    public void move(int row, int col, Symbol symbol) {
        if (row < 0 || row >= this.board_size) {
            throw new IndexOutOfBoundsException("Invalid row index");
        }

        if (col < 0 || col >= this.board_size) {
            throw new IndexOutOfBoundsException("Invalid column index");
        }

        if(symbol == Symbol.EMPTY) {
            throw new IllegalArgumentException("Invalid symbol");
        }

        if(this.board[row][col] != Symbol.EMPTY) {
            throw new IllegalStateException("Board already contains a symbol");
        }

        boxesLeft -= 1;
        this.board[row][col] = symbol;
    }

    public Symbol get(int row, int col) {
        if (row < 0 || row >= this.board_size) {
            throw new IndexOutOfBoundsException("Invalid row index");
        }

        if (col < 0 || col >= this.board_size) {
            throw new IndexOutOfBoundsException("Invalid column index");
        }

        return this.board[row][col];
    }

    public int getBoardSize(){
        return this.board_size;
    }

    public int getBoxesLeft(){
        return this.boxesLeft;
    }
}
