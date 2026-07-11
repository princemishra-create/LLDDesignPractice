public class HumanPlayer extends Player {
    public HumanPlayer(String name, Symbol symbol, Board board) {
        super(name, symbol, board);
    }

    @Override
    public void setState() {
        /*currently not creating more strategies for time constraints, but we can easily plug in Hunan strategies below*/
        this.setGameStateStrategy(GameStateStrategyImpl.getInstance());
        this.setMoveStrategy(MoveStrategyImpl.getInstance());
    }
}
