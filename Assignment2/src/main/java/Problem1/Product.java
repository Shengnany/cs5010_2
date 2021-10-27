package Problem1;

import java.util.Objects;

/**
 * This class is a product
 */
public abstract class Product {
    private String manufacturer;
    private Category category;
    private String name;
    private double price;
    private Integer age;
    private final int ALCOHOL_AGE = 21;

    /**
     * Sets manufacturer.
     *
     * @param manufacturer the manufacturer
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set the price
     *
     * @param price price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * set age
     *
     * @param age minimum age to buy the product
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * get the manufacturer
     *
     * @return manufacturer manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * get the price
     *
     * @return price price
     */
    public double getPrice() {
        return price;
    }

    /**
     * get the name
     *
     * @return name name
     */
    public String getName() {
        return name;
    }

    /**
     * get the age
     *
     * @return age age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Gets category.
     *
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getManufacturer(), product.getManufacturer()) && getCategory() == product.getCategory() && Objects.equals(getName(), product.getName()) && Objects.equals(getAge(), product.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getCategory(), getName(), getPrice(), getAge());
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacturer='" + manufacturer + '\'' +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                ", ALCOHOL_AGE=" + ALCOHOL_AGE +
                '}';
    }
}
