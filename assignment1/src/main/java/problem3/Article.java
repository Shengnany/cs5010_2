package problem3;

import java.util.Arrays;

/**
 * This class is for Article
 */
public abstract class Article extends Publication{

    /**
     * contructs and initializes the article
     * @param title the title of the article
     * @param authors the author of the article
     * @param publishingYear the publishing year of the article
     * @param numOfCite the number of citations of the article
     */
    public Article(String title, String[] authors, Integer publishingYear, Integer numOfCite) {

        super(title, authors, publishingYear, numOfCite);
    }

}
