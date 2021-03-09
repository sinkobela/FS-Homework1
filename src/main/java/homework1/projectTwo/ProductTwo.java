package homework1.projectTwo;

import homework1.category.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ProductTwo {
    private String name;
    private int price;
    private List<Category> categories = new ArrayList<>();
    private String description;


    public ProductTwo(String name, int price, List<Category> categories, String description) {
        this.name = name;
        this.price = price;
        this.categories = Optional.ofNullable((categories))
                .map(ArrayList::new)
                .orElseGet(ArrayList::new);
        this.description = description;
    }

    public ProductTwo(Category category) {
        this.categories.add(category);
    }

    public ProductTwo() {}

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<Category> getCategories() {
        return new ArrayList<>(categories);
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductTwo that = (ProductTwo) o;
        return price == that.price && Objects.equals(name, that.name) && Objects.equals(categories, that.categories) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, categories, description);
    }

    @Override
    public String toString() {
        return "ProductTwo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                ", description='" + description + '\'' +
                '}';
    }

    public static class ProductTwoBuilder {
        private final ProductTwo productTwo = new ProductTwo();

        public static ProductTwoBuilder projectBuilder() {
            return new ProductTwoBuilder();
        }

        public ProductTwoBuilder name(String name) {
            this.productTwo.name = name;
            return this;
        }

        public ProductTwoBuilder price(int price) {
            this.productTwo.price = price;
            return this;
        }

        public ProductTwoBuilder categories(Category category) {
            this.productTwo.categories.add(category);
            return this;
        }

        public ProductTwoBuilder description(String description) {
            this.productTwo.description = description;
            return this;
        }

        public ProductTwo build() {
            return new ProductTwo(productTwo.name, productTwo.price, productTwo.categories, productTwo.description);
        }

    }
}
