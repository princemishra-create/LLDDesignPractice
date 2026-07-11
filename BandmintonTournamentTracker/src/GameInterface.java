public interface GameInterface {
    TeamInterface play();
    void addBroadCastMean(BroadcastInterface broadcastInterface);
    void notifyBroadCastingChannels(String message);
}
