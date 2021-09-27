package problem2;

import java.util.Objects;

/**
 * This class is for Award
 */
public class Award {
    private String name;
    private String description;

    /**
     *
     * @return the name of the award
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name the name of the award
     * @param description the name of the desciption
     */
    public Award(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * set the name of the award
     * @param name the name of the award
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the description of the award
     */
    public String getDescription() {
        return description;
    }

    /**
     * set the description of the award
     * @param description the description of the award
     */
    public void setDescription(String description) {
        this.description = description;
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
        Award compared = (Award) object;
        return Objects.equals(this.name, compared.getName())
                && Objects.equals(this.description, compared.getDescription());
    }
    /**
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.description);
    }
}
