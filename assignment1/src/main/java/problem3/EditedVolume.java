package problem3;


import java.util.Arrays;
import java.util.Objects;

/**
 * This class is for Edited Volume
 */
public class EditedVolume extends Book {

//    /**
//     * contructs and initializes the Edited Volume
//     * @param title the title of the Edited Volume
//     * @param authors the author of the Edited Volume
//     * @param publishingYear the publishing year of the Edited Volume
//     * @param numOfCite the number of citations of the Edited Volume
//     */
//    public EditedVolume(String title, String[] authors, Integer publishingYear, Integer numOfCite) {
//        super(title, authors, publishingYear, numOfCite);
//    }

    /**
     *
     * @param title the title of the Edited Volume
     * @param authors the author of the Edited Volume
     * @param publishingYear the publishing year of the Edited Volume
     * @param numOfCite the number of citations of the Edited Volume
     * @param publishCompany the publishing company of citations of the Edited Volume
     * @param numPages the num of pages of citations of the Edited Volume
     */
    public EditedVolume(String title, String[] authors, Integer publishingYear, Integer numOfCite,   String publishCompany,
            Integer numPages) {
        super(title, authors, publishingYear, numOfCite);
        this.setPublishCompany(publishCompany);
        this.setNumPages(numPages);
    }
    /**
     * estimates the impact of the Edited Volume
     * @return the estimated impact of the Edited Volume
     * @throws ImpactEstimationException throws exception if impact cannot be estimated
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
        EditedVolume compared = (EditedVolume) object;
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
