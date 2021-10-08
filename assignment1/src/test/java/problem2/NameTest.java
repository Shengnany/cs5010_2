package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {
    private String firstName = "x";
    private String lastName = "y";
    private Name name;
    private String firstName1 = "x";
    private String lastName1 = "z";
    private Name name1;

    @BeforeEach
    void setUp() {
        this.name = new Name(this.firstName,this.lastName);
        this.name1 = new Name(this.firstName1,this.lastName1);
    }

    @Test
    void getFirstName() {
        assertEquals(this.firstName,this.name.getFirstName());
    }

    @Test
    void setFirstName() {
        assertEquals(this.firstName,this.name.getFirstName());

    }

    @Test
    void getLastName() {
        assertEquals(this.lastName,this.name.getLastName());
    }

    @Test
    void setLastName() {
        assertEquals(this.lastName,this.name.getLastName());
    }
    @Test
    public void testEqual() {
        assertNotEquals(this.name,this.name1);
    }

    @Test
    public void testHashCode() {
        assertEquals(this.name.hashCode(), Objects.hash(this.firstName, this.lastName));
    }
}