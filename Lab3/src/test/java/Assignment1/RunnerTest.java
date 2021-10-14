package Assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {

    private Runner run1;
    private Name name1 = new Name("f1","l1");
    private Double height1 = 2.1;
    private Double weight1 = 1.1;
    private String league = "aa";
    private Double best5K1 = 2.2;
    private Double bestHalfMara1 =3.3;
    private String favourite1= "basketball";
    private Runner run2;
    private Name name2 = new Name("f2","l2");
    private Double height2 = 21.1;
    private Double weight2 = 11.1;
    private String league2 = "da";
    private Double best5K2 = 1.2;
    private Double bestHalfMara2 = 0.3;
    private String favourite2= "basketball";
    private Runner run3;
    private Name name3 = new Name("f1","l1");
    private Double height3 = 2.1;
    private Double weight3 = 1.1;
    private String league3 = "aa";
    private Double best5K3 = 2.2;
    private Double bestHalfMara3 =3.3;
    private String favourite3= "basketball";
    private BaseballPlayer bp1;
    private String team1 = "team1";
    private Double avgBatting1 = 2.1;
    private Integer homRuns1 = 1;
    @BeforeEach
    void setUp() {
        this.run1 = new Runner(name1,height1,weight1,best5K1,bestHalfMara1,favourite1);
        this.run2 = new Runner(name2,height2,weight2,best5K2,bestHalfMara2,favourite2);
        this.run3 = new Runner(name3,height3,weight3,best5K3,bestHalfMara3,favourite3);
        this.bp1 = new BaseballPlayer(name1,height1,weight1,league,team1,avgBatting1,homRuns1);
    }

    @Test
    void getBest5K() {
        this.run2.setBest5K(this.best5K2);
        assertEquals(this.best5K2,this.run2.getBest5K());
    }

    @Test
    void setBest5K() {
        this.run2.setBest5K(0.3);
        assertEquals(0.3,this.run2.getBest5K());
    }

    @Test
    void getBestHalfMara() {
        this.run2.setBestHalfMara(this.bestHalfMara2);
        assertEquals(this.bestHalfMara2,this.run2.getBestHalfMara());
    }

    @Test
    void setBestHalfMara() {
        this.run2.setBestHalfMara(343.5);
        assertEquals(343.5,this.run2.getBestHalfMara());
    }

    @Test
    void getFavourite() {
        this.run2.setFavourite("volleyball");
        assertEquals("volleyball",this.run2.getFavourite());
    }

    @Test
    void setFavourite() {
        this.run2.setFavourite(this.favourite2);
        assertEquals(this.favourite2,this.run2.getFavourite());
    }

    @Test
    void testToString() {
        String a ="Runner{" +
                "best5K=" + this.best5K1 +
                ", bestHalfMara=" + this.bestHalfMara1 +
                ", favourite='" + this.favourite1 + '\'' +
                '}';
    }

    @Test
    void testEquals() {
        assertEquals(this.run1,this.run3);
        assertEquals(this.run1,this.run1);
        assertNotEquals(this.run1,this.run2);
        assertNotEquals(this.run1,this.bp1);

    }
    public int helper(Runner r) {
        return Objects.hash(r.getAthletesName(),r.getHeight(), r.getWeight(),r.getLeague());
    }
    @Test
    void testHashCode() {
        assertEquals(this.run1.hashCode(),Objects.hash(helper(run1), this.best5K1, this.bestHalfMara1, this.favourite1));
    }
}