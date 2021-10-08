package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class MultimediaTest {
    private String name = "mult";
    private String descrtion = "Mult";
    private Multimedia multiMedia;
    private String name1 = "mult1";
    private String descrtion1 = "Mult";
    private Multimedia multiMedia1;

    @BeforeEach
    void setUp() {
        this.multiMedia = new Multimedia(this.name,this.descrtion);
        this.multiMedia1 = new Multimedia(this.name1,this.descrtion1);
    }

    @Test
    void getName() {
        assertEquals(this.name,this.multiMedia.getName());
    }

    @Test
    void setName() {
        assertEquals(this.name,this.multiMedia.getName());

    }

    @Test
    void getDescription() {
        assertEquals(this.descrtion,this.multiMedia.getDescription());

    }

    @Test
    void setDescription() {
        assertEquals(this.descrtion,this.multiMedia.getDescription());
    }
    @Test
    public void testEqual() {
        assertNotEquals(this.multiMedia,this.multiMedia1);
    }

    @Test
    public void testHashCode() {
        assertEquals(this.multiMedia.hashCode(), Objects.hash(this.name, this.descrtion));
    }
}