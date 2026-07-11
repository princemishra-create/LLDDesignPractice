import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game implements GameInterface {
    private final TeamInterface m_teamA;
    private final TeamInterface m_teamB;
    private final GameStrategy m_gameStrategy;
    private final Random m_random;
    private final List<BroadcastInterface> m_broadCastMeans;

    public Game(TeamInterface teamA, TeamInterface teamB, GameStrategy gameStrategy) {
        this.m_teamA = teamA;
        this.m_teamB = teamB;
        this.m_gameStrategy = gameStrategy;
        this.m_random = new Random();
        this.m_broadCastMeans = new ArrayList<>();
    }

    @Override
    public TeamInterface play() {
        while (true) {
            int randomNumber = this.m_random.nextInt(2);

            if (randomNumber == 0) {
                this.m_teamA.incrementScore();
            } else {
                this.m_teamB.incrementScore();
            }

            String teamAScore = this.getScoreString(this.m_teamA);
            String teamBScore = this.getScoreString(this.m_teamB);
            String currentScore = "\n" + teamAScore + "\n" + teamBScore;
            this.notifyBroadCastingChannels(currentScore);

            if (this.m_gameStrategy.hasMatchFinished(this.m_teamA, this.m_teamB)) {
                TeamInterface winnerTeam = this.m_gameStrategy.getWinnerTeam(this.m_teamA, this.m_teamB);
                this.notifyBroadCastingChannels("\nWinning Team: " + winnerTeam.getTeamName() + "\n");
                return winnerTeam;
            }
        }
    }

    @Override
    public void addBroadCastMean(BroadcastInterface broadcastInterface) {
        this.m_broadCastMeans.add(broadcastInterface);
    }

    @Override
    public void notifyBroadCastingChannels(String message) {
        for(BroadcastInterface broadcastInterface: this.m_broadCastMeans){
            broadcastInterface.notifies(message);
        }
    }

    private String getScoreString(TeamInterface team){
        return team.getTeamName() + ":" + team.getScore();
    }
}
