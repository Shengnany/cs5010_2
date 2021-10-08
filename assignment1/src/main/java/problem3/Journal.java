package problem3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * This class is for Journal
 */
public class Journal extends Article {
    private String publisher;
    private String[] editor;

    /**
     *
     * @return the publisher of the Journal
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * set the publisher of the journal
     * @param publisher the publisher of the journal
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    /**
     *
     * @return the editor of the Journal
     */
    public String[] getEditor() {
        return editor;
    }

    /**
     * set the editor of the journal
     * @param editor the editor of the journal
     */
    public void setEditor(String[] editor) {
        Arrays.sort(editor);
        this.editor = editor;
    }

//    /**
//     * contructs and initializes the Journal
//     * @param title the title of the Journal
//     * @param authors the author of the Journal
//     * @param publishingYear the publishing year of the Journal
//     * @param numOfCite the number of citations of the Journal
//     */
//    public Journal(String title, String[] authors, Integer publishingYear, Integer numOfCite) {
//        super(title, authors, publishingYear, numOfCite);
//    }

    /**
     *
     * contructs and initializes the Journal
     * @param title the title of the Journal
     * @param authors the author of the Journal
     * @param publishingYear the publishing year of the Journal
     * @param numOfCite the number of citations of the Journal
     * @param publisher the publisher of citations of the Journal
     * @param editor the editor of citations of the Journal
     */
    public Journal(String title, String[] authors, Integer publishingYear, Integer numOfCite, String publisher, String[] editor) {
        super(title, authors, publishingYear, numOfCite);
        this.publisher = publisher;
        Arrays.sort(editor);
        this.editor = editor;
    }

    /**
     *
     * @return the estimate impact of the journal
     * @throws ImpactEstimationException throws Exception if cannot be estimated
     */
    @Override
    public double estimateImpact() throws ImpactEstimationException {
        if(getAge()>250){
            throw new ImpactEstimationException("Publication too old");
        }
        else{
            if(getAge()<3) return getBaseImpact()*2+FRESH_BUMP;
            return getBaseImpact()*2;
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
        Journal compared = (Journal) object;
        return Objects.equals(this.getTitle(), compared.getTitle())
                && Objects.equals(this.getPublishingYear(), compared.getPublishingYear())
                && Arrays.equals(this.getAuthors(), compared.getAuthors())
                && Objects.equals(this.getPublishingYear(),compared.getPublishingYear())
                && Objects.equals(this.getNumOfCite(),compared.getNumOfCite())
                && Arrays.equals(this.getEditor(),compared.getEditor())
                && Objects.equals(this.getPublisher(),compared.getPublisher());
    }
    /**
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getTitle(), Arrays.hashCode(this.getAuthors()),this.getPublishingYear(),this.getNumOfCite(), this.getPublisher(), Arrays.hashCode(this.getEditor()));
    }
}
