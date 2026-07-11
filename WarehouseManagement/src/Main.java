//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String productName = "New Product";
    String emailId = "myemail@gmail.com";

    Subject subject = new Order(productName, emailId);

    Observer observer1 = new EmailService(subject);
    subject.addObserver(observer1);

    Observer observer2 = new InventoryService(subject);
    subject.addObserver(observer2);

    Observer observer3 = new AnalyticsService(subject);
    subject.addObserver(observer3);

    subject.update(OrderStatus.Placed);
    subject.update(OrderStatus.Shipped);
    subject.update(OrderStatus.Delivered);
}
