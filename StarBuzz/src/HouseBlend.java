public class HouseBlend implements Coffee{
    private final String m_coffeeName = "HouseBlend";

    @Override
    public int cost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return this.m_coffeeName;
    }

}
