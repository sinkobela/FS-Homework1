package homework1.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Optional.ofNullable;

public class Shop {
    private List<ShoppingProduct> shoppingProducts;


    public Shop(List<ShoppingProduct> shoppingProducts) {
        this.shoppingProducts = ofNullable(shoppingProducts)
                .map(ArrayList::new)
                .orElseGet(ArrayList::new);;
    }

    public List<ShoppingProduct> getShoppingProducts() {
        return new ArrayList<>(shoppingProducts);
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
