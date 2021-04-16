package inheritance;

import java.util.Objects;

public class Review {
    private String author;
    private int stars;
    private String body;
    private place place;

    public Review(String author, int stars, String body, place place) {
        this.author = author;
        checkStars(stars);
        this.body = body;
        this.place = place;

    }

    public place getPlace() {
        return place;
    }

    public void setPlace(place place) {
        this.place = place;
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

    private String getPlaceName() {
        if (place != null)
            return place.getName();
        else
            return "the resturant is not defaind";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return stars == review.stars && Objects.equals(author, review.author) && Objects.equals(body, review.body) && Objects.equals(place, review.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, stars, body, place);
    }

    @Override
    public String toString() {
        return "Review :" +
                ", body='" + body + '\'' +
                "author='" + author + '\'' +
                ", stars=" + stars +
                "restarunt name " + place.getName() +
                '}';
    }
}
