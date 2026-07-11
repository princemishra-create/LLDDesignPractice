public abstract class NotificationDecorator implements INotifier{
    protected INotifier notifier;

    public NotificationDecorator(INotifier notifier){
        this.notifier = notifier;
    }

    @Override
    public abstract boolean send(String message);
}
