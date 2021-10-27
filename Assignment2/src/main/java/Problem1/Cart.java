package Problem1;

import java.util.Map;
import java.util.Objects;

/**
 * This class represents shopping cart
 */
public class Cart {
    private final Map<Product, Integer> productList;

    /**
     * constructor
     *
     * @param productList list of products
     */
    public Cart(Map<Product, Integer> productList) {
        this.productList = productList;
    }

    /**
     * return list of products
     *
     * @return list of products
     */
    public Map<Product, Integer> getProductList() {
        return productList;
    }

    /**
     * empty the cart after checkout
     */
    public void emptyCart() {
        this.productList.clear();
    }

    /**
     * return the current price of all selected products
     *
     * @return the current price of all selected products
     */
    public double getCosts() {
        double cost = 0;
        for (Map.Entry<Product, Integer> entry : productList.entrySet()) {
            Product product = entry.getKey();
            cost += product.getPrice() * entry.getValue();
        }
        return cost;
    }

    /**
     * add a product to cart
     *
     * @param product the product
     * @param nums    the quantity of the product
     */
    public void add(Product product, int nums) {
        int num = productList.getOrDefault(product, 0) + nums;
        productList.put(product, num);
    }

    /**
     * check if the two object are the same
     *
     * @param o return the object to be compared
     * @return true if the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) o;
        return getProductList().equals(cart.getProductList());
    }

    /**
     * hash the object
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getProductList());
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productList=" + productList +
                '}';
    }
}
