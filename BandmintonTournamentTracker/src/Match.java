import java.util.HashMap;

public class Match {
    private int m_totalGames = 3;
    private final TeamInterface m_teamA;
    private final TeamInterface m_teamB;
    private final GameStrategyType m_gameStrategyType;
    private final GameInterface m_game;
    private final HashMap<TeamInterface, Integer> m_wonTeamCount;

    public Match(GameStrategyType gameStrategyType) {
        this.m_teamA = new Team("Team_A");
        this.m_teamB = new Team("Team_B");
        this.m_gameStrategyType = gameStrategyType;
        this.m_wonTeamCount = new HashMap<>();
        GameStrategy gameStrategy = GameStrategyFactory.getGameStrategy(this.m_gameStrategyType);
        this.m_game = new Game(this.m_teamA, this.m_teamB, gameStrategy);
        this.m_game.addBroadCastMean(new CourtsideDisplay());
        this.m_game.addBroadCastMean(new MobileAppPushNotification());
        this.m_game.addBroadCastMean(new TournamentDesk());
    }

    void play() {
        while (this.m_totalGames > 0) {
            this.m_teamA.resetScore();
            this.m_teamB.resetScore();
            TeamInterface wonTeam = this.m_game.play();
            this.m_wonTeamCount.put(wonTeam, this.m_wonTeamCount.getOrDefault(wonTeam, 0) + 1);
            this.m_totalGames = this.m_totalGames - 1;
        }

        this.m_wonTeamCount.forEach((key, value) -> {
            if(value >= 2){
                System.out.println(key.getTeamName() + " won the match");
            }
        });
    }
}
