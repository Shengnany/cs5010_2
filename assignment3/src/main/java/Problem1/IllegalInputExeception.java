package Problem1;

/**
 * This Exception is used for unrecognized inputs or keywords in the templates to be replaced
 */
public class IllegalInputExeception extends Exception{
    /**
     * Constructor
     * @param message the message of the Exception
     */
    public IllegalInputExeception(String message){
        super(message);
    }
}
