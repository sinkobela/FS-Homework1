package homework1;

import homework1.category.Category;
import homework1.project.Project;
import homework1.projectTwo.ProjectTwo;

import java.util.List;

import static homework1.project.Project.ProjectBuilder.project;

public class Main {
    public static void main(String[] args) {

        Project project = new Project("Bela", 500, List.of(Category.ELECTRONICS, Category.FOOD), "human");
        System.out.println(project);

        buildingProject();

        buildingProjectTwo();
    }

    private static void buildingProjectTwo() {
        ProjectTwo projectTwo = ProjectTwo.ProjectTwoBuilder.projectBuilder()
                .name("Bela")
                .price(134)
                .categories(Category.DYI)
                .categories(Category.FOOD)
                .categories(Category.ELECTRONICS)
                .description("Human")
                .build();

        System.out.println(projectTwo);
    }

    private static void buildingProject() {
        Project project = project()
                .name("Bela")
                .price(500)
                .categories(Category.FOOD)
                .categories(Category.ELECTRONICS)
                .description("human")
                .build();

        System.out.println(project);
    }

}

//1) Create an immutable object:
//
//        Project(name: String, price:int, categories: List<Category>, description:String)
//
//        Category is an enum with values:
//        ELECTRONICS,
//        CLOTHES,
//        FOOD,
//        DYI
//        2) Make sure it's properly encapsulated and truly immutable (reference escapes)
//
//        3) construct a builder that duplicates the state. The category can be only added one by one.
//
//        4) re-create the Project, keep it immutable, but create a builder that DOESN'T duplicate the state
//
//        5) make sure your builder doesn't escape references
//
//        6) The category(String category) method in the builder must be able to be called multiple times