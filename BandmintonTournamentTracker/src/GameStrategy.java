public interface GameStrategy {
    boolean hasMatchFinished(TeamInterface teamA, TeamInterface teamB);
    TeamInterface getWinnerTeam(TeamInterface teamA, TeamInterface teamB);
}
