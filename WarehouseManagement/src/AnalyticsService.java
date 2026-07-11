public class AnalyticsService implements  Observer{
    private Subject m_subject;

    public AnalyticsService(Subject subject){
        this.m_subject = subject;
    }

    @Override
    public void notify() {
        System.out.println("Logging orderStatus change " + this.m_subject.getOrderStatus().toString());
    }
}
