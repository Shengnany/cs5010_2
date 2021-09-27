package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class DepositTest {

    private Deposit newDeposit;
    private int dollar = 20;
    private int cent = 11;
    private String firstName = "John";
    private String lastName = "Waston";

    private Deposit newDeposit2;
    private int dollar2 = 20;
    private int cent2 = 11;
    private String firstName2 = "John";
    private String lastName2 = "Waston";

    private Deposit newDeposit1;
    private int dollar1 = -20;
    private int cent1 = 111;
    private String firstName1 = "John1";
    private String lastName1 = "Waston1";

    @BeforeEach
    void setUp() {
        this.newDeposit = new Deposit(this.firstName, this.lastName,this.dollar, this.cent);
        this.newDeposit2 = new Deposit(this.firstName2, this.lastName2,this.dollar2, this.cent2);
        assertThrows(IllegalArgumentException.class, () -> {
            this.newDeposit1 = new Deposit(firstName1,lastName1,this.dollar1,this.cent1);
        });
    }

    @Test
    void setAmountCent1() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.newDeposit.setAmountCent(this.cent1);
        });
    }

    @Test
    void setAmountDollar1() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.newDeposit.setAmountDollar(this.dollar1);
        });
    }
    @Test
    void setFirstName() {
          this.newDeposit.setFirstName(this.firstName);
          assertEquals(this.firstName,newDeposit.getFirstName());

    }
    @Test
    void setLastName() {
            this.newDeposit.setLastName(this.lastName);
            assertEquals(this.lastName,newDeposit.getLastName());
    }



    @Test
    void getFirstName() {
        assertEquals(this.firstName,newDeposit.getFirstName());
    }


    @Test
    void getLastName() {
        assertEquals(this.lastName,newDeposit.getLastName());
    }



    @Test
    void getAmountDollar() {
        assertEquals(this.dollar,newDeposit.getAmountDollar());
    }

    @Test
    void getAmountCent() {
        assertEquals(this.cent,newDeposit.getAmountCent());    }
    @Test
    void setAmountCent() {
            this.newDeposit.setAmountCent(this.cent);
            assertEquals(this.cent,newDeposit.getAmountCent());
    }

    @Test
    void setAmountDollar() {
            this.newDeposit.setAmountDollar(this.dollar);
            assertEquals(this.dollar,newDeposit.getAmountDollar());
    }
    @Test
    public void testEqual() {
        assertEquals(newDeposit,newDeposit2);
    }

    @Test
    public void testHashCode() {
        assertEquals(newDeposit.hashCode(), Objects.hash(dollar, cent, firstName, lastName));
    }
}