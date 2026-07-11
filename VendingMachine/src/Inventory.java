import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, int count) {
        products.put(product, products.getOrDefault(product, 0) + count);
    }

    public void addProduct(Product product) {
        this.addProduct(product, 1);
    }

    public void decrementProduct(Product product, int count) {
        if (!products.containsKey(product) || products.get(product) < count) {
            System.out.println("No enough Product in the Inventory, can't decrement the product count");
            return;
        }

        products.put(product, products.get(product) - count);
    }

    public int getProductCount(Product product){
        return this.products.getOrDefault(product, 0);
    }

    public void decrementProduct(Product product){
        this.decrementProduct(product, 1);
    }
}
