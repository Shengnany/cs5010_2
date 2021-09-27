package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CardBalanceTest {
    private int cent1 = 119;
    private int dollar1 = -11;
    private CardBalance cardBalance1;
    private int cent2 = 10;
    private int dollar2 = 11;
    private CardBalance cardBalance2;
    private int cent3 = 10;
    private int dollar3 = 111;
    private CardBalance cardBalance3;
    private int cent4 = 20;
    private int dollar4 = 131;
    @BeforeEach
    public void setUp() throws Exception {
        this.cardBalance3 = new CardBalance(dollar3,cent3);
        this.cardBalance2 = new CardBalance(dollar2,cent2);
        assertThrows(IllegalArgumentException.class, () -> {
            this.cardBalance1 = new CardBalance(dollar1,cent1);
        });
    }

    @Test
    public void getCent() {
        assertEquals(this.cent3,cardBalance3.getCent());
    }

    @Test
    public void getDollar() {
        assertEquals(this.cent3,cardBalance3.getCent());
    }

    @Test
    public void setCent() {
            cardBalance2.setCent(cent4);
            assertEquals(cent4,cardBalance2.getCent());
    }
    @Test
    public void setCent1() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.cardBalance3.setCent(cent1);
        });
    }

    @Test
    public void setDollar() {
        cardBalance2.setDollar(dollar4);
        assertEquals(dollar4,cardBalance2.getDollar());
    }

    @Test
    public void setDollar1() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.cardBalance3.setDollar(dollar1);
        });
    }



    @Test
    public void testEqual() {
        assertEquals(cardBalance2, cardBalance2);
    }

    @Test
    public void testHashCode() {
        assertEquals(cardBalance2.hashCode(), Objects.hash(dollar2, cent2));
    }

}