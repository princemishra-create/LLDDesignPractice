public class EmailNotifier implements INotifier{
    @Override
    public boolean send(String message) {
        System.out.println("Sending Mail");
        return true;
    }
}
