package inheritance;

import java.util.ArrayList;

public class Shop extends place {
    private String description;
    private double stars;
    private String price;
    private ArrayList<Review> reviewShop = new ArrayList<Review>();

    public Shop(String name, String description, String price) {
        super(name);
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public double avgStars() {
        double sum = 0;
        for (Review review : reviewShop) {
            sum += review.getStars();
        }
        this.stars = sum / reviewShop.size();
        return this.stars;
    }

    public void addReview(Review review) {

        if (!reviewShop.contains(review)) {
            this.reviewShop.add(review);
            avgStars();
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
