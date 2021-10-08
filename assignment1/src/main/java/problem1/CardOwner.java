package problem1;

import java.util.Objects;

/**
 * This class is for Card Owner
 */
public class CardOwner {
    private String firstName;
    private String lastName;
    private String address;
    private String email;

    /**
     * An empty constructor
     */
    public CardOwner() {
    }

    /**
     * Initialize a CardOwner
     * @param firstName the firstname of a cardowner
     * @param lastName the lastname of a cardowner
     * @param address the address of a cardowner
     * @param email the email of a cardowner
     */
    public CardOwner(String firstName, String lastName, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    /**
     *
     * @return the first name of a cardowner
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set the firstname of a cardowner
     * @param firstName the firstname of a cardowner
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return the lastname of a cardowner
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set the the lastname of a cardowner
     * @param lastName the lastname of a cardowner
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the address of a cardowner
     */
    public String getAddress() {
        return address;
    }

    /**
     * set the address of a cardowner
     * @param address  the address of a cardowner
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return  the email of a cardOwner
     */
    public String getEmail() {
        return email;
    }

    /**
     * set the email of a cardOwner
     * @param email the email of a cardOwner
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param object the object to be compared
     * @return boolean true if equals
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        CardOwner cardOwner = (CardOwner) object;
        return Objects.equals(firstName, cardOwner.firstName)
                && Objects.equals(lastName, cardOwner.lastName)
                && Objects.equals(address, cardOwner.address)
                && Objects.equals(email, cardOwner.email);
    }
    /**
     *
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName, this.address, this.email);
    }
}

