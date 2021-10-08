package problem3;

import problem2.Serie;

import java.util.Arrays;
import java.util.Objects;

/**
 * This class is for Conference Proceeding
 */
public class ConferenceProceeding extends Article{
    private String location;
    private String name;

    /**
     *
     * @return the location of the conference
     */
    public String getLocation() {
        return location;
    }

    /**
     * set the location of the conference
     * @param location the location of the conference
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return the name of the conference
     */
    public String getName() {
        return name;
    }

    /**
     * set the name of the conference
     * @param name the name of the conference
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * contructs and initializes the Conference Proceeding
     * @param title the title of the Conference Proceeding
     * @param authors the author of the Conference Proceeding
     * @param publishingYear the publishing year of the Conference Proceeding
     * @param numOfCite the number of citations of the Conference Proceeding
     */
    public ConferenceProceeding(String title, String[] authors, Integer publishingYear, Integer numOfCite) {
        super(title, authors, publishingYear, numOfCite);
    }

    /**
     * contructs and initializes the Conference Proceeding
     * @param title the title of the Conference Proceeding
     * @param authors the author of the Conference Proceeding
     * @param publishingYear the publishing year of the Conference Proceeding
     * @param numOfCite the number of citations of the Conference Proceeding
     * @param location the location of the Conference Proceeding
     * @param name the name of the Conference Proceeding
     */
    public ConferenceProceeding(String title, String[] authors, Integer publishingYear, Integer numOfCite, String location, String name){
        super(title, authors, publishingYear, numOfCite);
        this.setLocation(location);
        this.setName(name);
    }
    /**
     * calculate the estimate impact of the Conference Proceeding
     * @return the estimate impact of the Conference Proceeding
     * @throws ImpactEstimationException throws Exception if can not be estimated
     */
    @Override
    public double estimateImpact() throws ImpactEstimationException {
        if(getAge()>250){
            throw new ImpactEstimationException("Publication too old");
        }
        else{
            if(getAge()<3){
                return getBaseImpact()+FRESH_BUMP;
            }
            return getBaseImpact();
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
        ConferenceProceeding compared = (ConferenceProceeding) object;
        return Objects.equals(this.getTitle(), compared.getTitle())
                && Objects.equals(this.getPublishingYear(), compared.getPublishingYear())
                && Arrays.equals(this.getAuthors(), compared.getAuthors())
                && Objects.equals(this.getPublishingYear(),compared.getPublishingYear())
                && Objects.equals(this.getNumOfCite(),compared.getNumOfCite())
                && Objects.equals(this.getLocation(),compared.getLocation())
                && Objects.equals(this.getName(),compared.getName());
    }
    /**
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getTitle(), Arrays.hashCode(this.getAuthors()),this.getPublishingYear(),this.getNumOfCite(), this.getLocation(), this.getName());
    }

}
