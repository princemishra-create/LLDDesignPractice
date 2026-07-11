import javafx.util.Pair;

public abstract class Player {
    private final Symbol symbol;
    private final String name;
    private MoveStrategyInterface moveStrategy = null;
    private GameStrategyInterface gameStateStrategy = null;
    private final Board board;

    public Player(String name, Symbol symbol, Board board) {
        this.name = name;
        this.symbol = symbol;
        this.board = board;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void makeMove() {
        if(this.moveStrategy == null){
            this.setState();
        }

        while (true) {
            try {
                Pair<Integer, Integer> move = this.getMove();
                this.board.move(move.getKey(), move.getValue(), this.getSymbol());
                System.out.println(move.getKey() + " " + move.getValue() + " " + this.getSymbol());
                return;
            } catch (Exception e) {
                System.out.println(this.name + " move failed, trying some other move");
            }
        }
    }

    public GameState getGameState() {
        if(this.gameStateStrategy == null){
            this.setState();
        }

        return this.gameStateStrategy.getGameState(board, this);
    }

    public String getName() {
        return name;
    }

    public abstract void setState();

    private Pair<Integer, Integer> getMove() {
        return this.moveStrategy.getMove(board);
    }

    protected void setMoveStrategy(MoveStrategyInterface moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    protected void setGameStateStrategy(GameStrategyInterface gameStateStrategy) {
        this.gameStateStrategy = gameStateStrategy;
    }
}
