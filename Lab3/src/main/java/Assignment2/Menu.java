package Assignment2;

import java.util.List;
import java.util.Objects;

/**
 * Class Menu contains information of the menu
 */
public class Menu {
    private List<String> meals;
    private List<String> desserts;
    private List<String> beverages;
    private List<String> drinks;

    /**
     * constructor of the menu
     * @param meals meals
     * @param desserts desserts
     * @param beverages beverages
     * @param drinks drinks
     */
    public Menu(List<String> meals, List<String> desserts, List<String> beverages, List<String> drinks) {
        this.meals = meals;
        this.desserts = desserts;
        this.beverages = beverages;
        this.drinks = drinks;
    }

    /**
     * set the meals
     * @return the list of meals
     */
    public List<String> getMeals() {
        return meals;
    }

    /**
     * set the meals
     * @param meals list of meals
     */
    public void setMeals(List<String> meals) {
        this.meals = meals;
    }

    /**
     * get the desserts
     * @return list of desserts
     */
    public List<String> getDesserts() {
        return desserts;
    }

    /**
     * set the desserts
     * @param desserts list of desserts
     */
    public void setDesserts(List<String> desserts) {
        this.desserts = desserts;
    }

    /**
     * get the beverages
     * @return list of beverages
     */
    public List<String> getBeverages() {
        return beverages;
    }

    /**
     * set the beverages
     * @param beverages list of beverages
     */
    public void setBeverages(List<String> beverages) {
        this.beverages = beverages;
    }

    /**
     * get the drinks
     * @return list of drinks
     */
    public List<String> getDrinks() {
        return drinks;
    }

    /**
     * set the drinks
     * @param drinks list of drinks
     */
    public void setDrinks(List<String> drinks) {
        this.drinks = drinks;
    }

    /**
     * equlas method
     * @param o the object to be compared
     * @return true if the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return Objects.equals(getMeals(), menu.getMeals()) && Objects.equals(getDesserts(), menu.getDesserts()) && Objects.equals(getBeverages(), menu.getBeverages()) && Objects.equals(getDrinks(), menu.getDrinks());
    }

    /**
     * hash the object
     * @return the hashed object
     */
    @Override
    public int hashCode() {
        return Objects.hash(getMeals(), getDesserts(), getBeverages(), getDrinks());
    }

    /**
     * String representation of the object
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "Menu{" +
                "meals=" + meals +
                ", desserts=" + desserts +
                ", beverages=" + beverages +
                ", drinks=" + drinks +
                '}';
    }
}
