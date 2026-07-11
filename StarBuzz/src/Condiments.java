public abstract class Condiments implements Coffee {
    private final String m_condimentName;
    private Coffee m_coffee;

    public Condiments(String condimentName){
        this.m_condimentName = condimentName;
    }

    public void updateCoffee(Coffee coffee){
        this.m_coffee = coffee;
    }

    public int cost(){
        return this.costInternal() + this.m_coffee.cost();
    }

    @Override
    public String getDescription() {
        return this.m_coffee.getDescription() + "-" + this.m_condimentName;
    }

    public abstract int costInternal();
}
