package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class EditedVolumeTest {
    private EditedVolume ev;
    private EditedVolume ev1;

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
        this.ev = new EditedVolume(this.title,this.authors,this.publishingYear,this.numOfCite,this.publishCompany,this.numPages);
        this.ev1 = new EditedVolume(this.title1,this.authors1,this.publishingYear1,this.numOfCite1,this.publishCompany1,this.numPages1);
    }

    @Test
    void getTitle() {
        assertEquals(this.title,this.ev.getTitle());
    }

    @Test
    void getAuthors() {
        assertEquals(this.authors,this.ev.getAuthors());
    }

    @Test
    void getPublishingYear() {
        assertEquals(this.publishingYear,this.ev.getPublishingYear());
    }
    @Test
    void getPublishingYear1() {
        assertEquals(this.publishingYear1,this.ev1.getPublishingYear());
    }

    @Test
    void getNumOfCite() {
        assertEquals(this.numOfCite,this.ev.getNumOfCite());
    }

    @Test
    void getBaseImpact() {
        assertEquals(1,this.ev.getBaseImpact());
    }

    @Test
    void getAge() {
        assertEquals(21,this.ev.getAge());
    }
    @Test
    void getPubishCompany() {
        ev.setPublishCompany(this.publishCompany2);
        assertEquals(this.publishCompany2,this.ev.getPublishCompany());
    }
    @Test
    void getNumPages() {
        ev.setNumPages(this.numPages2);
        assertEquals(this.numPages2,this.ev.getNumPages());
    }

    @Test
    void setTitle() {
        this.ev.setTitle(this.title2);
        assertEquals(this.title2,this.ev.getTitle());
    }

    @Test
    void setAuthors() {
        this.ev.setAuthors(this.authors2);
        assertEquals(this.authors2,this.ev.getAuthors());    }

    @Test
    void setPublishingYear() {
        this.ev.setPublishingYear(this.publishingYear2);
        assertEquals(this.publishingYear2,this.ev.getPublishingYear());
    }

    @Test
    void setNumOfCite() {
        this.ev.setNumOfCite(this.numOfCite2);
        assertEquals(this.numOfCite2,this.ev.getNumOfCite());
    }

    @Test
    void setPubishCompany() {
        ev.setPublishCompany(this.publishCompany2);
        assertEquals(this.publishCompany2,this.ev.getPublishCompany());
    }

    @Test
    void setNumPages() {
        ev.setNumPages(this.numPages2);
        assertEquals(this.numPages2,this.ev.getNumPages());

    }

    @Test
    void estimateImpact()  {
        try{
            assertEquals(4,this.ev.estimateImpact());
        }
        catch(ImpactEstimationException e)
        {
            System.out.println(e.getMessage());
        }

    }
    @Test
    void estimateImpact1() {
        assertThrows(ImpactEstimationException.class, () -> {
            this.ev1.estimateImpact();
        });
    }
    @Test
    public void testEqual() {
        assertNotEquals(this.ev,this.ev1);
    }

    @Test
    public void testHashCode() {
        assertEquals(this.ev.hashCode(), Objects.hash(this.ev.getTitle(), Arrays.hashCode(this.ev.getAuthors()),
                this.ev.getPublishingYear(),this.ev.getNumOfCite(), this.ev.getPublishCompany(), this.ev.getNumPages()));
    }
}