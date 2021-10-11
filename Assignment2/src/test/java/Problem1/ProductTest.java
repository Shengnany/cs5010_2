package Problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private final String manufacturer1 = "A";
    private final Category category1 = Category.BEER;
    private final String name1 = "beer";
    private double price1 = 1.1;
    private final int ALCOHOL_AGE = 21;
    private final String manufacturer2 = "B";
    private final Category category2 = Category.SHAMPOO;
    private final String name2 = "shampoo";
    private double price2 = 2.1;
    private Integer age2 = 0;
    private Product product1;
    private Product product2;
    private final String manufacturer3 = "B";
    private final Category category3 = Category.SHAMPOO;
    private final String name3 = "shampoo";
    private double price3 = 2.1;
    private Integer age3 = 0;
    private Product product3;
    private Product product4;
    @BeforeEach
    void setUp() {
        product1 = new Product(manufacturer1, category1, name1, price1, ALCOHOL_AGE);
        product2 = new Product(manufacturer2, category2, name2, price2, age2);
        product3 = new Product(manufacturer3, category3, name3, price3, age3);
        product4 = new Product(manufacturer3, category3, name3, price3, age3);
    }

    @Test
    void setPrice() {
        this.product3.setPrice(price3);
        assertEquals(price3,this.product3.getPrice());
    }

    @Test
    void setAge() {
        this.product3.setPrice(price3);
        assertEquals(price3,this.product3.getPrice());
    }

    @Test
    void getManufacturer() {
        assertEquals(this.product1.getManufacturer(),manufacturer1);
    }

    @Test
    void getPrice() {
        assertEquals(this.product1.getPrice(),price1);
    }

    @Test
    void getName() {
        assertEquals(this.product1.getName(),name1);
    }

    @Test
    void getAge() {
        assertEquals(this.product1.getAge(),ALCOHOL_AGE);
    }

    @Test
    void getCategory() {
        assertEquals(this.product1.getCategory(),category1);
    }

    @Test
    void testEquals() {
        assertEquals(product3,product4);
        assertNotEquals(product1,product2);
        assertNotEquals(product1,"abc");
        assertEquals(product1,product1);
    }

    @Test
    void testHashCode() {
        int a = Objects.hash(product1.getManufacturer(), product1.getCategory(), product1.getName(), product1.getPrice(), product1.getAge(), ALCOHOL_AGE);
        assertEquals(a,product1.hashCode());
    }
}