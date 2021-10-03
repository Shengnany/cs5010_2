package Assignment2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    private String streetAndNum1 = "x";
    private String city1 =  "New York";
    private String zip1 = "11266";
    private String state1 = "NY";
    private String country1 = "US";
    private String streetAndNum2 = "x";
    private String city2 =  "New York";
    private String zip2 = "11266";
    private String state2 = "NY";
    private String country2 = "US";
    private String streetAndNum3 = "c";
    private String city3 =  "New York";
    private String zip3 = "11266";
    private String state3 = "NY";
    private String country3 = "dS";
    private String streetAndNum4 = "cdfa";
    private String city4 =  "New daYork";
    private String zip4 = "11df266";
    private String state4 = "dNY";
    private String country4 = "dSaf";
    private Address a1;
    private Address a2;
    private Address a3;
    private Address a4 = null ;
    private String a5 = "address" ;
    private Address a6;
    private Address a7;

    @BeforeEach
    void setUp() {
        this.a1 = new Address(streetAndNum1,  city1,  zip1,  state1,  country1);
        this.a2 = new Address(streetAndNum2,  city2,  zip2,  state2,  country2);
        this.a3 = new Address(streetAndNum3,  city3,  zip3,  state3,  country3);
        this.a6 = new Address(streetAndNum1,  city1,  zip1,  state1,  country1);
        this.a7 = a1;
    }

    @Test
    void getStreetAndNum() {
        assertEquals(streetAndNum1,a1.getStreetAndNum());
    }

    @Test
    void setStreetAndNum() {
        a6.setStreetAndNum(streetAndNum4);
        assertEquals(streetAndNum4,a6.getStreetAndNum());
    }

    @Test
    void getCity() {
        assertEquals(city1,a1.getCity());
    }

    @Test
    void setCity() {
        a6.setCity(city4);
        assertEquals(city4,a6.getCity());
    }

    @Test
    void getZip() {
        assertEquals(zip1,a1.getZip());
    }

    @Test
    void setZip() {
        a6.setZip(zip4);
        assertEquals(zip4,a6.getZip());
    }

    @Test
    void getState() {
        assertEquals(state1,a1.getState());
    }

    @Test
    void setState() {
        a6.setState(state4);
        assertEquals(state4,a6.getState());
    }

    @Test
    void getCountry() {
        assertEquals(country1,a1.getCountry());
    }

    @Test
    void setCountry() {
        a6.setCountry(country4);
        assertEquals(country4,a6.getCountry());
    }

    @Test
    void testEquals() {
        assertEquals(a1,a2);
        assertNotEquals(a1,a3);
        assertNotEquals(a1,a4);
        assertNotEquals(a1,a5);
        assertEquals(a1,a7);
    }

    @Test
    void testHashCode() {
      assertEquals(a1.hashCode(), Objects.hash(a1.getStreetAndNum(), a1.getCity(), a1.getZip(), a1.getState(), a1.getCountry()));
    }

    @Test
    void testToString() {
        String s = "Address{" +
                "streetAndNum='" + streetAndNum1 + '\'' +
                ", city='" + city1 + '\'' +
                ", zip='" + zip1 + '\'' +
                ", state='" + state1 + '\'' +
                ", country='" + country1 + '\'' +
                '}';
        assertEquals(s, a1.toString());
    }
}