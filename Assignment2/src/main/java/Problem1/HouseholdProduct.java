package Problem1;

import java.util.Objects;

/**
 *  a household product
 */
public class HouseholdProduct extends Product {
    private final double units;

    /**
     * set the units
     * @return units
     */
    public double getUnits() {
        return units;
    }

    /**
     * constructor
     * @param manufacturer manufacturer
     * @param category category
     * @param name name
     * @param price price
     * @param age age
     * @param units units
     */
    public HouseholdProduct(String manufacturer, Category category, String name, double price, Integer age, int units) {
        super(manufacturer, category, name, price, age);
        this.units = units;
    }

    /**
     * check if the two object are the same
     * @param o return the object to be compared
     * @return true if the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HouseholdProduct)) return false;
        if (!super.equals(o)) return false;
        HouseholdProduct that = (HouseholdProduct) o;
        return Double.compare(that.getUnits(), getUnits()) == 0;
    }

    /**
     * hash the object
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getUnits());
    }
}
