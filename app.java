import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String userInput = "DROP TABLE users"; // SQLi simulée
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("DELETE FROM users WHERE name='" + userInput + "'");
    }
}
