package Assignment2;

import java.util.Objects;

/**
 * Address class contains information of the address of restaurant
 */
public class Address {
    private String streetAndNum;
    private String city;
    private String zip;
    private String state;
    private String country;


    /**
     * constructor
     * @param streetAndNum streetAndNum
     * @param city city
     * @param zip zip
     * @param state state
     * @param country country
     */
    public Address(String streetAndNum, String city, String zip, String state, String country) {
        this.streetAndNum = streetAndNum;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.country = country;
    }

    /**
     * return street and number
     * @return street and number
     */
    public String getStreetAndNum() {
        return streetAndNum;
    }

    /**
     * set street and number
     * @param streetAndNum street and number
     */
    public void setStreetAndNum(String streetAndNum) {
        this.streetAndNum = streetAndNum;
    }

    /**
     * get city
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * set city
     * @param city city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * return zip
     * @return set the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * set zip
     * @param zip zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * get state
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * set the state
     * @param state state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * get the country
     * @return set the country
     */
    public String getCountry() {
        return country;
    }
    /**
     * set the country
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * equlas method
     * @param o the object to be compared
     * @return true if the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getStreetAndNum().equals(address.getStreetAndNum()) && getCity().equals(address.getCity()) && getZip().equals(address.getZip()) && getState().equals(address.getState()) && getCountry().equals(address.getCountry());
    }

    /**
     * hash the object
     * @return the hashed object
     */
    @Override
    public int hashCode() {
        return Objects.hash(getStreetAndNum(), getCity(), getZip(), getState(), getCountry());
    }

    /**
     * String representation of the object
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "Address{" +
                "streetAndNum='" + streetAndNum + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
