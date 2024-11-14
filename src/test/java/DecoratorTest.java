import decorator.BasketDecorator;
import decorator.Item;
import decorator.PaperDecorator;
import decorator.RibbonDecorator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DecoratorTest {
    private static final double ROSE_PRICE = 10.0;
    private static final double EXPECTED_PAPER_PRICE = 14.0;
    private static final double TULIP_PRICE = 8.0;
    private static final double EXPECTED_BASKET_PRICE = 12.0;
    private static final double LILY_PRICE = 15.0;
    private static final double EXPECTED_RIBBON_PRICE = 19.0;
    private static final double ORCHID_PRICE = 20.0;
    private static final double EXPECTED_COMBINED_PRICE = 32.0;

    @Test
    public void testPaperDecorator() {
        Item flower = new Item("Rose", ROSE_PRICE);
        Item paperWrappedFlower = new PaperDecorator(flower);

        Assertions.assertEquals("Rose, Paper Wrapped", 
        paperWrappedFlower.getName());
        Assertions.assertEquals(EXPECTED_PAPER_PRICE, paperWrappedFlower.getPrice());
    }

    @Test
    public void testBasketDecorator() {
        Item flower = new Item("Tulip", TULIP_PRICE);
        Item basketFlower = new BasketDecorator(flower);

        Assertions.assertEquals("Tulip, Basket", basketFlower.getName());
        Assertions.assertEquals(EXPECTED_BASKET_PRICE, basketFlower.getPrice());
    }

    @Test
    public void testRibbonDecorator() {
        Item flower = new Item("Lily", LILY_PRICE);
        Item ribbonFlower = new RibbonDecorator(flower);

        Assertions.assertEquals("Lily, Ribbon", ribbonFlower.getName());
        Assertions.assertEquals(EXPECTED_RIBBON_PRICE, ribbonFlower.getPrice());
    }

    @Test
    public void testCombinedDecorators() {
        Item flower = new Item("Orchid", ORCHID_PRICE);
        Item decoratedFlower = new PaperDecorator(
            new BasketDecorator(new RibbonDecorator(flower)));

        Assertions.assertEquals("Orchid, Ribbon, Basket, Paper Wrapped", 
        decoratedFlower.getName());
        Assertions.assertEquals(EXPECTED_COMBINED_PRICE, decoratedFlower.getPrice());
    }
}
