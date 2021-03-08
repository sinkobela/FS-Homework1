package homework1;

import homework1.category.Category;
import homework1.project.Project;

import java.util.List;

import static homework1.project.Project.ProjectBuilder.project;

public class Main {
    public static void main(String[] args) {

        Project project = new Project("Bela", 500, List.of(Category.ELECTRONICS, Category.FOOD), "human");
        System.out.println(project);

        buildingProject();
    }

    private static void buildingProject() {
        Project project = project()
                .name("Bela")
                .price(500)
                .categories(List.of(Category.ELECTRONICS, Category.FOOD))
                .description("human")
                .build();

        System.out.println(project);
    }

}
