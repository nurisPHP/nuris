public class Main {
    public static void main(String[] args) {

        Artist artist1 = new Artist("Leonardo da Vinci", "spain");
        Artist artist2 = new Artist("Picasso", "Spain");

        Artwork art1 = new Artwork("Mona Lisa", 1503, 1000);
        Artwork art2 = new Artwork("Guernica", 1937, 800);

        Gallery gallery = new Gallery("Modern Art Gallery", "Paris");

        artist1.show();
        artist2.show();

        art1.show();
        art2.show();

        gallery.show();

        if (art1.price > art2.price) {
            System.out.println("Mona Lisa is more expensive");
        } else {
            System.out.println("Guernica is more expensive");
        }
    }
}
