package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private int number;

    public Shop(){}
    public Shop(String name,String description,int number){
        this.name = name;
        this.description = description;
        this.number = number;
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


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", number=" + number +"$"+
                '}';
    }
}
