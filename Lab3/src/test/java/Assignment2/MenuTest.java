package Assignment2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
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
    private List<String> meals6 = new ArrayList<>(){
        {
            add("4");
            add("4");
            add("4");
        }
    };
    private List<String> desserts6 = new ArrayList<>(){
        {
            add("3");
            add("3");
            add("3");
        }
    };
    private List<String> beverages6 = new ArrayList<>(){
        {
            add("2");
            add("2");
            add("2");
        }
    };
    private List<String> drinks6 = new ArrayList<>(){
        {
            add("1");
            add("1");
            add("1");
        }
    };
    private Menu menu1;
    private Menu menu2;
    private Menu menu3;
    private Menu menu4 = null;
    private String menu5 = "menu";
    private Menu menu6;
    private Menu menu7;
    @BeforeEach
    void setUp() {
        menu1 = new Menu(meals1,desserts1,beverages1,drinks1);
        menu2 = new Menu(meals2,desserts2,beverages2,drinks2);
        menu3 = new Menu(meals3,desserts3,beverages3,drinks3);
        menu6 = new Menu(meals1,desserts1,beverages1,drinks1);
        menu7 = menu1;
    }

    @Test
    void getMeals() {
        assertEquals(this.meals1,menu1.getMeals());
    }

    @Test
    void setMeals() {
        menu6.setMeals(this.meals6);
        assertEquals(this.meals6,menu6.getMeals());
    }

    @Test
    void getDesserts() {
        assertEquals(this.desserts1,menu1.getDesserts());
    }

    @Test
    void setDesserts() {
        menu6.setDesserts(this.desserts6);
        assertEquals(this.desserts6,menu6.getDesserts());
    }

    @Test
    void getBeverages() {
        assertEquals(this.beverages1,menu1.getBeverages());
    }

    @Test
    void setBeverages() {
        menu6.setBeverages(this.beverages6);
        assertEquals(this.beverages6,menu6.getBeverages());
    }

    @Test
    void getDrinks() {
        assertEquals(this.drinks1,menu1.getDrinks());
    }

    @Test
    void setDrinks() {
        menu6.setDrinks(this.drinks6);
        assertEquals(this.drinks6,menu6.getDrinks());
    }

    @Test
    void testEquals() {
        assertEquals(menu1,menu2);
        assertNotEquals(menu1,menu3);
        assertNotEquals(menu1,menu4);
        assertNotEquals(menu1,menu5);
        assertEquals(menu1,menu7);
    }

    @Test
    void testHashCode() {
        assertEquals(menu1.hashCode(), Objects.hash(menu1.getMeals(), menu1.getDesserts(), menu1.getBeverages(), menu1.getDrinks()));
    }

    @Test
    void testToString() {
        String s = "Menu{" +
                "meals=" + meals1 +
                ", desserts=" + desserts1 +
                ", beverages=" + beverages1 +
                ", drinks=" + drinks1 +
                '}';
        assertEquals(s,menu1.toString());
    }
}