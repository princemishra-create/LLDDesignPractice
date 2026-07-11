public class TournamentDesk implements BroadcastInterface{
    @Override
    public void notifies(String currentScore) {
        System.out.println("Tournament Desk ---- " + currentScore);
    }
}
