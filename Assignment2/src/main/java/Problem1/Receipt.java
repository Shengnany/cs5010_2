package Problem1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This class summarizes the final order of a customer
 */
public class Receipt {
    private final double total;
    private final Map<Product, Integer> received;
    private final Map<Product, Integer> outOfStock;
    private final Map<Product, Integer> removed;

    /**
     * empty constructor
     */
    public Receipt() {
        this.total = 0;
        this.received = new HashMap<>();
        this.outOfStock = new HashMap<>();
        ;
        this.removed = new HashMap<>();
        ;
    }

    /**
     * constructor
     *
     * @param total      total price
     * @param received   actual received product
     * @param outOfStock product cannot be purchased or substituted
     * @param removed    product removed due to age restrictions
     */
    public Receipt(double total, Map<Product, Integer> received, Map<Product, Integer> outOfStock, Map<Product, Integer> removed) {
        this.received = received;
        this.outOfStock = outOfStock;
        this.total = total;
        this.removed = removed;
    }

    /**
     * Gets total.
     *
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Gets received.
     *
     * @return the received
     */
    public Map<Product, Integer> getReceived() {
        return received;
    }

    /**
     * Gets out of stock.
     *
     * @return the out of stock
     */
    public Map<Product, Integer> getOutOfStock() {
        return outOfStock;
    }

    /**
     * Gets removed.
     *
     * @return the removed
     */
    public Map<Product, Integer> getRemoved() {
        return removed;
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
        if (!(o instanceof Receipt)) {
            return false;
        }
        Receipt receipt = (Receipt) o;
        return Double.compare(receipt.getTotal(), getTotal()) == 0 && getReceived().equals(receipt.getReceived()) && getOutOfStock().equals(receipt.getOutOfStock()) && getRemoved().equals(receipt.getRemoved());
    }

    /**
     * hash the object
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getTotal(), getReceived(), getOutOfStock(), getRemoved());
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "total=" + total +
                ", received=" + received +
                ", outOfStock=" + outOfStock +
                ", removed=" + removed +
                '}';
    }
}
