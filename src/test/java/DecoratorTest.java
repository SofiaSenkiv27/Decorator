import decorator.Item;
import decorator.PaperDecorator;
import decorator.BasketDecorator;
import decorator.RibbonDecorator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    public void testPaperDecorator() {
        Item flower = new Item("Rose", 10);
        Item paperWrappedFlower = new PaperDecorator(flower);

        assertEquals("Rose, Paper Wrapped", paperWrappedFlower.getName());
        assertEquals(23.0, paperWrappedFlower.getPrice());
    }

    @Test
    public void testBasketDecorator() {
        Item flower = new Item("Tulip", 8);
        Item basketFlower = new BasketDecorator(flower);

        assertEquals("Tulip, Basket", basketFlower.getName());
        assertEquals(12.0, basketFlower.getPrice());
    }

    @Test
    public void testRibbonDecorator() {
        Item flower = new Item("Lily", 15);
        Item ribbonFlower = new RibbonDecorator(flower);

        assertEquals("Lily, Ribbon", ribbonFlower.getName());
        assertEquals(55.0, ribbonFlower.getPrice());
    }

    @Test
    public void testCombinedDecorators() {
        Item flower = new Item("Orchid", 20);
        Item decoratedFlower = new PaperDecorator(new BasketDecorator(new RibbonDecorator(flower)));

        assertEquals("Orchid, Ribbon, Basket, Paper Wrapped", decoratedFlower.getName());
        assertEquals(77.0, decoratedFlower.getPrice()); 
    }
}
