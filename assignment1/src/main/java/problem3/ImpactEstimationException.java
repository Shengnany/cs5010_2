package problem3;


/**
 * This class is for Impact Estimation Exception
 */
public class ImpactEstimationException extends Exception {

    /**
     * Throws exception if the impact cannot be evaluated
     * @param message the message explaining exception
     */
    public ImpactEstimationException(String message) {
        super(message);
    }
}
