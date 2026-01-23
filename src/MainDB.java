import java.sql.*;

public class MainDB {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/art_exhibition",
                    "postgres",
                    ""  // егер trust болса, пароль бос
            );

            Statement st = conn.createStatement();

            // Мысалы, жаңа автор қосу
            st.executeUpdate("INSERT INTO artist(name, country) VALUES('Leonardo', 'Italy')");
            st.executeUpdate("INSERT INTO artist(name, country) VALUES('Picasso', 'Spain')");

            // Автордың ID арқылы туынды қосу
            st.executeUpdate("INSERT INTO artwork(title, price, artist_id) VALUES('Mona Lisa', 1000, 1)");
            st.executeUpdate("INSERT INTO artwork(title, price, artist_id) VALUES('Guernica', 800, 2)");

            // Барлығын шығару
            ResultSet rs = st.executeQuery(
                    "SELECT artwork.title, artwork.price, artist.name " +
                            "FROM artwork JOIN artist ON artwork.artist_id = artist.artist_id"
            );

            while(rs.next()) {
                System.out.println(
                        rs.getString("title") + " by " +
                                rs.getString("name") + " - " +
                                rs.getInt("price")
                );
            }

            conn.close();
            System.out.println("✅ DB Updated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
