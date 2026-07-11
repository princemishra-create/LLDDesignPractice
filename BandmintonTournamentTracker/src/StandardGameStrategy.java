public class StandardGameStrategy implements GameStrategy {
    @Override
    public boolean hasMatchFinished(TeamInterface teamA, TeamInterface teamB) {
        int maxScore = Math.max(teamA.getScore(), teamB.getScore());
        int scoreDiff = Math.abs(teamA.getScore() - teamB.getScore());

        if (maxScore >= 21 && scoreDiff >= 2) {
            return true;
        }

        return maxScore > 30 && scoreDiff == 1;
    }

    @Override
    public TeamInterface getWinnerTeam(TeamInterface teamA, TeamInterface teamB) {
        if (!this.hasMatchFinished(teamA, teamB)) {
            return null;
        }

        if (teamA.getScore() > teamB.getScore()) {
            return teamA;
        } else {
            return teamB;
        }
    }
}
