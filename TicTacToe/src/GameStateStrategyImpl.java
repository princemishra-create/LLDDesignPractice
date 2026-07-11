public class GameStateStrategyImpl extends GameStrategyInterface {
    private static GameStrategyInterface instace;
    private GameStateStrategyImpl() {}

    public static GameStrategyInterface getInstance() {
        if (instace == null) {
            instace = new GameStateStrategyImpl();
        }

        return instace;
    }

    public boolean hasWon(Board board, Player player){
        Symbol symbol = player.getSymbol();
        int boardSize = board.getBoardSize();

        // check for rows
        for(int i=0;i<boardSize;i++){
            int count = 0;

            for(int j=0;j<boardSize;j++){
                if(symbol==board.get(i,j)){
                    count += 1;
                }
            }

            if(count==boardSize){return true;}
        }


        // check for columns
        for(int j=0;j<boardSize;j++){
            int count = 0;

            for(int i=0;i<boardSize;i++){
                if(symbol==board.get(i,j)){
                    count += 1;
                }
            }

            if(count==boardSize){return true;}
        }

        // check for diagonal
        int countForDiagonal1 = 0;
        int countForDiagonal2 = 0;
        for(int i=0;i<boardSize;i++){
            if(symbol==board.get(i,i)){countForDiagonal1++;}
            if(symbol==board.get(i,boardSize-1-i)){countForDiagonal2++;}
        }

        return countForDiagonal1 == boardSize || countForDiagonal2 == boardSize;
    }

    public boolean isTie(Board board){
        return board.getBoxesLeft() == 0;
    }
}
