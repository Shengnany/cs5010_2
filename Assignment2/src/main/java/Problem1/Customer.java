package Problem1;

import java.util.*;

/**
 * The type Customer.
 */
public class Customer {
    private String name;
    private Integer age;
    private Map<Product, Integer> received;
    private Map<Product, Integer> outOfStock;
    private Map<Product, Integer> removed;
    private final Cart cart;
    private final Inventory inventory;

    /**
     * Instantiates a new Customer.
     *
     * @param inventory the inventory
     * @param name      the name
     * @param age       the age
     * @param cart      the cart
     */
    public Customer(Inventory inventory, String name, Integer age, Cart cart) {
        this.name = name;
        this.age = age;
        this.cart = cart;
        this.inventory = inventory;
        this.received = new HashMap<>();
        this.outOfStock = new HashMap<>();
        this.removed = new HashMap<>();
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Gets cart.
     *
     * @return the cart
     */
    public Cart getCart() {
        return cart;
    }

    /**
     * Add product to cart.
     *
     * @param product  the product
     * @param quantity the quantity
     */
    public void add(Product product, int quantity) {
        try {
            if (inventory.getNumOfProd(product) >= quantity) {
                this.getCart().add(product, quantity);
            } else {
                throw new IllegalPurchaseException("The quantity is invalid.");
            }
        } catch (IllegalPurchaseException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Pre checkout.
     *
     * @return the double
     */
    public Receipt preCheckout() {
        double total = 0;
        Map<Product, Integer> map = cart.getProductList();
        for (Product product : map.keySet()) {
            int amount = map.get(product);
            if (product.getAge() >= this.getAge()) {
                removed.put(product, amount);
                continue;
            }
            List<StockItem> stock = inventory.getStock(product);
            int count = 0;
            Iterator<StockItem> iter = stock.iterator();
            while (iter.hasNext()) {
                StockItem item = iter.next();
                if (item.getProduct().equals(product)) {
                    if (item.getQuantity() >= amount) {
                        iter.remove();
                        inventory.reduce(item, amount);
                        received.put(item.getProduct(), count);
                        count = amount;
                        break;
                    } else {
                        int q = item.getQuantity();
                        iter.remove();
                        inventory.reduce(item, q);
                        received.put(item.getProduct(), q);
                        count += q;
                    }
                }
            }
            total += product.getPrice() * count;
            if (amount > count) {
                amount -= count;
                Iterator<StockItem> iter2 = stock.iterator();
                while (iter2.hasNext()) {
                    StockItem substitute = iter2.next();
                    int temp = 0;
                    Product p = substitute.getProduct();
                    if (p.getCategory().equals(product.getCategory()) && p.getPrice() <= product.getPrice()) {
                        if (product instanceof GroceryProduct) {
                            if (((GroceryProduct) product).getWeight() <= ((GroceryProduct) p).getWeight()) {
                                temp = Math.min(amount, substitute.getQuantity());
                            }
                        } else if (product instanceof HouseholdProduct) {
                            if (((HouseholdProduct) product).getUnits() <= (((HouseholdProduct) p).getUnits())) {
                                temp = Math.min(amount, substitute.getQuantity());
                            }
                        }
                    }
                    if (temp > 0) {
                        iter.remove();
                        inventory.reduce(substitute, temp);
                        amount -= temp;
                        total += substitute.getProduct().getPrice() * temp;
                        received.put(substitute.getProduct(), temp);
                    }
                    if (amount == 0) {
                        break;
                    }
                }
            }
            if (amount > 0) {
                outOfStock.put(product, amount);
            }
        }
        Receipt receipt = new Receipt(total, received, outOfStock, removed);
        return receipt;
    }

    /**
     * Checkout receipt.
     *
     * @return the receipt
     */
    public Receipt checkout() {
        this.cart.emptyCart();
        Receipt receipt1 = preCheckout();
        return receipt1;
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
        if (!(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return getName().equals(customer.getName()) && getAge().equals(customer.getAge()) && getCart().equals(customer.getCart()) && inventory.equals(customer.inventory);
    }

    /**
     * hash the object
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getCart(), inventory);
    }
}
