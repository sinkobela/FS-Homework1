package homework1.projectTwo;

import homework1.category.Category;
import homework1.project.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProjectTwo {
    private String name;
    private int price;
    private List<Category> categories = new ArrayList<>();
    private String description;


    public ProjectTwo(String name, int price, List<Category> categories, String description) {
        this.name = name;
        this.price = price;
//        this.categories = ofNullable(categories)
//                .map(ArrayList::new)
//                .orElseGet(ArrayList::new);
        this.categories = categories;
        this.description = description;
    }

    public ProjectTwo(Category category) {
        this.categories.add(category);
    }

    public ProjectTwo() {}

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
        private final ProjectTwo projectTwo = new ProjectTwo();

        public static ProjectTwoBuilder projectBuilder() {
            return new ProjectTwoBuilder();
        }

        public ProjectTwoBuilder name(String name) {
            this.projectTwo.name = name;
            return this;
        }

        public ProjectTwoBuilder price(int price) {
            this.projectTwo.price = price;
            return this;
        }

        public ProjectTwoBuilder categories(Category category) {
            this.projectTwo.categories.add(category);
            return this;
        }

        public ProjectTwoBuilder description(String description) {
            this.projectTwo.description = description;
            return this;
        }

        public ProjectTwo build() {
            return new ProjectTwo(projectTwo.name, projectTwo.price, projectTwo.categories, projectTwo.description);
        }

    }
}
