import java.util.ArrayList;
import java.util.List;

public class Order implements Subject{
    public final String m_productName;
    public final String m_email;
    private OrderStatus m_orderStatus;
    private final List<Observer> m_observers;

    public Order(String productName, String email){
        this.m_productName = productName;
        this.m_email = email;
        this.m_orderStatus = OrderStatus.None;
        this.m_observers = new ArrayList<>();
    }

    @Override
    public boolean addObserver(Observer observer) {
        return this.m_observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return this.m_observers.remove(observer);
    }

    @Override
    public boolean update(OrderStatus orderStatus) {
        this.m_orderStatus = orderStatus;
        this.notifyObserver();
        return true;
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: this.m_observers){
            observer.notify();
        }
    }

    @Override
    public String getEmailId() {
        return this.m_email;
    }

    @Override
    public String getProductName() {
        return this.m_productName;
    }

    @Override
    public OrderStatus getOrderStatus() {
        return this.m_orderStatus;
    }
}
