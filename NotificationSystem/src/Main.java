//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    INotifier notifier = new ThrottlingDecorator(new SMSDecorator(new SlackDecorator(new EmailNotifier())));
    notifier.send("Hi");
    notifier.send("Hi");
    notifier.send("Hello");
}
