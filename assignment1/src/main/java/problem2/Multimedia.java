package problem2;

import java.util.Objects;

/**
 * This class is for Multi media
 */
public class Multimedia {
    private String name;
    private String description;

    /**
     *
     * @param name the name of the Multimedia
     * @param description the name of the Multimedia
     */
    public Multimedia(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     *
     * @return the name of the Multimedia
     */
    public String getName() {
        return name;
    }
    /**
     * set the name of the movie
     * @param name the name of the Multimedia
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the description of the Multimedia
     */
    public String getDescription() {
        return description;
    }

    /**
     * set the description of the Multimedia
     * @param description the description of the TV Serie
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
        Multimedia compared = (Multimedia) object;
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
