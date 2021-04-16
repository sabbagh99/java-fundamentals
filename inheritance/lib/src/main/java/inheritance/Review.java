package inheritance;

public class Review {
    private String body;
    private String author;
    private int numberOfStars;
    private String name;

    public Review() {
    }

    public Review(String body, String author, int numberOfStars) {
        this.setAuthor(author);
        this.setBody(body);
        this.setNumberOfStars(numberOfStars);

    }
    public Review(String body, String author, int numberOfStars,String restaurantName){
        this(body,author,numberOfStars);
        this.setName(restaurantName);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (numberOfStars <= 5 && numberOfStars >= 0) {

            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", numberOfStars=" + numberOfStars +
                    ", restaurantName="+name+
                    '}';
        }
        return "you should add number of stars between 0-5";

    }

}
