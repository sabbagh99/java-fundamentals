package inheritance;

import java.util.ArrayList;

public class Restaurant extends place{
    private double stars;
    private String price;
    private ArrayList<Review> reviewRestaurant = new ArrayList<Review>();


    public Restaurant(String name, String price) {
        super(name);
//        this.stars = stars;
        this.price = price;
    }

    public double avgStars() {
        double sum = 0;
        for (Review review : reviewRestaurant) {
            sum += review.getStars();
        }
        this.stars = sum / reviewRestaurant.size();
        return this.stars;
    }

    public void addReview(Review review) {

        if (!reviewRestaurant.contains(review)) {
            this.reviewRestaurant.add(review);
            avgStars();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price='" + price + '\'' +
                ",review" + reviewRestaurant +
                '}';
    }
}
