public class SlackDecorator extends NotificationDecorator{
    public SlackDecorator(INotifier notifier){
        super(notifier);
    }

    @Override
    public boolean send(String message) {
        System.out.println("Pinging on Slack");
        return this.notifier.send(message);
    }
}
