package Problem1;

import java.util.Objects;

/**
 * This class is a product
 */
public class Product {
    private final String manufacturer;
    private final Category category;
    private final String name;
    private double price;
    private Integer age;
    private final int ALCOHOL_AGE = 21;

    /**
     * constructor
     *
     * @param manufacturer manufacturer
     * @param category     category
     * @param name         name
     * @param price        price
     * @param age          age
     */
    public Product(String manufacturer, Category category, String name, double price, Integer age) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.name = name;
        this.price = price;
        if(this.category == Category.BEER){
            this.age = ALCOHOL_AGE;
        }
        else{
            this.age = age;
        }
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
     * get the c
     *
     * @return * get the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * check if the two object are the same
     * @param o return the object to be compared
     * @return true if the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getManufacturer().equals(product.getManufacturer()) && getCategory() == product.getCategory() && getName().equals(product.getName()) && getPrice() == product.getPrice() && getAge().equals(product.getAge());
    }

    /**
     * hash the object
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getCategory(), getName(), getPrice(), getAge(), ALCOHOL_AGE);
    }
}
