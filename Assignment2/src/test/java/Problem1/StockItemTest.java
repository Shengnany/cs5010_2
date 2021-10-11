package Problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockItemTest {
    private final String manufacturer1 = "A";
    private final Category category1 = Category.BEER;
    private final String name1 = "beer";
    private final double price1 = 1.1;
    private final int ALCOHOL_AGE = 21;
    private final double weight1 = 2.1;
    private  GroceryProduct product1 = new GroceryProduct(manufacturer1, category1, name1,  price1, ALCOHOL_AGE, weight1);
    private final int quantity1 = 1;
    private StockItem item1;
    private final String manufacturer2 = "A";
    private final Category category2 = Category.PAPER_TOWELS;
    private final String name2 = "towels";
    private final double price2 = 1.1;
    private final int age2 = 21;
    private final int units2 = 1;
    private final HouseholdProduct product2 = new HouseholdProduct(manufacturer2, category2, name2, price2, age2, units2);
    private final int quantity2 = 1;
    private StockItem item2;

    @BeforeEach
    void setUp() {
        item1 =  new StockItem(product1,quantity1);
        item2 = new StockItem(product2,quantity2);
    }

    @Test
    void getProduct() {
        assertEquals(product1,item1.getProduct());
    }

    @Test
    void setQuantity() {
        item2.setQuantity(quantity2);
        assertEquals(quantity2,item2.getQuantity());
    }

    @Test
    void getQuantity() {
        assertEquals(quantity1,item1.getQuantity());
    }

    @Test
    void isEnough() {
        assertFalse(item1.isEnough(4));
        assertTrue(item1.isEnough(1));
    }
}