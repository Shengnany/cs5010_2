package problem2;

import java.util.Objects;

/**
 * This class is for Serie
 */
public class Serie {

    private String name;
    private String description;

    /**
     *
     * @param name the name of the Serie
     * @param description the name of the Serie
     */
    public Serie(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     *
     * @return the name of the Serie
     */
    public String getName() {
        return name;
    }
    /**
     * set the name of the movie
     * @param name the name of the Serie
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the description of the Serie
     */
    public String getDescription() {
        return description;
    }

    /**
     * set the description of the Serie
     * @param description the description of the TV serie
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
        Serie compared = (Serie) object;
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
