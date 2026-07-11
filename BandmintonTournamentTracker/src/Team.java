public class Team implements TeamInterface{
    private final String m_teamName;
    private int m_score = 0;

    public Team(String teamName){
        this.m_teamName = teamName;
    }

    @Override
    public String getTeamName() {
        return this.m_teamName;
    }

    @Override
    public int getScore() {
        return this.m_score;
    }

    @Override
    public void incrementScore() {
        this.m_score++;
    }

    @Override
    public void resetScore() {
        this.m_score = 0;
    }
}
