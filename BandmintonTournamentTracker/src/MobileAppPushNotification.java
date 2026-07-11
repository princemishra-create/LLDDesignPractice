public class MobileAppPushNotification implements BroadcastInterface{
    @Override
    public void notifies(String currentScore) {
        System.out.println("Mobile App Push Notification ---- " + currentScore);
    }
}
