package Assignment2;

import java.util.Objects;

/**
 * Contains information of the restaurant
 */
public class Restaurant {
    private String name;
    private Address adress;
    private Menu menu;
    private Boolean open;

    /**
     * constructs the Restaurant
     * @param name name
     * @param adress adress
     * @param open open
     * @param menu menu
     */
    public Restaurant(String name, Address adress, Boolean open, Menu menu) {
        this.name = name;
        this.adress = adress;
        this.open = open;
        this.menu = menu;
    }

    /**
     * get the name of the restaurant
     * @return the name of the restaurnt
     */
    public String getName() {
        return name;
    }

    /**
     * set the name of the restaurant
     * @param name the name of the restaurant
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the address
     * @return the address
     */
    public Address getAdress() {
        return adress;
    }

    /**
     * set the address
     * @param adress  the address
     */
    public void setAdress(Address adress) {
        this.adress = adress;
    }

    /**
     * get the menu of the restaurant
     * @return the  menu of the restaurant
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * set the menu of the restaurant
     * @param menu the menu of the restaurant
     */
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    /**
     * whether the restaurant is open
     * @return
     */
    public Boolean getOpen() {
        return open;
    }

    /**
     * set the restaurant's state
     * @param open true  if the restaurant is open
     */
    public void setOpen(Boolean open) {
        this.open = open;
    }

    /**
     * equlas method
     * @param o the object to be compared
     * @return true if the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restaurant)) return false;
        Restaurant that = (Restaurant) o;
        return getName().equals(that.getName()) && getAdress().equals(that.getAdress()) && getMenu().equals(that.getMenu()) && getOpen().equals(that.getOpen());
    }

    /**
     * hash the object
     * @return the hashed object
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAdress(), getMenu(), getOpen());
    }

    /**
     * String representation of the object
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                ", menu=" + menu +
                ", open=" + open +
                '}';
    }
}
