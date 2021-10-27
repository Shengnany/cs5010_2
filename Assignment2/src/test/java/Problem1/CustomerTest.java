package Problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private static final String GROCERY = "Grocery";
    private static final String HOUSEHOLD = "Household";
    private List<StockItem> groceryStock;
    private List<StockItem> houseHoldStock;
    private Inventory inventory;
    private final Map<String, List<StockItem>> stockService = new HashMap<>();
    private String name1 = "a";
    private int age1 = 22;
    private Map<Product, Integer> productList1;
    private Cart cart1;
    private Customer customer1;
    private Customer customer11;
    private Customer customer12;
    private String name2 = "name2";
    private int age2 = 18;
    private Map<Product, Integer> productList2;
    private Cart cart2;
    private Customer customer2;

    @BeforeEach
    void setUp() {
        stockService.put(GROCERY, groceryStock);
        stockService.put(HOUSEHOLD, houseHoldStock);
        groceryStock = new ArrayList<>();
        houseHoldStock = new ArrayList<>();
        inventory = new Inventory(groceryStock, houseHoldStock);
        productList1 = new HashMap<>();
        this.cart1 = new Cart(productList1);
        customer1 = new Customer(inventory, name1, age1, cart1);
        productList2 = new HashMap<>();
        this.cart2 = new Cart(productList2);
        customer2 = new Customer(inventory, name2, age2, cart2);
        customer11 = new Customer(inventory, "a", 16, cart1);
        customer12 = new Customer(inventory, "a", 16, cart1);
    }

    @Test
    void getName() {
        assertEquals(this.name1, this.customer1.getName());
    }

    @Test
    void setName() {
        this.customer1.setName(name1);
        assertEquals(this.name1, this.customer1.getName());
    }

    @Test
    void getAge() {
        assertEquals(this.age1, this.customer1.getAge());
    }

    @Test
    void setAge() {
        this.customer1.setAge(age1);
        assertEquals(this.age1, this.customer1.getAge());
    }

    @Test
    void getCart() {
        assertEquals(this.cart1, this.customer1.getCart());
    }

    @Test
    void add() {
        GroceryProduct product = new GroceryProduct("e", Category.BEER, "x", 1, 1, 1.1);
        this.customer1.add(product, 2);
        assertFalse(this.customer1.getCart().getProductList().containsKey(product));
        StockItem item = inventory.addToGroceryStock(product, 2);
        this.customer1.add(product, 2);
        assertTrue(this.customer1.getCart().getProductList().containsKey(product));
        inventory.reduce(item, 2);
        this.customer1.getCart().emptyCart();
    }

    @Test
    void preCheckout() {
        GroceryProduct product_beer = new GroceryProduct("a", Category.BEER, "beerremove", 1, 21, 1.1);
        StockItem item_beer = inventory.addToGroceryStock(product_beer, 1);
        this.customer2.getCart().add(product_beer, 1);
        this.customer2.add(product_beer, 1); // age not satisfied

        HouseholdProduct product_shampoo = new HouseholdProduct("shampoo1", Category.SHAMPOO, "", 1, 0, 1);
        StockItem item_shampoo = inventory.addToGroceryStock(product_beer, 1);
        this.customer1.add(product_shampoo, 1); // age satisifed and amount satisifed

        GroceryProduct cheese = new GroceryProduct("x", Category.CHEESE, "cheese1", 1, 0, 1.1);
        GroceryProduct cheeseSubstitute = new GroceryProduct("y", Category.CHEESE, "cheese2", 1, 0, 1.1);
        GroceryProduct lessWeiHigherPrice = new GroceryProduct("y", Category.CHEESE, "cheese3", 2, 0, 0.1);
        HouseholdProduct paper = new HouseholdProduct("c", Category.PAPER_TOWELS, "x1", 1, 0, 1);
        HouseholdProduct paperSubstitute = new HouseholdProduct("c", Category.PAPER_TOWELS, "x2", 1, 0, 1);
        HouseholdProduct lessUnitHigherPrice = new HouseholdProduct("c", Category.PAPER_TOWELS, "x3", 2, 0, 0);
        GroceryProduct product_shampoo_outOfStock = new GroceryProduct("c", Category.SHAMPOO, "out_of_sotck_shampoo", 2, 0, 2.1);
        StockItem item_cheese1 = inventory.addToGroceryStock(cheese, 1);
        StockItem item_cheese2 = inventory.addToGroceryStock(cheeseSubstitute, 2);
        StockItem item_cheese3 = inventory.addToGroceryStock(lessWeiHigherPrice, 2);
        StockItem item_paper1 = inventory.addToHouseholdStock(paper, 1);
        StockItem item_paper2 = inventory.addToHouseholdStock(paperSubstitute, 2);
        StockItem item_paper3 = inventory.addToHouseholdStock(lessUnitHigherPrice, 2);
        this.customer1.getCart().add(cheese, 2); // not enough
        this.customer1.getCart().add(paper, 2); // not enough
        this.customer1.add(product_shampoo_outOfStock, 1);
        Receipt receipt2 = customer2.preCheckout();
        assertTrue(receipt2.getRemoved().containsKey(product_beer));
        Receipt receipt1 = customer1.preCheckout();
        assertEquals(1, (int) receipt1.getReceived().get(cheese));
        assertEquals(1, (int) receipt1.getReceived().get(cheeseSubstitute));
        assertEquals(1, (int) receipt1.getReceived().get(paper));
        assertEquals(1, (int) receipt1.getReceived().get(paperSubstitute));
    }

    @Test
    void checkout() {
        customer1.preCheckout();
        customer1.checkout();
        assertTrue(customer1.getCart().getProductList().isEmpty());
    }

    @Test
    void testEquals() {
        assertEquals(customer11, customer12);
        assertEquals(customer1, customer1);
        assertNotEquals(customer1, customer2);
        assertNotEquals(customer1, "customer1");
    }

    @Test
    void testHashCode() {
        assertEquals(Objects.hash(customer1.getName(), customer1.getAge(), customer1.getCart(), inventory), customer1.hashCode());
    }
}
