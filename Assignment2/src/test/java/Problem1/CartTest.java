package Problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    private HouseholdProduct product1 = new HouseholdProduct("a",Category.PAPER_TOWELS,"x",1,1,1);
    private GroceryProduct product2 = new GroceryProduct("b",Category.SALMON,"x",1,1,1.1);
    private GroceryProduct product3 = new GroceryProduct("c",Category.CHEESE,"x",1,1,1.1);
    HouseholdProduct product4 = new HouseholdProduct("d",Category.SHAMPOO,"x",1,1,1);
    private Map<Product, Integer> productList;
    private Map<Product, Integer> productList2;
    private Map<Product, Integer> productList3;
    private Map<Product, Integer> productList4;
    private Cart cart1;
    private Cart cart2;
    private Cart cart3;
    private Cart cart4;
    @BeforeEach
    void setUp() {
        productList = new HashMap<>();
        productList.put(product1,1);
        productList.put(product2,1);
        productList.put(product3,1);
        cart1 = new Cart(productList);
        productList2 = new HashMap<>();
        productList2.put(product1,1);
        productList2.put(product2,1);
        productList2.put(product3,1);
        cart2 = new Cart(productList2);
        productList3 = new HashMap<>();
        productList3.put(product4,1);
        productList3.put(product2,1);
        productList3.put(product1,1);
        cart3 = new Cart(productList3);
        productList4 = new HashMap<>();
        productList4.put(product4,1);
        cart4 = new Cart(productList3);
    }

    @Test
    void getProductList() {
        assertEquals(productList,cart1.getProductList());
    }

    @Test
    void emptyCart() {
        cart4.emptyCart();
        assertTrue(cart4.getProductList().isEmpty());
    }

    @Test
    void getCosts() {
        assertEquals(3,cart1.getCosts());
    }

    @Test
    void add() {
        cart4.emptyCart();
        cart4.add(product1,1);
        assertTrue(cart4.getProductList().containsKey(product1));
        assertEquals(cart4.getProductList().get(product1),1);
    }

    @Test
    void testEquals() {
        assertEquals(cart1,cart2);
        assertEquals(cart1,cart1);
        assertNotEquals(cart1,"cart1");
        assertNotEquals(cart1,cart3);
    }

    @Test
    void testHashCode() {
        assertEquals(Objects.hash(cart1.getProductList()), cart1.hashCode());
    }
}