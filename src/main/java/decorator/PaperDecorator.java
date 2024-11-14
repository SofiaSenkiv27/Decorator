package decorator;

public class PaperDecorator extends ItemDecorator {
    private static final double PAPER_COST = 4.0;
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return getItem().getName() + ", Paper Wrapped";
    }

    @Override
    public double getPrice() {
        return getItem().getPrice() + PAPER_COST;
    }
}
