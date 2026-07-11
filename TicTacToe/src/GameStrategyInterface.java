public abstract class GameStrategyInterface {
    public GameState getGameState(Board board, Player player){
        if(this.hasWon(board, player)){
            return GameState.WON;
        }else if(this.isTie(board)){
            return GameState.TIE;
        }else{
            return GameState.RUNNING;
        }
    }

    public abstract boolean hasWon(Board board, Player player);

    public abstract boolean isTie(Board board);
}
