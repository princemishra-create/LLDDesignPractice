import java.util.ArrayList;
import java.util.List;

public class CoffeeBuilder {
    private Coffee m_coffee;
    private List<Condiments>m_condiments;
    private List<Condiments>m_discounts;

    public CoffeeBuilder(){
        this.m_condiments = new ArrayList<>();
        this.m_discounts = new ArrayList<>();
    }

    public CoffeeBuilder addCoffee(Coffee coffee){
        this.m_coffee = coffee;
        return this;
    }

    public CoffeeBuilder addCondiment(Condiments condiment){
        this.m_condiments.add(condiment);
        return this;
    }

    public CoffeeBuilder addDiscount(Condiments condiment){
        this.m_discounts.add(condiment);
        return this;
    }

    public Coffee build(){
        Coffee coffee = this.m_coffee;

        for(Condiments condiment: m_condiments){
            condiment.updateCoffee(coffee);
            coffee = condiment;
        }

        for(Condiments condiment: m_discounts){
            condiment.updateCoffee(coffee);
            coffee = condiment;
        }

        return coffee;
    }
}
