package Problem1;

import java.util.Objects;

/**
 * GroceryProduct class
 */
public class GroceryProduct extends Product{
    private final double weight;

    /**
     * constructor
     * @param manufacturer manufacturer
     * @param category category
     * @param name name
     * @param price price
     * @param age age
     * @param weight weight
     */
    public GroceryProduct(String manufacturer, Category category, String name, double price, Integer age, double weight) {
        super(manufacturer, category, name, price, age);
        this.weight = weight;
    }

    /**
     * get weight
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * check if the two object are the same
     * @param o return the object to be compared
     * @return true if the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroceryProduct that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.getWeight(), getWeight()) == 0;
    }

    /**
     * hash the object
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWeight());
    }
}
