public class GameStrategyFactory {
    public static GameStrategy getGameStrategy(GameStrategyType gameStrategyType) {
        if (GameStrategyType.Standard == gameStrategyType) {
            return new StandardGameStrategy();
        } else if (GameStrategyType.Practice == gameStrategyType || GameStrategyType.Qualifier == gameStrategyType) {
            return new QualifierGameStrategy();
        } else {
            return null;
        }
    }
}
