package problem3;

/**
 * This class is for Book
 */
public abstract class Book extends Publication{
    String publishCompany;
    Integer numPages;

    /**
     *
     * @return the publish company
     */
    public String getPublishCompany() {
        return publishCompany;
    }

    /**
     * set the  publish company
     * @param publishCompany the publish company
     */
    public void setPublishCompany(String publishCompany) {
        this.publishCompany = publishCompany;
    }

    /**
     *
     * @return the number of pages
     */
    public Integer getNumPages() {
        return numPages;
    }

    /**
     * set the number of pages
     * @param numPages the number of pages
     */
    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    /**
     * contructs and initializes the book
     * @param title the title of the book
     * @param authors the author of the book
     * @param publishingYear the publishing year of the book
     * @param numOfCite the number of citations of the book
     */
    public Book(String title, String[] authors, Integer publishingYear, Integer numOfCite) {
        super(title, authors, publishingYear, numOfCite);
    }



}
