package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ConferenceProceedingTest {
    private ConferenceProceeding cf;
    private ConferenceProceeding cf1;

    private String title = "title";
    private  String[] authors = {"a","b"};
    private Integer publishingYear = 2000;
    private Integer numOfCite = 21;
    private String location = "x";
    private String name ="d";


    private String title1 = "title1";
    private  String[] authors1 = {"a","b"};
    private Integer publishingYear1 = 1;
    private Integer numOfCite1 = 10;
    private String location1 = "xx";
    private String name1 ="dd";

    private Integer numOfCite2 = 2;
    private Integer publishingYear2 = 2010;
    private  String[] authors2 = {"c","d"};
    private String title2 = "title2";
    private String location2 = "cd";
    private String name2 ="aa";

    @BeforeEach
    void setUp() {
        this.cf = new ConferenceProceeding(this.title,this.authors,this.publishingYear,this.numOfCite,this.location,this.name);
        this.cf1 = new ConferenceProceeding(this.title1,this.authors1,this.publishingYear1,this.numOfCite1,this.location1,this.name1);
    }

    @Test
    void getTitle() {
        assertEquals(this.title,this.cf.getTitle());
    }

    @Test
    void getAuthors() {
        assertEquals(this.authors,this.cf.getAuthors());
    }

    @Test
    void getPublishingYear() {
        assertEquals(this.publishingYear,this.cf.getPublishingYear());
    }
    @Test
    void getPublishingYear1() {
        assertEquals(this.publishingYear1,this.cf1.getPublishingYear());
    }

    @Test
    void getNumOfCite() {
        assertEquals(this.numOfCite,this.cf.getNumOfCite());
    }

    @Test
    void getBaseImpact() {
        assertEquals(1,this.cf.getBaseImpact());
    }

    @Test
    void getName() {
        cf.setName(this.name2);
        assertEquals(this.name2,this.cf.getName());
    }

    @Test
    void getLocation() {
        cf.setLocation(this.location2);
        assertEquals(this.location2,this.cf.getLocation());
    }
    @Test
    void getAge() {
        assertEquals(21,this.cf.getAge());
    }
    @Test
    void setTitle() {
        this.cf.setTitle(this.title2);
        assertEquals(this.title2,this.cf.getTitle());
    }

    @Test
    void setAuthors() {
        this.cf.setAuthors(this.authors2);
        assertEquals(this.authors2,this.cf.getAuthors());    }

    @Test
    void setPublishingYear() {
        this.cf.setPublishingYear(this.publishingYear2);
        assertEquals(this.publishingYear2,this.cf.getPublishingYear());
    }

    @Test
    void setLocation() {
        cf.setLocation(this.location2);
        assertEquals(this.location2,this.cf.getLocation());
    }
    @Test
    void setName() {
        cf.setName(this.name2);
        assertEquals(this.name2,this.cf.getName());

    }

    @Test
    void setNumOfCite() {
        this.cf.setNumOfCite(this.numOfCite2);
        assertEquals(this.numOfCite2,this.cf.getNumOfCite());
    }
    @Test
    void estimateImpact()  {
        try{
            assertEquals(1,this.cf.estimateImpact());
        }
        catch(ImpactEstimationException e)
        {
            System.out.println(e.getMessage());
        }

    }
    @Test
    void estimateImpact1() {
        assertThrows(ImpactEstimationException.class, () -> {
            this.cf1.estimateImpact();
        });
    }

    @Test
    public void testEqual() {
        assertNotEquals(this.cf,this.cf1);
    }

    @Test
    public void testHashCode() {
        assertEquals(this.cf.hashCode(), Objects.hash(this.cf.getTitle(), Arrays.hashCode(this.cf.getAuthors()),
                this.cf.getPublishingYear(),this.cf.getNumOfCite(), this.cf.getLocation(), this.cf.getName()));
    }
}