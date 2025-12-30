public class Artwork {

    String title;
    String author;
    int price;

    Artwork(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void show() {
        System.out.println(title + " by " + author + " - " + price);
    }

    @Override
    public boolean equals(Object o) {
        Artwork a = (Artwork) o;
        return author.equals(a.author);
    }

    @Override
    public int hashCode() {
        return author.hashCode();
    }
}
