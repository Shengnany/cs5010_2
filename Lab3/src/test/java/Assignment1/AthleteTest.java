package Assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class AthleteTest {

    private class AthleteImpl extends Athlete{

        public AthleteImpl(Name athletesName, Double height, Double weight, String league) {
            super(athletesName, height, weight, league);
        }

        public AthleteImpl(Name athletesName, Double height, Double weight) {
            super(athletesName, height, weight);
        }
    }
    private AthleteImpl athlete1;
    private Name name1 = new Name("f1","l1");
    private Double height1 = 2.1;
    private Double weight1 = 1.1;
    private String league = "aa";
    private AthleteImpl athlete2;
    private Name name2 = new Name("f2","l2");
    private Double height2 = 21.1;
    private Double weight2 = 11.1;
    private AthleteImpl athlete3;
    private Name name3 = new Name("f1","l1");
    private Double height3 = 2.1;
    private Double weight3 = 1.1;
    private String league3 = "aa";
    @BeforeEach
    void setUp() {
        this.athlete1 = new AthleteImpl(name1,height1,weight1,league);
        this.athlete2 = new AthleteImpl(name2,height2,weight2);
        this.athlete3 = new AthleteImpl(name3,height3,weight3,league);
    }

    @Test
    void getAthletesName() {
        assertEquals(this.name1,athlete1.getAthletesName());
        assertEquals(this.name2,athlete2.getAthletesName());
    }

    @Test
    void getHeight() {
        assertEquals(this.height1,athlete1.getHeight());
        assertEquals(this.height2,athlete2.getHeight());
    }

    @Test
    void getWeight() {
        assertEquals(this.weight1,athlete1.getWeight());
        assertEquals(this.weight2,athlete2.getWeight());
    }

    @Test
    void getLeague() {
        assertEquals(this.league,athlete1.getLeague());
        assertNull(this.athlete2.getLeague());
    }

    @Test
    void testToString() {
        String a = "Athlete{" +
                "athletesName=" + this.name1.toString() +
                ", height=" + this.height1 +
                ", weight=" + this.weight1 +
                ", league='" + league + '\'' +
                '}';
        assertEquals(a,athlete1.toString());
    }

    @Test
    void testEquals() {
        String a = "test";
        assertNotEquals(a,this.athlete2);
        assertEquals(this.athlete1,this.athlete3);
        assertEquals(this.athlete1,this.athlete1);
        assertNotEquals(this.athlete1,this.athlete2);
    }

    @Test
    void testHashCode() {
        assertEquals(athlete1.hashCode(), Objects.hash(name1,height1,weight1,league));
        assertEquals(athlete2.hashCode(), Objects.hash(name2,height2,weight2,null));
    }
}