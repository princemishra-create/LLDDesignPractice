import java.util.UUID;

public class Product {
    private String id;
    private final String name;
    private final int cost;

    public Product(String name, int cost){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.cost = cost;
    }

    public String getProductName(){
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
}
