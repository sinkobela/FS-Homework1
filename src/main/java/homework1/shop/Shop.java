package homework1.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Optional.ofNullable;

public class Shop {

    private final List<ShoppingProduct> shoppingProducts;

    public Shop(List<ShoppingProduct> shoppingProducts) {
        this.shoppingProducts = ofNullable(shoppingProducts)
                .map(ArrayList::new)
                .orElseGet(ArrayList::new);;
    }

    public List<ShoppingProduct> getShoppingProducts() {
        return new ArrayList<>(shoppingProducts);
    }

    public ShoppingProduct addProduct(ShoppingProduct shoppingProduct) {
        for (ShoppingProduct product : shoppingProducts) {
            if (product.getProduct().equals(shoppingProduct.getProduct())) {
                product.setAmount(product.getAmount() + shoppingProduct.getAmount());
                return product;
            }
        }
        shoppingProducts.add(shoppingProduct);
        return shoppingProduct;
    }

    public void buyProduct(ShoppingProduct shoppingProduct, int amount) {
        if (isInTheList(shoppingProduct)) {
            for (ShoppingProduct product : shoppingProducts) {
                if (product.getProduct().equals(shoppingProduct.getProduct()) && product.getAmount() >= amount) {
                    product.setAmount(product.getAmount() - amount);
                    System.out.println("Thank you for your purchase! You bought " + amount + " pieces of: " + shoppingProduct.getProduct());
                } else if (product.getProduct().equals(shoppingProduct.getProduct()) && product.getAmount() < amount) {
                    System.out.println("Sorry! The maximum amount you can buy of this product is: " + product.getAmount());
                }
            }
        } else {
            System.out.println("Sorry! This product is out of stock. Please come back later.");
        }
        deleteProduct(shoppingProduct);
    }

    private void deleteProduct(ShoppingProduct shoppingProduct) {
        if (shoppingProduct.getAmount() == 0) {
            shoppingProducts.remove(shoppingProduct);
        }
    }

    private boolean isInTheList(ShoppingProduct shoppingProduct) {
        return shoppingProducts.contains(shoppingProduct);
    }

    public void printAllProducts() {
        System.out.println("The list of products in the shop:");
        for (ShoppingProduct shoppingProduct : shoppingProducts) {
            System.out.println(shoppingProduct);
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(shoppingProducts, shop.shoppingProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shoppingProducts);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shoppingProducts=" + shoppingProducts +
                '}';
    }
}
