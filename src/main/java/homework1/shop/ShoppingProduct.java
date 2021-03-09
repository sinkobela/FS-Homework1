package homework1.shop;

import homework1.project.Product;

import java.util.Objects;

public class ShoppingProduct {

    private final Product product;
    private int amount;


    public ShoppingProduct(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    public ShoppingProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingProduct that = (ShoppingProduct) o;
        return amount == that.amount && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, amount);
    }

    @Override
    public String toString() {
        return "ShoppingProduct{" +
                "products=" + product +
                ", amount=" + amount +
                '}';
    }
}
