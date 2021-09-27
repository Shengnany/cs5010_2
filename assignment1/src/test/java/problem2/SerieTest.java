package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class SerieTest {
    private String name = "serie";
    private String descrtion = "Serie";
    private Serie serie;
    private String name1 = "serie1";
    private String descrtion1 = "Serie";
    private Serie serie1;

    @BeforeEach
    void setUp() {
        serie = new Serie(this.name,this.descrtion);
        serie1 = new Serie(this.name1,this.descrtion1);
    }

    @Test
    void getName() {
        assertEquals(this.name,this.serie.getName());
    }

    @Test
    void setName() {
        assertEquals(this.name,this.serie.getName());

    }

    @Test
    void getDescription() {
        assertEquals(this.descrtion,this.serie.getDescription());

    }

    @Test
    void setDescription() {
        assertEquals(this.descrtion,this.serie.getDescription());

    }
    @Test
    public void testEqual() {
        assertNotEquals(this.serie,this.serie1);
    }

    @Test
    public void testHashCode() {
        assertEquals(this.serie.hashCode(), Objects.hash(this.name, this.descrtion));
    }
}