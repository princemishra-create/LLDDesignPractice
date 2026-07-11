public class Espresso implements Coffee{
    private final String m_coffeeName = "Espresso";

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return this.m_coffeeName;
    }
}
