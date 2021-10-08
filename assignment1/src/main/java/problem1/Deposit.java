package problem1;

import java.util.Objects;

/**
 * This class is for Deposit
 */
public class Deposit {
    private String firstName;
    private String lastName;
    private int amountDollar;
    private int amountCent;

    /**
     *
     * @return the first name of card owner deposit
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * constructor of the deposit
     * @param firstName the first name of card owner deposit
     * @param lastName the last name of card owner deposit
     */
    public Deposit(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * initialize the deposit
     * @param firstName the firstname of the deposit is sent to
     * @param lastName the firstname of the deposit is sent to
     * @param amountDollar the dollar of the deposit
     * @param amountCent the cent of the deposit
     */
    public Deposit(String firstName, String lastName, int amountDollar, int amountCent) {
        if(amountDollar >= 5 && amountDollar <=50){
            this.amountDollar = amountDollar;
        }
        else throw new IllegalArgumentException("Not correct dollar");
        if( (amountDollar==50 && amountCent==0)|| (amountDollar >= 5 && amountDollar <50 && amountCent >= 0 && amountCent <=99)){
            this.amountCent = amountCent;
        }
        else throw new IllegalArgumentException("Not correct cent");
        if (lastName == null ) {
            throw new IllegalArgumentException("Not correct last name");
        } else {
            this.lastName = lastName;
        }
        if (firstName == null ) {
            throw new IllegalArgumentException("Not correct first name");
        } else {
            this.firstName = firstName;
        }
    }

    /**
     * set the first name of the deposit card owner
     * @param firstName the first name of deposit
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return the last name of the deposit owner
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set the last name of the deposit cardowner
     * @param lastName the last name of deposit
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return the amount dollar of the deposit cardowner
     */
    public int getAmountDollar() {
        return amountDollar;
    }

    /**
     *
     * @return the amount cent of the card owner
     */
    public int getAmountCent() {
        return amountCent;
    }

    /**
     * set the amount cent of the card owner
     * @param amountCent of the card owner
     */
    public void setAmountCent(int amountCent) {
        if( (amountDollar==50 && amountCent==0)|| (amountDollar >= 5 && amountDollar <50 && amountCent >= 0 && amountCent <=99)){
            this.amountCent = amountCent;
        }
        else throw new IllegalArgumentException("Not correct cent");
    }

    /**
     * set the amount dollar of the card owner
     * @param amountDollar amount dollar of the card owner
     */
    public void setAmountDollar(int amountDollar) {
        if(amountDollar >= 5 && amountDollar <=50){
            this.amountDollar = amountDollar;
        }
        else throw new IllegalArgumentException("Not correct dollar");
    }
    /***
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
        Deposit deposit = (Deposit) object;
        return this.amountDollar == deposit.amountDollar
                && this.amountCent == deposit.amountCent
                && Objects.equals(this.firstName, deposit.firstName)
                && Objects.equals(this.lastName, deposit.lastName);
    }
    /**
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(amountDollar, amountCent, firstName, lastName);
    }

}
