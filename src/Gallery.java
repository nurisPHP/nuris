import java.util.ArrayList;

public class Gallery {


    ArrayList<Artwork> list = new ArrayList<>();


    void add(Artwork a) {
        list.add(a);
    }


    void showAll() {
        for (Artwork a : list) {
            a.show();
        }
    }


    void filter(int minPrice) {
        for (Artwork a : list) {
            if (a.price >= minPrice) {
                a.show();
            }
        }
    }


    void search(String author) {
        for (Artwork a : list) {
            if (a.author.equals(author)) {
                System.out.println("Found:");
                a.show();
            }
        }
    }

    void sort() {
        list.sort((a, b) -> a.price - b.price);
    }
}
