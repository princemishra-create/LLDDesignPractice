public interface Subject {
    boolean addObserver(Observer observer);
    boolean removeObserver(Observer observer);
    boolean update(OrderStatus orderStatus);
    void notifyObserver();
    String getEmailId();
    String getProductName();
    OrderStatus getOrderStatus();
}
