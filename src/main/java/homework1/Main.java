package homework1;

import homework1.category.Category;
import homework1.project.Product;
import homework1.projectTwo.ProductTwo;
import homework1.shop.Shop;
import homework1.shop.ShoppingProduct;

import java.util.List;

import static homework1.project.Product.ProductBuilder.project;

public class Main {
    public static void main(String[] args) {

//        Product product = new Product("Bela", 500, List.of(Category.ELECTRONICS, Category.FOOD), "human");
//        System.out.println(product);
//
//        buildingProduct();
//
//        buildingProductTwo();

        ShoppingProduct cars = new ShoppingProduct(new Product("Car", 500000, List.of(Category.DYI), "Vehicle"), 1);
        cars.setAmount(3);
        ShoppingProduct mobiles = new ShoppingProduct(new Product("Mobile Phone", 500, List.of(Category.ELECTRONICS), "gadget"), 15);
        ShoppingProduct jeans = new ShoppingProduct(new Product("Jeans", 200, List.of(Category.CLOTHES), "clothing"), 8);
        ShoppingProduct burgers = new ShoppingProduct(new Product("Burgers", 50, List.of(Category.FOOD), "cheeseburger"), 100);

        Shop shop = new Shop(List.of(cars, mobiles, jeans, burgers));

        shop.addProduct2(new ShoppingProduct(new Product("TV", 2000, List.of(Category.ELECTRONICS), "entertainment system"), 5));
        shop.addProduct2(new ShoppingProduct(new Product("TV", 2000, List.of(Category.ELECTRONICS), "entertainment system"), 5));

        shop.buyProduct(cars, 3);
        shop.buyProduct(mobiles, 1);
        shop.buyProduct(burgers, 222);

        ShoppingProduct anotherTv = new ShoppingProduct(new Product("TV", 23444, List.of(Category.ELECTRONICS), "blabla"), 8);
//        shop.addProduct2(anotherTv);

        shop.printAllProducts();
    }

    private static void buildingProductTwo() {
        ProductTwo productTwo = ProductTwo.ProductTwoBuilder.projectBuilder()
                .name("Bela")
                .price(134)
                .categories(Category.DYI)
                .categories(Category.FOOD)
                .categories(Category.ELECTRONICS)
                .description("Human")
                .build();

        System.out.println(productTwo);
    }

    private static void buildingProduct() {
        Product product = project()
                .name("Bela")
                .price(500)
                .categories(Category.FOOD)
                .categories(Category.ELECTRONICS)
                .description("human")
                .build();

        System.out.println(product);
    }

}
