package Assignment1;

import java.util.Objects;

/**
 * This class contains first name and last name
 */
public class Name {
    private final String FNAME;
    private final String LNAME;

//    /**
//     * return the first name
//     * @return the first name
//     */
//    public String getFname() {
//        return fname;
//    }
//
//    /**
//     * set the first name
//     * @param fname the first name
//     */
//    public void setFname(String fname) {
//        this.fname = fname;
//    }
//    /**
//     * return the last name
//     * @return the last name
//     */
//    public String getLname() {
//        return lname;
//    }
//
//    /**
//     * set the last name
//     * @param lname the last name
//     */
//    public void setLname(String lname) {
//        this.lname = lname;
//    }

    /**
     * construct the Name
     * @param fname the first name
     * @param lname the last name
     */
    public Name(String fname, String lname) {
        this.FNAME = fname;
        this.LNAME = lname;
    }
    /**
     * check if two objects are the same
     * @param o the Object to compare
     * @return true if equals false if not
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Name)) return false;
        Name name = (Name) o;
        return this.FNAME.equals(name.FNAME) && this.LNAME.equals(name.LNAME);
    }

    /**
     * String representation
     * @return String representation of the object
     */
    @Override
    public String toString() {
        return "Name{" +
                "fname='" + this.FNAME + '\'' +
                ", lname='" + this.LNAME + '\'' +
                '}';
    }
    /**
     * hash the object
     * @return the hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.FNAME, this.LNAME);
    }
}
