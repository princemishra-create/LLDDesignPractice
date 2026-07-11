public class ComputerPlayer extends Player{
    public ComputerPlayer(String name, Symbol symbol, Board board) {
        super(name, symbol, board);
    }

    @Override
    public void setState() {
        this.setGameStateStrategy(GameStateStrategyImpl.getInstance());
        this.setMoveStrategy(MoveStrategyImpl.getInstance());
    }
}
