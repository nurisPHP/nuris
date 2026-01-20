import java.sql.*;

public class MainDB {
    public static void main(String[] args) {
        // Деректер базасының мекен-жайы
        String url = "jdbc:postgresql://localhost:5432/art_exhibition";
        String user = "postgres";
        String password = "";

        // SQL сұранысы: Екі кестені JOIN арқылы біріктіру
        String query = "SELECT a.title, a.year, a.price, ar.name " +
                "FROM artwork a " +
                "JOIN artist ar ON a.artist_id = ar.artist_id";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            System.out.println("✅ Базаға қосылу сәтті аяқталды!\n");

            while (rs.next()) {
                System.out.println("Туынды: " + rs.getString("title") +
                        " | Жылы: " + rs.getInt("year") +
                        " | Суретші: " + rs.getString("name") +
                        " | Бағасы: $" + rs.getInt("price"));
            }

        } catch (SQLException e) {
            System.out.println("❌ Қате орын алды: " + e.getMessage());
        }
    }
}