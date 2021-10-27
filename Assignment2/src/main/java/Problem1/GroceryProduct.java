package Problem1;

import java.util.Objects;

/**
 * GroceryProduct class
 */
public class GroceryProduct extends Product {
    private final double weight;

    /**
     * constructor
     *
     * @param manufacturer manufacturer
     * @param category     category
     * @param name         name
     * @param price        price
     * @param age          age
     * @param weight       weight
     */
    public GroceryProduct(String manufacturer, Category category, String name, double price, Integer age, double weight) {
        this.setManufacturer(manufacturer);
        this.setCategory(category);
        this.setName(name);
        this.setPrice(price);
        this.setAge(age);
        this.weight = weight;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroceryProduct)) return false;
        if (!super.equals(o)) return false;
        GroceryProduct product = (GroceryProduct) o;
        return Double.compare(product.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getCategory(), getName(), getPrice(), getAge(), weight);
    }

    @Override
    public String toString() {
        return "GroceryProduct{" +
                "weight=" + weight +
                '}';
    }
}
