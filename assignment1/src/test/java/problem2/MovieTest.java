package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    private String name = "movie1";
    private String descrtion = "Movie";
    private Movie movie;
    private String name1 = "movie2";
    private String descrtion1 = "Movie";
    private Movie movie1;

    @BeforeEach
    void setUp() {
        movie = new Movie(this.name,this.descrtion);
        movie1 = new Movie(this.name1,this.descrtion1);
    }

    @Test
    void getName() {
        assertEquals(this.name,this.movie.getName());
    }

    @Test
    void setName() {
        assertEquals(this.name,this.movie.getName());

    }

    @Test
    void getDescription() {
        assertEquals(this.descrtion,this.movie.getDescription());

    }

    @Test
    void setDescription() {
        assertEquals(this.descrtion,this.movie.getDescription());
    }

    @Test
    public void testEqual() {
        assertNotEquals(this.movie,this.movie1);
    }

    @Test
    public void testHashCode() {
        assertEquals(this.movie.hashCode(), Objects.hash(this.name, this.descrtion));
    }
}