package inheritance;

import java.util.Objects;

public class Review {
    private String author;
    private int stars;
    private String body;
    private Restaurant restaurant;

    public Review(String author, int stars, String body,Restaurant restaurant) {
        this.author = author;
        checkStars(stars);
        this.body = body;
        this.restaurant = restaurant;

    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    private void checkStars(int stars) {
        if (stars < 0)
            this.stars = 0;
        else if (stars > 5)
            this.stars = 5;
        else
            this.stars = stars;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    private String getStar() {
        String stars = "";
        for (int i = 0; i < this.stars; i++) {
            stars += "*";
        }
        return stars;
    }

    private String getRestarantName() {
        if (restaurant != null)
            return restaurant.getName();
        else
            return "the resturant is not defaind";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return stars == review.stars && Objects.equals(author, review.author) && Objects.equals(body, review.body) && Objects.equals(restaurant, review.restaurant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, stars, body, restaurant);
    }

    @Override
    public String toString() {
        return "Review :" +
                ", body='" + body + '\'' +
                "author='" + author + '\'' +
                ", stars=" + stars +
                "restarunt name " + restaurant.getName() +
                '}';
    }
}
