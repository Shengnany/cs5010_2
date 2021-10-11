package Problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    private final Map<String, List<StockItem>> stockService = new HashMap<>();
    private static final String GROCERY =  "Grocery";
    private static final String HOUSEHOLD =  "Household";
    private Inventory inventory1;
    private Inventory inventory2;
    private final String manufacturer1 = "A";
    private final Category category1 = Category.BEER;
    private final String name1 = "beer";
    private final double price1 = 1.1;
    private final int ALCOHOL_AGE = 21;
    private final double weight1 = 2.1;
    private final GroceryProduct product1 = new GroceryProduct(manufacturer1, category1, name1, price1, ALCOHOL_AGE, weight1);
    private final int quantity1 = 1;
    private final StockItem item1 = new StockItem(product1,quantity1);
    private final String manufacturer2 = "A";
    private final Category category2 = Category.PAPER_TOWELS;
    private final String name2 = "towels";
    private final double price2 = 1.1;
    private final int age2 = 21;
    private final int units2 =1;
    private final HouseholdProduct product2 = new HouseholdProduct(manufacturer2, category2, name2, price2, age2, units2);
    private final int quantity2 = 1;
    private final StockItem item2 = new StockItem(product2,quantity2);
    private final List<StockItem> groceryStock1 = new ArrayList<>();
    private final List<StockItem> houseHoldStock1  = new ArrayList<>();
    private final List<StockItem> groceryStock2 = new ArrayList<>();
    private final List<StockItem> houseHoldStock2 = new ArrayList<>();
    @BeforeEach
    void setUp() {
        stockService.put(GROCERY,groceryStock1);
        stockService.put(HOUSEHOLD,houseHoldStock1);
        groceryStock1.add(item1);
        houseHoldStock1.add(item2);
        inventory1 = new Inventory(groceryStock1,houseHoldStock1);
        HouseholdProduct product5 = new HouseholdProduct(manufacturer2, category2, name2, price2, age2, units2);
        StockItem item5 = new StockItem(product5,1);
        this.houseHoldStock2.add(item5);
        inventory2 = new Inventory(groceryStock2,houseHoldStock2);
    }

    @Test
    void addToGroceryStock() {
        GroceryProduct p = new GroceryProduct("a",Category.CHEESE,"cheese1", 2.2,0,0.3);
        StockItem item = inventory1.addToGroceryStock(p,1);
        assertTrue(groceryStock1.contains(item));
        assertEquals(1, groceryStock1.get(houseHoldStock1.size()-1).getQuantity());
    }

    @Test
    void addToHouseholdStock() {
        HouseholdProduct p = new HouseholdProduct("a",Category.SHAMPOO,"shampoo1",2.2,0,1);
        StockItem item = inventory1.addToHouseholdStock(p,1);
        assertTrue(houseHoldStock1.contains(item));
        assertEquals(1, houseHoldStock1.get(houseHoldStock1.size()-1).getQuantity());
    }

    @Test
    void getAllRetailValues() {
        assertEquals(2.2,inventory1.getAllRetailValues());
    }

    @Test
    void getNumOfProd() {
        assertEquals(1,inventory1.getNumOfProd(product1));
    }

    @Test
    void getStock() {
        assertEquals(1,inventory1.getNumOfProd(product1));
    }

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @Test
    void reduce() {
        GroceryProduct p = new GroceryProduct("b",Category.CHEESE,"cheese2",  2.2,0,0.3);
        StockItem item7 = inventory1.addToGroceryStock(p,1);
        this.inventory1.reduce(item7,7);
        int quantity3 = 2;
        HouseholdProduct product3 = new HouseholdProduct(manufacturer2, category2, name2, price2, age2, units2);
        StockItem item3 =  inventory1.addToHouseholdStock(product3,2);
        this.inventory1.reduce(item3,1);
        assertEquals(1,this.inventory1.getHouseHoldStock().get(this.inventory1.getHouseHoldStock().indexOf(item3)).getQuantity());
        this.inventory1.reduce(item3,1);
        assertFalse(this.inventory1.getHouseHoldStock().contains(item3));
        HouseholdProduct product4 = new HouseholdProduct(manufacturer2, category2, name2, price2, age2, units2);
        StockItem item4 = new StockItem(product4,quantity3);
        this.inventory1.reduce(item4,1);
    }

    @Test
    void testGetHouseHoldStock() {
        assertEquals(houseHoldStock1,this.inventory1.getHouseHoldStock());
    }

    @Test
    void testGetGroceryStock() {
        assertEquals(groceryStock1,this.inventory1.getGroceryStock());
    }


    @Test
    void testEquals() {
        assertNotEquals(inventory1,inventory2);
        assertEquals(inventory1,inventory1);
        assertNotEquals(inventory1,"a");
    }

    @Test
    void testHashCode() {
        int a = Objects.hash(stockService, groceryStock1, houseHoldStock1);
        assertEquals(a,inventory1.hashCode());
    }
}