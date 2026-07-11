public class AIPlayer extends Player {
    public AIPlayer(String name, Symbol symbol, Board board) {
        super(name, symbol, board);
    }

    @Override
    public void setState() {
        /*currently not creating more strategies for time constraints, but we can easily plug in AI strategies below*/
        this.setGameStateStrategy(GameStateStrategyImpl.getInstance());
        this.setMoveStrategy(MoveStrategyImpl.getInstance());
    }
}
