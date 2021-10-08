package problem2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;


class ArtistTest {
    private Artist artist1;
    private String firstName1 = "Benjamin";
    private String lastName1 = "Haggerty";
    private Genre genre1 = Genre.ACTOR;
    private Name name1 = new Name(firstName1, lastName1);
    private int age1 = 35;
    private Award award1 = new Award("Award", "No1");
    private Movie movie1 = new Movie(" Movie","published inin 1942");
    private Serie serie1 = new Serie("Serie", "No1 movie");
    private Multimedia multimedia1 = new Multimedia("Award", "No1 movie");

    private Artist artist2;
    private String firstName2 = "Photd";
    private String lastName2 = "Huast";
    private Genre genre2 = Genre.PAINTER;
    private Name name2 = new Name(firstName2, lastName2);
    private int age2 = 21;
    private Award award2 = new Award("Award2", "No1");
    private Movie movie2 = new Movie(" Movie2","published inin 1889");

    @BeforeEach
    void setUp() {
        this.artist1 = new Artist(name1,genre1,age1);
        this.artist2 =  new Artist(name2,genre2,age2);
    }

    @Test
    void getAge() {
        assertEquals(age1, this.artist1.getAge());
    }

    @Test
    void setAge() {
        try {
            this.artist1.setAge(this.age1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void getName() {
        assertEquals(this.firstName1, artist1.getName().getFirstName());
        assertEquals(this.lastName1, artist1.getName().getLastName());
    }

    @Test
    void setName() {
        this.artist1.setName(this.name1);
        assertEquals(this.name1,this.artist1.getName());
    }

    @Test
    void getGenre() {
        assertEquals(this.genre1, artist1.getGenre());
    }

    @Test
    void setGenre() {
        this.artist1.setGenre(this.genre1);
        assertEquals(this.genre1, artist1.getGenre());
    }

    @Test
    void getAwards() {
        System.out.println(this.artist1.getAwards());
    }

    @Test
    void setAwards() {
        this.artist1.setAwards(this.award1);
    }

    @Test
    void setAwards2() {
        this.artist2.setAwards(this.award2);
    }

    @Test
    void getMovies() {
        System.out.println(this.artist1.getMovies());
    }

    @Test
    void setMovies() {
        try{
            this.artist1.setMovies(this.movie1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    void setMovies2() {
        try{
            this.artist2.setMovies(this.movie2);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void getSeries() {
        System.out.println(this.artist1.getSeries());

    }

    @Test
    void setSeries() {
        try{
            this.artist1.setSeries(this.serie1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void getMultimedias() {
        System.out.println(this.artist1.getMultimedias());

    }

    @Test
    void setMultimedias() {
        try{
            this.artist1.setMultimedias(this.multimedia1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void testEqual() {
        assertNotEquals(this.artist1,this.artist2);
        assertEquals(this.artist1,this.artist1);    }

    @Test
    public void testHashCode() {
        assertEquals(this.artist1.hashCode(), Objects.hash(this.name1, this.genre1,this.age1));
    }
}