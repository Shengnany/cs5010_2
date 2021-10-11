package Problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class GroceryProductTest {
    private final String manufacturer1 = "A";
    private final Category category1 = Category.BEER;
    private final String name1 = "beer";
    private double price1 = 1.1;
    private final int ALCOHOL_AGE = 21;
    private final String manufacturer2 = "B";
    private final Category category2 = Category.SALMON;
    private final String name2 = "salmon";
    private double price2 = 2.1;
    private Integer age2 = 0;
    private GroceryProduct product1;
    private GroceryProduct product2;
    private final String manufacturer3 = "B";
    private final Category category3 = Category.SALMON;
    private final String name3 = "salmon";
    private double price3 = 2.1;
    private Integer age3 = 0;
    private GroceryProduct product3;
    private GroceryProduct product4;
    private double weight1 = 2.1;
    private double weight2 = 1.1;
    private double weight3 = 1.1;
    private double weight4 = 1.1;

    @BeforeEach
    void setUp() {
        product1 = new GroceryProduct(manufacturer1, category1, name1,  price1, ALCOHOL_AGE, weight1);
        product2 = new GroceryProduct(manufacturer2, category2, name2,  price2, age2, weight2);
        product3 = new GroceryProduct(manufacturer3, category3, name3, price3, age3, weight3);
        product4 = new GroceryProduct(manufacturer3, category3, name3, price3, age3, weight4);
    }

    @Test
    void getWeight() {
        assertEquals(this.weight2,product2.getWeight());
    }

    @Test
    void testEquals() {
        assertEquals(product3,product4);
        assertNotEquals(product1,product2);
        assertNotEquals(product1,"abc");
        assertEquals(product1,product1);
    }

    @Test
    void testHashCode() {
        int a = Objects.hash(product1.getManufacturer(), product1.getCategory(), product1.getName(), product1.getPrice(), product1.getAge(), ALCOHOL_AGE);
        int b = Objects.hash(a, product1.getWeight());
        assertEquals(b,product1.hashCode());
    }
}