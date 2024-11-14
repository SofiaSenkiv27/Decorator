package decorator;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", Ribbon";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 40;
    }
}
