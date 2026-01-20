import java.sql.*;

public class MainDB {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/art_exhibition",
                    "postgres",
                    ""
            );

            Statement st = conn.createStatement();
            System.out.println("✅ Connected");


            // ARTISTS ҚОСУ

            st.executeUpdate("INSERT INTO artist(name, country) VALUES('Leonardo', 'Italy')");
            st.executeUpdate("INSERT INTO artist(name, country) VALUES('Picasso', 'Spain')");
            st.executeUpdate("INSERT INTO artist(name, country) VALUES('Vincent van Gogh', 'Netherlands')");
            st.executeUpdate("INSERT INTO artist(name, country) VALUES('Claude Monet', 'France')");
            st.executeUpdate("INSERT INTO artist(name, country) VALUES('Edvard Munch', 'Norway')");


            // ARTWORK ҚОСУ (YEAR МІНДЕТТІ!)
            st.executeUpdate(
                    "INSERT INTO artwork(title, year, price, artist_id) " +
                            "VALUES('Mona Lisa', 1503, 1000, 1)"
            );

            st.executeUpdate(
                    "INSERT INTO artwork(title, year, price, artist_id) " +
                            "VALUES('Guernica', 1937, 800, 2)"
            );

            st.executeUpdate(
                    "INSERT INTO artwork(title, year, price, artist_id) " +
                            "VALUES('Starry Night', 1889, 1300, 3)"
            );

            st.executeUpdate(
                    "INSERT INTO artwork(title, year, price, artist_id) " +
                            "VALUES('Water Lilies', 1916, 900, 4)"
            );

            st.executeUpdate(
                    "INSERT INTO artwork(title, year, price, artist_id) " +
                            "VALUES('The Scream', 1893, 1400, 5)"
            );


            // SELECT + JOIN

            ResultSet rs = st.executeQuery(
                    "SELECT a.title, a.year, a.price, ar.name " +
                            "FROM artwork a " +
                            "JOIN artist ar ON a.artist_id = ar.artist_id"
            );

            System.out.println("\n ARTWORK LIST:");
            while (rs.next()) {
                System.out.println(
                        rs.getString("title") + " (" +
                                rs.getInt("year") + ") by " +
                                rs.getString("name") + " - $" +
                                rs.getInt("price")
                );
            }


            rs.close();
            st.close();
            conn.close();

            System.out.println("\n✅ DB Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
