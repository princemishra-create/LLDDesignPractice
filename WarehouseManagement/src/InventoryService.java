public class InventoryService implements Observer{
    private final Subject m_subject;

    public InventoryService(Subject subject){
        this.m_subject = subject;
    }

    @Override
    public void notify(OrderStatus orderStatus) {
        if(orderStatus == OrderStatus.None){

        }else if(orderStatus == OrderStatus.Placed){
            System.out.println("Order has been placed, holding " + this.m_subject.getProductName());
        } else if(orderStatus == OrderStatus.Shipped){
            System.out.println("Order has been shipped, hold on " + this.m_subject.getProductName());
        } else if(orderStatus == OrderStatus.Delivered){
            System.out.println("Order has been delivered, reducing count for " + this.m_subject.getProductName());
        } else if(orderStatus == OrderStatus.Cancelled){
            System.out.println("Order has been cancelled, returning back to the inventory and increasing count for " + this.m_subject.getProductName());
        }
    }
}
