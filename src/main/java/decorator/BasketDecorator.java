package decorator;

public class BasketDecorator extends ItemDecorator {
    private static final double BASKET_COST = 4.0;
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return getItem().getName() + ", Basket";
    }

    @Override
    public double getPrice() {
        return getItem().getPrice() + BASKET_COST;
    }
}
