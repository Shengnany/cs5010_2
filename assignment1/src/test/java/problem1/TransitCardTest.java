package problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TransitCardTest {
    private CardOwner owner;
    private TransitCard card;
    private TransitCard card1;
    private int dollar = 3;
    private int cent = 99;
    private CardBalance balance;
    private Deposit deposit = new Deposit("John","Pet",6,11);
    private Deposit deposit1 = new Deposit("John","Pt",6,11);
    @Test
    void getCardBalance() {
        card = new TransitCard(balance,owner);
    }

    @BeforeEach
    public void setUp(){
        this.owner = new CardOwner("John","Pet","xxx","xxx@gmail.co,");
        this.balance = new CardBalance(this.dollar, this.cent);
        this.card = new TransitCard(balance, owner);
        this.balance = new CardBalance(123, 50);
        this.card1 = new TransitCard(balance,owner);
    }

    @Test
    void setCardBalance() {
        this.card.setCardBalance(balance);
        assertEquals(this.balance,this.card.getCardBalance());
    }

    @Test
    void getCardOwner() {
        assertEquals(this.owner,this.card.getCardOwner());
    }

    @Test
    void setCardOwner() {
        this.card.setCardOwner(owner);
        assertEquals(this.owner,card.getCardOwner());
    }

    @Test
    void depositMoney() {
        this.card.depositMoney(deposit);
    }

    @Test
    void depositMoney1() {
        assertThrows(IllegalArgumentException.class, () -> {
            this.card.depositMoney(deposit1);
        });
    }

    @Test
    public void testEqual() {
        assertEquals(this.card,this.card);
    }

    @Test
    public void testHashCode() {
        assertEquals(this.card.hashCode(), Objects.hash(this.card.getCardOwner(), this.card.getCardBalance()));
    }
}