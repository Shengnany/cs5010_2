package Problem1;

import java.util.*;

/**
 * This class is for inventory, contains information about stocks and how to update stock
 */
public class Inventory {
    private final Map<String, List<StockItem>> stockService = new HashMap<>();
    private static final String GROCERY = "Grocery";
    private static final String HOUSEHOLD = "Household";
    /**
     * The Grocery stock.
     */
    List<StockItem> groceryStock;
    /**
     * The House hold stock.
     */
    List<StockItem> houseHoldStock;

    /**
     * constructor for inventory
     *
     * @param groceryStock   the stock for grocery
     * @param householdStock the stock for household
     */
    public Inventory(List<StockItem> groceryStock, List<StockItem> householdStock) {
        this.groceryStock = groceryStock;
        this.houseHoldStock = householdStock;
        stockService.put(GROCERY, groceryStock);
        stockService.put(HOUSEHOLD, householdStock);
    }


    /**
     * Add to grocery stock stock item.
     *
     * @param groceryProduct the grocery product
     * @param quantity       the quantity
     * @return the stock item
     */
    public StockItem addToGroceryStock(GroceryProduct groceryProduct, int quantity) {
        StockItem p = new StockItem(groceryProduct, quantity);
        groceryStock.add(p);
        return p;
    }


    /**
     * Add to household stock stock item.
     *
     * @param householdProduct the household product
     * @param quantity         the quantity
     * @return the stock item
     */
    public StockItem addToHouseholdStock(HouseholdProduct householdProduct, int quantity) {
        StockItem p = new StockItem(householdProduct, quantity);
        houseHoldStock.add(p);
        return p;
    }

    /**
     * Gets grocery stock.
     *
     * @return the grocery stock
     */
    public List<StockItem> getGroceryStock() {
        return groceryStock;
    }

    /**
     * Gets household stock.
     *
     * @return the household stock
     */
    public List<StockItem> getHouseHoldStock() {
        return houseHoldStock;
    }

    /**
     * get the retail values of all items in the stock
     *
     * @return the retail values of all items in the stock
     */
    public double getAllRetailValues() {
        double sum = 0;
        for (List<StockItem> stock : stockService.values()) {
            for (StockItem item : stock) {
                sum += item.getQuantity() * item.getProduct().getPrice();
            }
        }
        return sum;
    }

    /**
     * check the number of items of a specific product to purchase
     *
     * @param product the product customer would like to add to cart
     * @return the number of items of a specific product to purchase
     */
    public int getNumOfProd(Product product) {
        List<StockItem> stock = getStock(product);
        int count = 0;
        for (StockItem item : stock) {
            if (item.getProduct().equals(product)) {
                count += item.getQuantity();
            }
        }
        return count;
    }

    /**
     * get the stock a product belongs to
     *
     * @param product the product
     * @return the stock a product belongs to
     */
    public List<StockItem> getStock(Product product) {
        List<StockItem> stock;
        if (product instanceof GroceryProduct) {
            stock = stockService.get(GROCERY);
        } else {
            stock = stockService.get(HOUSEHOLD);
        }
        return stock;
    }

    /**
     * reduce the quantity of an item in the event of a purchase
     *
     * @param item   the item
     * @param amount the amount
     */
    public void reduce(StockItem item, int amount) {
        try {
            List<StockItem> stock = getStock(item.getProduct());
            if (stock.contains(item)) {
                if (item.isEnough(amount)) {
                    item.setQuantity(item.getQuantity() - amount);
                    if (item.getQuantity() == 0) {
                        stock.remove(item);
                    }
                } else {
                    throw new IllegalPurchaseException("Cannot complete the purchase for the amount");
                }
            } else {
                throw new IllegalPurchaseException("Cannot complete the purchase for the item");
            }
        } catch (IllegalPurchaseException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * check if the two object are the same
     *
     * @param o return the object to be compared
     * @return true if the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Inventory inventory)) {
            return false;
        }
        return stockService.equals(inventory.stockService) && groceryStock.equals(inventory.groceryStock) && houseHoldStock.equals(inventory.houseHoldStock);
    }

    /**
     * hash the object
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(stockService, groceryStock, houseHoldStock);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "stockService=" + stockService +
                ", groceryStock=" + groceryStock +
                ", houseHoldStock=" + houseHoldStock +
                '}';
    }
}
