package homework1.projectTwo;

import homework1.category.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Optional.ofNullable;

public class ProjectTwo {
    private String name;
    private int price;
    private List<Category> categories;
    private String description;


    public ProjectTwo(String name, int price, List<Category> categories, String description) {
        this.name = name;
        this.price = price;
        this.categories = ofNullable(categories)
                .map(ArrayList::new)
                .orElseGet(ArrayList::new);
        this.description = description;
    }

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
        ProjectTwo that = (ProjectTwo) o;
        return price == that.price && Objects.equals(name, that.name) && Objects.equals(categories, that.categories) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, categories, description);
    }

    @Override
    public String toString() {
        return "ProjectTwo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                ", description='" + description + '\'' +
                '}';
    }

    public static class ProjectTwoBuilder {

        public static ProjectTwoBuilder projectBuilder() {
            return new ProjectTwoBuilder();
        }


    }
}
