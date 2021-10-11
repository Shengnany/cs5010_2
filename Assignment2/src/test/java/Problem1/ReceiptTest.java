package Problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ReceiptTest {
    private double total;
    private Map<Product,Integer> received1;
    private Map<Product,Integer> outOfStock1;
    private Map<Product,Integer> removed1;
    private Map<Product,Integer> received2;
    private Map<Product,Integer> outOfStock2;
    private Map<Product,Integer> removed2;
    private Receipt receipt1;
    private Receipt receipt2;
    private Receipt receipt3;
    @BeforeEach
    void setUp() {
        HouseholdProduct product1 = new HouseholdProduct("a",Category.SHAMPOO,"x",1,0,1);
        GroceryProduct product2 = new GroceryProduct("b",Category.SALMON,"x",2.2,0,1.1);
        GroceryProduct product3 = new GroceryProduct("c",Category.CHEESE,"x",1,0,1.1);
        received1 = new HashMap<>(){{
            put(product1,1);
        }};
        outOfStock1 = new HashMap<>(){{
            put(product2,1);
        }};
        removed1 = new HashMap<>(){{
            put(product3,1);
        }};
        received2 = new HashMap<>(){{
            put(product1,2);
        }};
        outOfStock2 = new HashMap<>(){{
            put(product2,2);
        }};
        removed2 = new HashMap<>(){{
            put(product3,2);
        }};
        receipt1 = new Receipt(1,received1,outOfStock1,removed1);
        receipt2 = new Receipt(2,received2,outOfStock2,removed2);
        receipt3 = new Receipt(1,received1,outOfStock1,removed1);
    }

    @Test
    void getTotal() {
        assertEquals(1,receipt1.getTotal());
    }

    @Test
    void getReceived() {
        assertEquals(received1,receipt1.getReceived());
    }

    @Test
    void getOutOfStock() {
        assertEquals(outOfStock1,receipt1.getOutOfStock());
    }

    @Test
    void getRemoved() {
        assertEquals(removed1,receipt1.getRemoved());
    }

    @Test
    void testEquals() {
        assertEquals(receipt1,receipt1);
        assertNotEquals(receipt1,receipt2);
        assertNotEquals(receipt1,"abc");
        assertEquals(receipt1,receipt3);
    }

    @Test
    void testHashCode() {
        int a = Objects.hash(receipt1.getTotal(), receipt1.getReceived(), receipt1.getOutOfStock(), receipt1.getRemoved());
        assertEquals(a,receipt1.hashCode());
    }
}