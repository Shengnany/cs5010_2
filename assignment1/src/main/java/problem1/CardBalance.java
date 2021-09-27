package problem1;

import java.util.Objects;

/**
 * This class is for Card Balance
 */
public class CardBalance {
    private int dollar;
    private int cent;

    /**
     * An empty constructor
     */
    public CardBalance() {
    }
    /**
     * Create a card balance
     * @param dollar dollar amount of a CardBalance
     * @param cent cent amount of a CardBalance
     */
    public CardBalance(int dollar, int cent) {
        if (dollar >= 0) {
            this.dollar = dollar;
        } else {
            throw new IllegalArgumentException("dollar of card balance out of range");
        }
        if (cent >= 0 && cent <= 99) {
            this.cent = cent;
        } else {
            throw new IllegalArgumentException("cent of card balance out of range");
        }
    }

    /**
     *
     * @return dollar value of the cardBalance
     */
    public int getDollar() {
        return dollar;
    }

    /**
     * set the value of dollar within a range >0
     * @param dollar dollar value of the cardBalance
     */
    public void setDollar(int dollar) {
        if (dollar >= 0) {
            this.dollar = dollar;
        } else {
            throw new IllegalArgumentException("dollar of card balance out of range");
        }
    }

    /**
     * set the value cent value of cardBalance
     * @param cent cent value of the cardBalance
     */
    public void setCent(int cent) {
        if (cent >= 0 && cent <= 99) {
            this.cent = cent;
        } else {
            throw new IllegalArgumentException("cent of card balance out of range");
        }
    }

    /**
     *
     * @return cent value of the cardBalance
     */
    public int getCent() {
        return cent;
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
        CardBalance comparedObj = (CardBalance) object;
        return Objects.equals(dollar, comparedObj.dollar)
                && Objects.equals(cent, comparedObj.cent);
    }

    /**
     *
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.dollar, this.cent);
    }
}
