package inheritance;

import java.util.ArrayList;

public abstract class place {
    String name;
    ArrayList<Review> reviews = new ArrayList<>();
    private double stars;

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public place(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
    public double avgStars() {
        double sum = 0;
        for (Review review : reviews) {
            sum += review.getStars();
        }
        this.stars = sum / reviews.size();
        return this.stars;
    }
    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            this.reviews.add(review);

        }
    }
}
