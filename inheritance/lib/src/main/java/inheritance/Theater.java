package inheritance;

import java.util.ArrayList;

public class Theater {
    ArrayList<Theater> theater = new ArrayList<>();
    private String name;
    private String movies;

    public Theater() {
    }

    public Theater(String name, String movies) {

        this.setName(name);
        this.setMovies(movies);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovies() {
        return movies;
    }

    public void setMovies(String movies) {
        this.movies = movies;
    }

    public void addMovie(Theater theater1) {
        theater.add(theater1);
        System.out.println(theater);
    }
    public void removeMovie(Theater theater1){
        theater.remove(theater1);
        System.out.println(theater);
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
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies='" + movies + '\'' +
                '}';
    }
}
