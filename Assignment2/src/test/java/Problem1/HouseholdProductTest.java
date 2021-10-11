package Problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class HouseholdProductTest {
    private final String manufacturer1 = "A";
    private final Category category1 = Category.PAPER_TOWELS;
    private final String name1 = "towels";
    private double price1 = 1.1;
    private final int age1 = 21;
    private final String manufacturer2 = "B";
    private final Category category2 = Category.SHAMPOO;
    private final String name2 = "shampoo";
    private double price2 = 2.1;
    private Integer age2 = 0;
    private HouseholdProduct product1;
    private HouseholdProduct product2;
    private final String manufacturer3 = "B";
    private final Category category3 = Category.SHAMPOO;
    private final String name3 = "shampoo2";
    private double price3 = 2.1;
    private Integer age3 = 0;
    private HouseholdProduct product3;
    private HouseholdProduct product4;
    private int units1 = 2;
    private int units2 = 1;
    private int units3 = 1;
    private int units4 = 1;
    @BeforeEach
    void setUp() {
        product1 = new HouseholdProduct(manufacturer1, category1, name1, price1, age1, units1);
        product2 = new HouseholdProduct(manufacturer2, category2, name2, price3, age2, units2);
        product3 = new HouseholdProduct(manufacturer3, category3, name3, price3, age3, units3);
        product4 = new HouseholdProduct(manufacturer3, category3, name3, price3, age3, units4);
    }

    @Test
    void getUnits() {
        assertEquals(this.units2,product2.getUnits());

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
        int a = Objects.hash(product1.getManufacturer(), product1.getCategory(), product1.getName(), product1.getPrice(), product1.getAge(), age1);
        int b = Objects.hash(a, product1.getUnits());
        assertEquals(b,product1.hashCode());
    }
}