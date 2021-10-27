package Problem1;

/**
 * This class is for Illegal Purchase Exception
 */
public class IllegalPurchaseException extends Exception {
    /**
     * Throws exception if the item cannot be purchased
     *
     * @param message the message explaining exception
     */
    public IllegalPurchaseException(String message) {
        super(message);
    }
}
