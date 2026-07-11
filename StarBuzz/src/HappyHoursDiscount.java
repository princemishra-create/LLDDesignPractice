public class HappyHoursDiscount extends Condiments {
    public HappyHoursDiscount() {
        super("HappyHoursDiscount");
    }

    @Override
    public int costInternal() {
        return 0;
    }

    public int cost() {
        return (int) (super.cost() * 0.8);
    }
}
