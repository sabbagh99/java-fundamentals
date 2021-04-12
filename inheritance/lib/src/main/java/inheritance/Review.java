package inheritance;

public class Review extends Restaurant {
    private String body;
    private String author;
    private int numberOfStars;

    public Review() {
    }

    public Review(String body, String author, int numberOfStars, String restaurantName, int price) {

        super(restaurantName, numberOfStars++,price);
        this.setAuthor(author);
        this.setBody(body);
        this.setNumberOfStars(numberOfStars);

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    @Override
    public String toString() {
        if (numberOfStars <= 5 && numberOfStars >= 0) {

            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", numberOfStars=" + numberOfStars +
                    ",restaurantName =" + super.getName() +
                    ", price=" + super.getPrice() + "$" +
                    '}';
        }
        return "you should add number of stars between 0-5";

    }

}
