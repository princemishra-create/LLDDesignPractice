import java.util.Objects;

public class ThrottlingDecorator extends NotificationDecorator{
    private String lastMessage;

    public ThrottlingDecorator(INotifier notifier) {
        super(notifier);
        this.lastMessage = "";
    }

    @Override
    public boolean send(String message) {
        if(Objects.equals(message, this.lastMessage)){
            System.out.println("Message has been blocked");
            return false;
        }

        this.lastMessage = message;
        return this.notifier.send(message);
    }
}
