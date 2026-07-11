package implementations;

import interfaces.IShippingStrategy;

public class FedExStrategy implements IShippingStrategy {
    @java.lang.Override
    public int getDeliveryCost() {
        return 0;
    }
}
