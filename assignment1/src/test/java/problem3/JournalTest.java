package problem3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class JournalTest {
    private Journal journal;
    private Journal journal1;

    private String title = "title";
    private  String[] authors = {"a","b"};
    private Integer publishingYear = 2000;
    private Integer numOfCite = 21;
    private String publisher = "sd";
    private String[] editor = {"a","b"};

    private Integer numOfCite1 = 10;
    private String title1 = "title1";
    private  String[] authors1 = {"a","b"};
    private Integer publishingYear1 = 1;
    private String publisher1 = "s2d";
    private String[] editor1 = {"c","b"};

    private Integer numOfCite2 = 90;
    private Integer publishingYear2 = 1990;
    private  String[] authors2 = {"a","b"};
    private String title2 = "title2";
    private String publisher2 = "sed";
    private String[] editor2 = {"c","b"};

    @BeforeEach
    void setUp() {
        this.journal = new Journal(this.title,this.authors,this.publishingYear,this.numOfCite,this.publisher,this.editor);
        this.journal1 = new Journal(this.title1,this.authors1,this.publishingYear1,this.numOfCite1,this.publisher1,this.editor1);
    }

    @Test
    void getTitle() {
        assertEquals(this.title,this.journal.getTitle());
    }

    @Test
    void getAuthors() {
        assertEquals(this.authors,this.journal.getAuthors());
    }

    @Test
    void getPublishingYear() {
        assertEquals(this.publishingYear,this.journal.getPublishingYear());
    }

    @Test
    void getNumOfCite() {
        assertEquals(this.numOfCite,this.journal.getNumOfCite());
    }

    @Test
    void getEditor() {
        journal.setEditor(this.editor2);
        assertEquals(this.editor2,this.journal.getEditor());
    }

    @Test
    void getPublisher() {
        journal.setPublisher(this.publisher2);
        assertEquals(this.publisher2,this.journal.getPublisher());
    }

    @Test
    void setPublisher() {
        journal.setPublisher(this.publisher2);
        assertEquals(this.publisher2,this.journal.getPublisher());
    }

    @Test
    void setEditor() {
        journal.setEditor(this.editor2);
        assertEquals(this.editor2,this.journal.getEditor());

    }
    @Test
    void setTitle() {
        this.journal.setTitle(this.title2);
        assertEquals(this.title2,this.journal.getTitle());
    }

    @Test
    void setAuthors() {
        this.journal.setAuthors(this.authors2);
        assertEquals(this.authors2,this.journal.getAuthors());    }

    @Test
    void setPublishingYear() {
        this.journal.setPublishingYear(this.publishingYear2);
        assertEquals(this.publishingYear2,this.journal.getPublishingYear());
    }

    @Test
    void setNumOfCite() {
        this.journal.setNumOfCite(this.numOfCite2);
        assertEquals(this.numOfCite2,this.journal.getNumOfCite());
    }

    @Test
    void getBaseImpact() {
        assertEquals(1,this.journal.getBaseImpact());
    }

    @Test
    void getAge() {
        assertEquals(21,this.journal.getAge());
    }

    @Test
    void estimateImpact()  {
        try{
            assertEquals(2,this.journal.estimateImpact());
        }
        catch(ImpactEstimationException e)
        {
            System.out.println(e.getMessage());
        }

    }
    @Test
    void estimateImpact1() {
        assertThrows(ImpactEstimationException.class, () -> {
            this.journal1.estimateImpact();
        });
    }


    @Test
    public void testEqual() {
        assertNotEquals(this.journal,this.journal1);
    }

    @Test
    public void testHashCode() {
        assertEquals(this.journal.hashCode(), Objects.hash(this.journal.getTitle(), Arrays.hashCode(this.journal.getAuthors()),
                this.journal.getPublishingYear(),this.journal.getNumOfCite(), this.journal.getPublisher(), Arrays.hashCode(this.journal.getEditor())));
    }
}