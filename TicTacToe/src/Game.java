public class Game {
    private boolean play(Player player){
        player.makeMove();
        GameState gameState = player.getGameState();

        if(gameState == GameState.TIE){
            System.out.println("Match is TIE");
            return true;
        }else if(gameState == GameState.WON){
            System.out.println(player.getName() + " won match");
            return true;
        }

        return false;
    }

    public void start(){

        Board board = new Board(6);

        Player player1 = PlayerFactory.getPlayer(PlayerType.HUMAN, "Player1", Symbol.O, board);
        Player player2 = PlayerFactory.getPlayer(PlayerType.AI, "Player2", Symbol.X, board);

        while (true) {

            try{
                if(this.play(player1)){return;}
                if(this.play(player2)){return;}
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
