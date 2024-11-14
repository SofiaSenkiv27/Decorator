package decorator;

public class RibbonDecorator extends ItemDecorator {
    private static final double RIBBON_COST = 4.0;
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return getItem().getName() + ", Ribbon";
    }

    @Override
    public double getPrice() {
        return getItem().getPrice() + RIBBON_COST;
    }
}
