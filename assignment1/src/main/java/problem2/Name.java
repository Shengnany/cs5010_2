package problem2;

import java.util.Objects;

/**
 * This class is for Name
 */
public class Name {
    private String firstName;
    private String lastName;

    /**
     * initializes and contructs the Name
     * @param firstName the first name of the artist
     * @param lastName the last name of the artist
     */
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *
     * @return the first name of the artist
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set the first name of the artist
     * @param firstName the first name of the artist
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return the last name of the artist
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set the last name of the artist
     * @param lastName  the last name of the artist
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * @param object object.
     * @return boolean.
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Name compared = (Name) object;
        return Objects.equals(this.firstName, compared.getFirstName())
                && Objects.equals(this.lastName, compared.getLastName());
    }
    /**
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.firstName, this.lastName);
    }
}
