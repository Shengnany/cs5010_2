package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CardOwnerTest {
    private String firstName = "Hunter";
    private String lastName = "Slu";
    private String address = "xxx";
    private String email = "xx@gmail.com";
    private CardOwner cardOwner;
    private String firstName1 = "Hunter";
    private String lastName1 = "Slu";
    private String address1 = "xxx";
    private String email1 = "xx@gmail.com";
    private CardOwner cardOwner1;
    @BeforeEach
    void setUp() {
        this.cardOwner = new CardOwner(this.firstName,this.lastName, this.address, this.email);
        this.cardOwner1 = new CardOwner(this.firstName1,this.lastName1, this.address1, this.email1);
    }

    @Test
    void getFirstName() {
        assertEquals(this.firstName,this.cardOwner.getFirstName());
    }

    @Test
    void setFirstName() {
        cardOwner.setFirstName(this.firstName);
        assertEquals(this.firstName,this.cardOwner.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals(this.lastName,this.cardOwner.getLastName());
    }

    @Test
    void setLastName() {
        this.cardOwner.setLastName(this.lastName);
        assertEquals(this.lastName,this.cardOwner.getLastName());
    }

    @Test
    void getAddress() {
        assertEquals(this.address,this.cardOwner.getAddress());
    }

    @Test
    void setAddress() {
        this.cardOwner.setAddress(this.address);
        assertEquals(this.address,this.cardOwner.getAddress());
    }

    @Test
    void getEmail() {
        assertEquals(this.email,this.cardOwner.getEmail());
    }

    @Test
    void setEmail() {
        this.cardOwner.setEmail(this.email);
        assertEquals(this.email,this.cardOwner.getEmail());
    }
    @Test
    public void testEqual() {
        assertEquals(cardOwner,cardOwner1);
    }

    @Test
    public void testHashCode() {
        assertEquals(cardOwner.hashCode(), Objects.hash(firstName, lastName, address, email));
    }
}
