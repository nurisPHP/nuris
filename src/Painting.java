public class Painting extends Artwork {

    String style;

    Painting(String title, String author, int price, String style) {
        super(title, author, price);
        this.style = style;
    }

    // polymorphism
    @Override
    void show() {
        System.out.println(title + " (" + style + ") by " + author + " - " + price);
    }
}
