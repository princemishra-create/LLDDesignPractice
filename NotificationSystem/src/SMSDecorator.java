public class SMSDecorator extends NotificationDecorator{
    public SMSDecorator(INotifier notifier){
        super(notifier);
    }

    @Override
    public boolean send(String message) {
        System.out.println("Sending SMS");
        return this.notifier.send(message);
    }
}
