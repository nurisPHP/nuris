public class Artwork {
    String title;
    int year;
    int price;

    Artwork(String title, int year, int price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }

    void show() {
        System.out.println("Artwork: " + title);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}
