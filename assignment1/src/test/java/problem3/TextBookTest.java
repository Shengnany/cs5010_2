package problem3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TextBookTest {
    private TextBook tb;
    private TextBook tb1;

    private String title = "title";
    private  String[] authors = {"a","b"};
    private Integer publishingYear = 2000;
    private Integer numOfCite = 21;
    private String publishCompany = "sda";
    private Integer numPages = 2;

    private String title1 = "title1";
    private  String[] authors1 = {"a","b"};
    private Integer publishingYear1 = 1;
    private Integer numOfCite1 = 10;
    private String publishCompany1 = "sda";
    private Integer numPages1 = 2;

    private String title2 = "title2";
    private  String[] authors2 = {"a"};
    private Integer publishingYear2 = 2001;
    private Integer numOfCite2 = 30;
    private String publishCompany2 = "sdad";
    private Integer numPages2 = 3;


    @BeforeEach
    void setUp() {
        this.tb = new TextBook(this.title,this.authors,this.publishingYear,this.numOfCite,this.publishCompany,this.numPages);
        this.tb1 = new TextBook(this.title1,this.authors1,this.publishingYear1,this.numOfCite1,this.publishCompany1,this.numPages1);
    }

    @Test
    void getTitle() {
        assertEquals(this.title,this.tb.getTitle());
    }

    @Test
    void getAuthors() {
        assertEquals(this.authors,this.tb.getAuthors());
    }

    @Test
    void getPublishingYear() {
        assertEquals(this.publishingYear,this.tb.getPublishingYear());
    }

    @Test
    void getNumOfCite() {
        assertEquals(this.numOfCite,this.tb.getNumOfCite());
    }

    @Test
    void getBaseImpact() {
        assertEquals(1,this.tb.getBaseImpact());
    }

    @Test
    void getAge() {
        assertEquals(21,this.tb.getAge());
    }
    @Test
    void getPubishCompany() {
        tb.setPublishCompany(this.publishCompany2);
        assertEquals(this.publishCompany2,this.tb.getPublishCompany());
    }
    @Test
    void getNumPages() {
        tb.setNumPages(this.numPages2);
        assertEquals(this.numPages2,this.tb.getNumPages());
    }

    @Test
    void setTitle() {
        this.tb.setTitle(this.title2);
        assertEquals(this.title2,this.tb.getTitle());
    }

    @Test
    void setAuthors() {
        this.tb.setAuthors(this.authors2);
        assertEquals(this.authors2,this.tb.getAuthors());    }

    @Test
    void setPublishingYear() {
        this.tb.setPublishingYear(this.publishingYear2);
        assertEquals(this.publishingYear2,this.tb.getPublishingYear());
    }

    @Test
    void setNumOfCite() {
        this.tb.setNumOfCite(this.numOfCite2);
        assertEquals(this.numOfCite2,this.tb.getNumOfCite());
    }

    @Test
    void setPubishCompany() {
        tb.setPublishCompany(this.publishCompany2);
        assertEquals(this.publishCompany2,this.tb.getPublishCompany());
    }
    @Test
    void setNumPages() {
        tb.setNumPages(this.numPages2);
        assertEquals(this.numPages2,this.tb.getNumPages());

    }

    @Test
    void estimateImpact()  {
        try{
            assertEquals(4,this.tb.estimateImpact());
        }
        catch(ImpactEstimationException e)
        {
            System.out.println(e.getMessage());
        }

    }
    @Test
    void estimateImpact1() {
        assertThrows(ImpactEstimationException.class, () -> {
            this.tb1.estimateImpact();
        });
    }
    @Test
    public void testEqual() {
        assertNotEquals(this.tb,this.tb1);
    }

    @Test
    public void testHashCode() {
        assertEquals(this.tb.hashCode(), Objects.hash(this.tb.getTitle(), Arrays.hashCode(this.tb.getAuthors()),
                this.tb.getPublishingYear(),this.tb.getNumOfCite(), this.tb.getPublishCompany(), this.tb.getNumPages()));
    }
}