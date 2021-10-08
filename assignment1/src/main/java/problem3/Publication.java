package problem3;

import java.util.Arrays;

/**
 * This class is for Publication
 */
public abstract class Publication {
    private String title;
    private  String[] authors;
    private Integer publishingYear;
    private Integer numOfCite;
    static int FRESH_BUMP = 100;

    /**
     * constructs and initializes a Publication
     * @param title the title of the Publication
     * @param authors the authors of the Publication
     * @param publishingYear the publishing year of the Publication
     * @param numOfCite the number of citations of the Publication
     */
    public Publication(String title, String[] authors, Integer publishingYear, Integer numOfCite) {
        Arrays.sort(authors);
        if(publishingYear<0||publishingYear>2021) throw new IllegalArgumentException("Incorrect publishing year");
        this.title = title;
        this.authors = authors;
        this.publishingYear = publishingYear;
        this.numOfCite = numOfCite;
    }

    /**
     *
     * @return the title of the publication
     */
    public String getTitle() {
        return title;
    }

    /**
     * set the title
     * @param title the title of the publication
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * set the authors
     * @param authors the authors of the publication
     */
    public void setAuthors(String[] authors) {
        Arrays.sort(authors);
        this.authors = authors;
    }

    /**
     * set the publishing year
     * @param publishingYear the year of the publication
     */
    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    /**
     * set the number of citations
     * @param numOfCite the citations of the publication
     */
    public void setNumOfCite(Integer numOfCite) {
        this.numOfCite = numOfCite;
    }

    /**
     *
     * @return return the authors
     */
    public String[] getAuthors() {
        return authors;
    }

    /**
     *
     * @return the publishing year
     */
    public Integer getPublishingYear() {
        return publishingYear;
    }

    /**
     *
     * @return the number of citations
     */
    public Integer getNumOfCite() {
        return numOfCite;
    }

    /**
     *
     * @return the base impact
     */
    public double getBaseImpact(){
        return (double)(numOfCite)/getAge();
    }

    /**
     *
     * @return the age of the publication
     */
    public double getAge(){
        return (double)(publishingYear==2021? 1 : 2021 - publishingYear);
    }

    /**
     *
     * @return the estiamte impact
     * @throws ImpactEstimationException throws Exception if can not be estimated
     */
    public abstract double estimateImpact() throws ImpactEstimationException;

}
