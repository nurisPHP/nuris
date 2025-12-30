public class Main {
    public static void main(String[] args) {

        Artwork a1 = new Artwork("Mona Lisa", "Leonardo", 1000);
        Artwork a2 = new Artwork("Guernica", "Picasso", 800);
        Artwork a3 = new Painting("Starry Night", "Van Gogh", 900, "Post-Impressionism");

        Gallery g = new Gallery();

        g.add(a1);
        g.add(a2);
        g.add(a3);

        System.out.println("ALL:");
        g.showAll();

        System.out.println("\nFILTER (>=900):");
        g.filter(900);

        System.out.println("\nSEARCH (Leonardo):");
        g.search("Leonardo");

        System.out.println("\nSORT:");
        g.sort();
        g.showAll();
    }
}
