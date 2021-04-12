package inheritance;

public class Restaurant {
    private String name;
    private int numberOfStars;
    private int price;

    public Restaurant() {
    }

    public Restaurant(String name, int numberOfStars, int price) {
        this.setName(name);
        this.setNumberOfStars(numberOfStars);
        this.setPrice(price);

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        if (numberOfStars <= 5 && numberOfStars >= 0) {
            return "Restaurant{" +
                    "name='" + name + '\'' +
                    ", numberOfStars=" + numberOfStars +
                    ", price=" + price + "$" +
                    '}';
        }
        return "you should add number of stars between 0-5";
    }
}
