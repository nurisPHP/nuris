public class Gallery {
    String name;
    String city;

    Gallery(String name, String city) {
        this.name = name;
        this.city = city;
    }

    void show() {
        System.out.println("Gallery: " + name);
        System.out.println("City: " + city);
    }
}
