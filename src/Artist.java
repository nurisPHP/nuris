public class Artist {
    String name;
    String country;

    Artist(String name, String country) {
        this.name = name;
        this.country = country;
    }

    void show() {
        System.out.println("Artist name: " + name);
        System.out.println("Country: " + country);
    }
}
