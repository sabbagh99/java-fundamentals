package inheritance;

import java.util.ArrayList;

public class Theater extends place {
    ArrayList<Theater> theater = new ArrayList<>();
    private ArrayList<Review> reviewTheater = new ArrayList<Review>();
    private String name;
    private String movies;
    private double stars;

    public Theater(String name, String movies) {
        super(name);
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

    public void removeMovie(Theater theater1) {
        theater.remove(theater1);
        System.out.println(theater);
    }
    public double avgStars() {
        double sum = 0;
        for (Review review : reviewTheater) {
            sum += review.getStars();
        }
        this.stars = sum / reviewTheater.size();
        return this.stars;
    }

    public void addReview(Review review) {

        if (!reviewTheater.contains(review)) {
            this.reviewTheater.add(review);
            avgStars();
        }
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies='" + movies + '\'' +
                '}';
    }
}
