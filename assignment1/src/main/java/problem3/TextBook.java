package problem3;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class is for Textbook
 */
public class TextBook extends Book{
//    /**
//     * constructs and initializes a TextBook
//     * @param title the title of the TextBook
//     * @param authors the authors of the TextBook
//     * @param publishingYear the publishing year of the TextBook
//     * @param numOfCite the number of citations of the TextBook
//     */
//    public TextBook(String title, String[] authors, Integer publishingYear, Integer numOfCite) {
//        super(title, authors, publishingYear, numOfCite);
//    }

    /**
     * the constructor of textbook
     * @param title the tile of textbook
     * @param authors the authors of textbook
     * @param publishingYear the publishing year of textbook
     * @param numOfCite the numOfCite of textbook
     * @param publishCompany the publishCompany  of textbook
     * @param numPages the numPages of textbook
     */
    public TextBook(String title, String[] authors, Integer publishingYear, Integer numOfCite,   String publishCompany,
                        Integer numPages) {
        super(title, authors, publishingYear, numOfCite);
        this.setPublishCompany(publishCompany);
        this.setNumPages(numPages);
    }
    /**
     * estimates the impact of the TextBook
     * @return the estimated impact of the TextBook
     * @throws ImpactEstimationException throws exception if can not be estimated
     */
    @Override
    public double estimateImpact() throws ImpactEstimationException {
        if(getAge()>250){
            throw new ImpactEstimationException("Publication too old");
        }
        else{
            if(getAge()<3) return getBaseImpact()*4+FRESH_BUMP;
            return getBaseImpact()*4;
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
        TextBook compared = (TextBook) object;
        return Objects.equals(this.getTitle(), compared.getTitle())
                && Objects.equals(this.getPublishingYear(), compared.getPublishingYear())
                && Arrays.equals(this.getAuthors(), compared.getAuthors())
                && Objects.equals(this.getPublishingYear(),compared.getPublishingYear())
                && Objects.equals(this.getNumOfCite(),compared.getNumOfCite())
                && Objects.equals(this.getPublishCompany(),compared.getPublishCompany())
                && Objects.equals(this.getNumPages(),compared.getNumPages());
    }
    /**
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getTitle(), Arrays.hashCode(this.getAuthors()),this.getPublishingYear(),this.getNumOfCite(), this.getPublishCompany(), this.getNumPages());
    }
}
