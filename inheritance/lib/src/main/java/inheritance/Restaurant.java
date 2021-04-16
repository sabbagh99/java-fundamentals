package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int numberOfStars;
    private int price;

    public Restaurant() {
    }

    public Restaurant(String name, int numberOfStars, int price) {
        this.setName(name);
        this.setNumberOfStars(numberOfStars);
        this.setPrice(price);

    }

    public void addReview(Review review) {
        ArrayList<Review> reviews = new ArrayList<>();
        if (review.getName() != null) {
            if (reviews.contains(review)) {
                System.out.println("the number of star will not change because we have this review before");
            } else {
                review.setNumberOfStars(review.getNumberOfStars() + 1);
                if (review.getNumberOfStars() + 1>7){
                    System.out.println("you should add number of stars between 0-5");

                }
                if (review.getNumberOfStars() + 1>5){
                    review.setNumberOfStars(5);
                }
            }
        }
        reviews.add(review);
        System.out.println(review);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        if (numberOfStars <= 5 && numberOfStars >= 0) {
            return "Restaurant{" +
                    "name='" + name + '\'' +
                    ", numberOfStars=" + numberOfStars +
                    ", price=" + price + "$" +
                    '}';
        }
        return "you should add number of stars between 0-5";
    }
}
