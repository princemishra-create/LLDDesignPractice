public class PlayerFactory {
    public static Player getPlayer(PlayerType playerType, String playerName, Symbol symbol, Board board) {
        return switch (playerType) {
            case HUMAN -> new HumanPlayer(playerName, symbol, board);
            case COMPUTER -> new ComputerPlayer(playerName, symbol, board);
            case AI -> new AIPlayer(playerName, symbol, board);
            default -> throw new IllegalArgumentException("Invalid player type");
        };
    }
}
