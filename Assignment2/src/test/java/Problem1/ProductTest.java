package Problem1;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest extends Product {
    private final String manufacturer1 = "A";
    private final Category category1 = Category.BEER;
    private final String name1 = "beer";
    private double price1 = 1.1;
    private final int ALCOHOL_AGE = 21;

    @Test
    void testPrice() {
        setPrice(price1);
        assertEquals(price1, getPrice());
    }

    @Test
    void testAge() {
        setAge(ALCOHOL_AGE);
        assertEquals(ALCOHOL_AGE, getAge());
    }


    @Test
    void testManufacturer() {
        setManufacturer(manufacturer1);
        assertEquals(manufacturer1, getManufacturer());
    }


    @Test
    void testName() {
        setManufacturer(name1);
        assertEquals(name1, getManufacturer());
    }


    @Test
    void testCategory() {
        setCategory(category1);
        assertEquals(category1, getCategory());
    }

    @Test
    void testHash() {
        setPrice(price1);
        setManufacturer(name1);
        setAge(ALCOHOL_AGE);
        setCategory(category1);
        setManufacturer(manufacturer1);
        int hash = Objects.hash(getManufacturer(), getCategory(), getName(), getPrice(), getAge());
        assertEquals(hash, hashCode());
    }
}
