package Problem1;

import java.util.Objects;

/**
 * This class represents a product in the stock system
 */
public class StockItem {
    private int quantity = 0;
    private Product product;

    /**
     * constructor
     *
     * @param p        the product
     * @param quantity the quantity
     */
    public StockItem(Product p, int quantity) {
        this.product = p;
        this.quantity = quantity;
    }

    /**
     * get the product
     *
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * set the quantity of the product
     *
     * @param quantity the quantity of the product
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * get the quantity of the product
     *
     * @return the quantity of the product
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * check if the quantity of the item is larger than a specific number
     *
     * @param amount amount
     * @return true if quantity > amount
     */
    public boolean isEnough(int amount) {
        return this.quantity >= amount;
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
        if (!(o instanceof StockItem)) {
            return false;
        }
        StockItem stockItem = (StockItem) o;
        return getQuantity() == stockItem.getQuantity() && getProduct().equals(stockItem.getProduct());
    }

    /**
     * hash the object
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getQuantity(), getProduct());
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "quantity=" + quantity +
                ", product=" + product +
                '}';
    }
}
