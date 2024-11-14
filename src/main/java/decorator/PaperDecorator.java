package decorator;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return item.getName() + ", Paper Wrapped";
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 13;
    }
}
