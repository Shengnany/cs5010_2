package problem2;

import java.util.Objects;

/**
 * This class is for Movie
 */
public class Movie {
    private String name;
    private String description;

    /**
     *
     * @param name the name of the movie
     * @param description the name of the movie
     */
    public Movie(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     *
     * @return the name of the movie
     */
    public String getName() {
        return name;
    }
    /**
     * set the name of the movie
     * @param name the name of the movie
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the description of the movie
     */
    public String getDescription() {
        return description;
    }

    /**
     * set the description of the movie
     * @param description description of the movie
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
        Movie compared = (Movie) object;
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
