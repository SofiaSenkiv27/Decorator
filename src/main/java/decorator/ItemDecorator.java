package decorator;

public abstract class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item) {
        super(item.getName(), item.getPrice());
        this.item = item;
    }

    @Override
    public abstract String getName();

    @Override
    public abstract double getPrice();
}
