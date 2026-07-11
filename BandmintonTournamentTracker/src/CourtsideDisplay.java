public class CourtsideDisplay implements BroadcastInterface{
    @Override
    public void notifies(String currentScore) {
        System.out.println("CourtSide Display ---- " + currentScore);
    }
}
