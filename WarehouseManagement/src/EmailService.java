public class EmailService implements Observer{
    private final Subject m_subject;

    public EmailService(Subject subject){
        this.m_subject = subject;
    }

    @Override
    public void notify() {
        System.out.println("Sending mail to " + this.m_subject.getEmailId() + ", status changed to - " + this.m_subject.getOrderStatus().toString());
    }
}
