package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class AwardTest {
    private String name = "award";
    private String descrtion = "Award";
    private Award award;
    private String name1 = "award1";
    private String descrtion1= "Award1";
    private Award award1;

    @BeforeEach
    void setUp() {
        award = new Award(this.name,this.descrtion);
        award1 = new Award(this.name1,this.descrtion1);
    }

    @Test
    void getName() {
        assertEquals(this.name,this.award.getName());
    }

    @Test
    void setName() {
        assertEquals(this.name,this.award.getName());

    }

    @Test
    void getDescription() {
        assertEquals(this.descrtion,this.award.getDescription());

    }

    @Test
    void setDescription() {
        assertEquals(this.descrtion,this.award.getDescription());
    }
    @Test
    public void testEqual() {
        assertNotEquals(this.award,this.award1);
    }

    @Test
    public void testHashCode() {
        assertEquals(this.award.hashCode(), Objects.hash(this.name, this.descrtion));
    }
}