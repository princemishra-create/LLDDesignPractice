import javafx.util.Pair;

import java.util.Random;

public class MoveStrategyImpl implements MoveStrategyInterface {
    private final Random rand = new Random();
    private static MoveStrategyInterface instace;
    private MoveStrategyImpl() {}

    public static MoveStrategyInterface getInstance() {
        if (instace == null) {
            instace = new MoveStrategyImpl();
        }

        return instace;
    }

    private int getRandomNumber(int max){
        return rand.nextInt(max);
    }

    @Override
    public Pair<Integer, Integer> getMove(Board board) {
        return new Pair<>(this.getRandomNumber(board.getBoardSize()), this.getRandomNumber(board.getBoardSize()));
    }
}
