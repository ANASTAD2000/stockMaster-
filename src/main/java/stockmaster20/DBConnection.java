import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String JDBC_URL = "jdbc:mysql://localhost:8089/stockmaster?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "admin";

    protected Connection getConnection() {
        Connection connection = null;
        try {
             
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace(); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); 
        }
        return connection;
    }

    public static void main(String[] args) {
        DBConnection db = new DBConnection();
        Connection conn = db.getConnection();
        if (conn != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Connection failed!");
        }
    }
}
