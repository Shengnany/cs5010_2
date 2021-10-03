package Assignment3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosnTest {
    Posn p1; //(1,2)
    Integer x1 = 1;
    Integer y1 = 2;
    Posn p2; //(1,1)
    Integer x2 = 1;
    Integer y2 = 1;
    Posn p3; //(1,2)
    Integer x3 = 1;
    Integer y3 = 2;
    Posn p4 = null;
    String p5 = "p5";
    Integer x6 = 1;
    Integer y6 = 2;
    Posn p6 = null;
    Posn p7 = null;
    Posn p8;
    Posn p9;
    Posn p10;
    Posn p11;

    @BeforeEach
    void setUp() {
        this.p1 = new Posn(x1, y1);
        this.p2 = new Posn(x2, y2);
        this.p3 = new Posn(x3, y3);
        this.p6 = new Posn(x6,y6);
        this.p8 = new Posn(x1,null);
        this.p9 = new Posn(x1,null);
        this.p10 = new Posn(null,y1);
        this.p11 = new Posn(null,y1);
    }


    @Test
    void getX() {
        assertEquals(this.x6,p6.getX());
    }

    @Test
    void getY() {
        assertEquals(this.y6,p6.getY());
    }

    @Test
    void testHashCode() {
        assertEquals(p1.hashCode(),helper(p1));
    }

    int helper(Posn p){
        int result = p.getX() != null ? p.getX().hashCode() : 0;
        result = 31 * result + (p.getY() != null ? p.getY().hashCode() : 0);
        return result;
    }
    @Test
    void testToString() {
        String s = "Posn{" + "x=" + x1 + ", y=" + y1 + '}';
        assertEquals(s,p1.toString());
    }

    @Test
    void testEquals() {
        assertEquals(p1, p1);
        assertNotEquals(p1, p4);
        assertNotEquals(p1, p5);
        assertNotEquals(p1, p2);
        assertEquals(p1, p3);
        assertNotEquals(p6, p7);
        assertEquals(p11, p10);
        assertEquals(p8, p9);
    }
}


//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Posn posn = (Posn) o;
//        if (this.x != null ? !this.x.equals(posn.x) : posn.x != null) return false;
//        return this.y != null ? this.y.equals(posn.y) : posn.y == null;
//    }

//@Override
//public int hashCode() {
//        int result = this.x != null ? this.x.hashCode() : 0;
//        result = 31 * result + (this.y != null ? this.y.hashCode() : 0);
//        return result;
//        }




