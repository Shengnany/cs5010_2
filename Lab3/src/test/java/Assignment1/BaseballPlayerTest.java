package Assignment1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class BaseballPlayerTest  {
    private BaseballPlayer bp1;
    private Name name1 = new Name("f1","l1");
    private Double height1 = 2.1;
    private Double weight1 = 1.1;
    private String league = "aa";
    private String team1 = "team1";
    private Double avgBatting1 = 2.1;
    private Integer homRuns1 = 1;
    private BaseballPlayer bp2;
    private Name name2 = new Name("f2","l2");
    private Double height2 = 21.1;
    private Double weight2 = 11.1;
    private String league2 = "da";
    private String team2 = "team2";
    private Double avgBatting2 = 12.1;
    private Integer homRuns2 = 1;
    private BaseballPlayer bp3;
    private Name name3 = new Name("f1","l1");
    private Double height3 = 2.1;
    private Double weight3 = 1.1;
    private String league3 = "aa";
    private String team3 = "team1";
    private Double avgBatting3 = 2.1;
    private Integer homRuns3 = 1;
    private  Runner run1;
    private Double best5K1 = 2.2;
    private Double bestHalfMara1 =3.3;
    private String favourite1= "basketball";
    @BeforeEach
    void setUp() {
        this.bp1 = new BaseballPlayer(name1,height1,weight1,league,team1,avgBatting1,homRuns1);
        this.bp2 = new BaseballPlayer(name2,height2,weight2,league2,team2,avgBatting2,homRuns2);
        this.bp3 = new BaseballPlayer(name3,height3,weight3,league3,team3,avgBatting3,homRuns3);
        this.run1 = new Runner(name1,height1,weight1,best5K1,bestHalfMara1,favourite1);

    }


    @Test
    void getTeam() {
        this.bp2.setTeam(this.team2);
        assertEquals(this.team2,this.bp2.getTeam());
    }

    @Test
    void setTeam() {
        this.bp2.setTeam("dba");
        assertEquals("dba",this.bp2.getTeam());
    }

    @Test
    void getAvgBatting() {
        this.bp2.setAvgBatting(this.avgBatting2);
        assertEquals(this.avgBatting2,this.bp2.getAvgBatting());
    }

    @Test
    void setAvgBatting() {
        this.bp2.setAvgBatting(2.0);
        assertEquals(2.0,this.bp2.getAvgBatting());
    }

    @Test
    void getHomRuns() {
        this.bp2.setHomRuns(this.homRuns2);
        assertEquals(this.homRuns2,this.bp2.getHomRuns());
    }

    @Test
    void setHomRuns() {
        this.bp2.setHomRuns(1);
        assertEquals(1,this.bp2.getHomRuns());
    }

    @Test
    void testEquals() {
        assertNotEquals(this.bp1,this.bp2);
        assertEquals(this.bp1,this.bp3);
        assertEquals(this.bp1,this.bp1);
        assertNotEquals(this.run1,this.bp1);
    }

    @Test
    void testHashCode() {
       assertEquals(this.bp1.hashCode(),Objects.hash(helper(bp1), team1, avgBatting1, homRuns1));
    }


    public int helper(BaseballPlayer b) {
        return Objects.hash(b.getAthletesName(), b.getHeight(), b.getWeight(),b.getLeague());
    }
    @Test
    void testToString() {
        String a =  "BaseballPlayer{" +
                "team='" + this.team1 + '\'' +
                ", avgBatting=" + this.avgBatting1 +
                ", homRuns=" + this.homRuns1 +
                '}';
        assertEquals(a,this.bp1.toString());
    }
}