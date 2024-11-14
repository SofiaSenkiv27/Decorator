package decorator;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", Basket";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 4;
    }
}
