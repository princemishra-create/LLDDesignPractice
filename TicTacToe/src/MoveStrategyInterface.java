import javafx.util.Pair;

public interface MoveStrategyInterface {
    Pair<Integer, Integer> getMove(Board board);
}
