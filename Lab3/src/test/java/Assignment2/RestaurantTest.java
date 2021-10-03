package Assignment2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
private Restaurant r1;
private String name1 = "r1";
Address a1 = new Address("a",  "b",  "c",  "d",  "e");
    private List<String> meals1 = new ArrayList<>(){
        {
            add("a");
            add("b");
            add("c");
        }
    };
    private List<String> desserts1 = new ArrayList<>(){
        {
            add("a");
            add("b");
            add("c");
        }
    };
    private List<String> beverages1 = new ArrayList<>(){
        {
            add("c");
            add("d");
            add("f");
        }
    };
    private List<String> drinks1 = new ArrayList<>(){
        {
            add("e");
            add("h");
            add("g");
        }
    };
    private List<String> meals2 = new ArrayList<>(){
        {
            add("a");
            add("b");
            add("c");
        }
    };
    private List<String> desserts2 = new ArrayList<>(){
        {
            add("a");
            add("b");
            add("c");
        }
    };
    private List<String> beverages2 = new ArrayList<>(){
        {
            add("c");
            add("d");
            add("f");
        }
    };
    private List<String> drinks2 = new ArrayList<>(){
        {
            add("e");
            add("h");
            add("g");
        }
    };
    private List<String> meals3 = new ArrayList<>(){
        {
            add("a1");
            add("b1");
            add("c1");
        }
    };
    private List<String> desserts3 = new ArrayList<>(){
        {
            add("a2");
            add("b2");
            add("c2");
        }
    };
    private List<String> beverages3 = new ArrayList<>(){
        {
            add("c2");
            add("d2");
            add("f2");
        }
    };
    private List<String> drinks3 = new ArrayList<>(){
        {
            add("e2");
            add("h2");
            add("g2");
        }
    };
    private List<String> meals4 = new ArrayList<>(){
        {
            add("4");
            add("4");
            add("4");
        }
    };
    private List<String> desserts4 = new ArrayList<>(){
        {
            add("3");
            add("3");
            add("3");
        }
    };
    private List<String> beverages4 = new ArrayList<>(){
        {
            add("2");
            add("2");
            add("2");
        }
    };
    private List<String> drinks4 = new ArrayList<>(){
        {
            add("1");
            add("1");
            add("1");
        }
    };
    Menu menu1 = new Menu(meals1,desserts1,beverages1,drinks1);
private Restaurant r2;
private String name2 = "r1";
Address a2 = new Address("a",  "b",  "c",  "d",  "e");
Menu menu2 = new Menu(meals2,desserts2,beverages2,drinks2);
private Restaurant r3;
private String name3 = "r3";
Address a3 = new Address("a1",  "b1",  "c1",  "d1",  "e1");
Menu menu3 = new Menu(meals3,desserts3,beverages3,drinks3);
private Restaurant r4;
private String name4 = "r4";
private Menu menu4 = new Menu(meals4,desserts4,beverages4,drinks4);
Address a4 = new Address("a4",  "b3",  "c41",  "42d1",  "e4321");
private Restaurant r5 = null;
private String  r6= "x";
private Restaurant r7;
private Boolean open1 = true;
    @BeforeEach
    void setUp() {
        r1 = new Restaurant(name1,a1,open1,menu1);
        r2 = new Restaurant(name2,a2,open1, menu2);
        r3 = new Restaurant(name3,a3,!open1, menu3);
        r4 = new Restaurant(name3,a4,false, menu4);
        r7=r1;
    }

    @Test
    void getName() {
        assertEquals(this.name1,r1.getName());
    }

    @Test
    void setName() {
        r4.setName(name4);
        assertEquals(this.name4,r4.getName());
    }

    @Test
    void getAdress() {
        assertEquals(this.a1,r1.getAdress());
    }

    @Test
    void setAdress() {
        r4.setAdress(a4);
        assertEquals(this.a4,r4.getAdress());
    }

    @Test
    void getMenu() {
        assertEquals(this.menu1,r1.getMenu());
    }

    @Test
    void setMenu() {
        r4.setMenu(menu4);
        assertEquals(this.menu4,r4.getMenu());
    }

    @Test
    void getOpen() {
        assertEquals(this.open1,r1.getOpen());
    }

    @Test
    void setOpen() {
        Boolean o = r4.getOpen();
        r4.setOpen(!o);
        assertEquals(!o,r4.getOpen());
    }

    @Test
    void testEquals() {
        assertEquals(r1,r2);
        assertNotEquals(r1,r3);
        assertEquals(r1,r7);
        assertNotEquals(r1,r4);
        assertNotEquals(r1,r5);
    }

    @Test
    void testHashCode() {
        assertEquals(r1.hashCode(), Objects.hash(r1.getName(), r1.getAdress(), r1.getMenu(), r1.getOpen()));
    }

    @Test
    void testToString() {
        String s = "Restaurant{" +
                "name='" + name1 + '\'' +
                ", adress=" + a1 +
                ", menu=" + menu1 +
                ", open=" + open1 +
                '}';
        assertEquals(s,r1.toString());
    }
}