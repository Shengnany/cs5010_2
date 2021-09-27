package problem1;

import java.util.Objects;

/**
 * This class is for Transit Card
 */
public class TransitCard {
    private CardBalance cardBalance;
    private CardOwner cardOwner;

    /**
     * empty constructor of transit card
     */
    public TransitCard() {
    }

    /**
     *
     * @return the CardBalance
     */
    public CardBalance getCardBalance() {
        return cardBalance;
    }

    /**
     * set the card balance
     * @param cardBalance card balance
     */
    public void setCardBalance(CardBalance cardBalance) {
        this.cardBalance = cardBalance;
    }

    /**
     *
     * @return the cardOwner
     */
    public CardOwner getCardOwner() {
        return cardOwner;
    }

    /**
     * set the card owner
     * @param cardOwner the card owner of the card
     */
    public void setCardOwner(CardOwner cardOwner) {
        this.cardOwner = cardOwner;
    }

    /**
     * set the card balance and card owner
     * @param cardBalance card balance
     * @param cardOwner card owner
     */
    public TransitCard(CardBalance cardBalance, CardOwner cardOwner) {
        this.cardBalance = cardBalance;
        this.cardOwner = cardOwner;
    }

    /**
     * set the deposit
     * @param newDeposit the deposit of the transaction
     */
    public void depositMoney(Deposit newDeposit){
        if(newDeposit.getFirstName().equals(this.cardOwner.getFirstName())
                && newDeposit.getLastName().equals(this.cardOwner.getLastName())){
            if(newDeposit.getAmountCent() + this.cardBalance.getCent() >=100) {
                this.cardBalance.setCent(this.cardBalance.getCent() + newDeposit.getAmountCent() - 100);
                this.cardBalance.setDollar(this.cardBalance.getDollar() + newDeposit.getAmountDollar() + 1);
            }
            else {
                this.cardBalance.setCent(this.cardBalance.getCent() + newDeposit.getAmountCent() );
                this.cardBalance.setDollar(this.cardBalance.getDollar() + newDeposit.getAmountDollar() );

            }
        }
        else{
            throw new IllegalArgumentException(
                    "The card owner provided doesn't match the information on file" );
            }
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
        TransitCard compared = (TransitCard) object;
        return Objects.equals(cardOwner, compared.cardOwner)
                && Objects.equals(cardBalance, compared.cardBalance);
    }
    /**
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(cardOwner, cardBalance);
    }
    }

