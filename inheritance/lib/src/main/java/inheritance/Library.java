/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Review review = new Review("good","ahmad",2);
        Review review1 = new Review("very good","ahmad",2,"shawerma");
        Review review2 = new Review("nice","ahmad",2,"shawerma");
        Theater theater = new Theater("Theater", "Mad Max");
        Review reviewT = new Review("very good", "ahmad", 6, "tajCiname");
        restaurant.addReview(review);
        restaurant.addReview(review1);
        restaurant.addReview(review2);
        Shop shop = new Shop();
        Review review3 = new Review("nice","ali",5,"ali baba");
        shop.addReview(review3);
        theater.addMovie(theater);
        theater.removeMovie(theater);
        theater.addReview(reviewT);

    }
}
