import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMySQL {

    public void connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/HMSNEW?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                    "root", "hoangluan");
            /*
             * System.out.println("Sql:"
             * + connection.getMetaData().getDatabaseProductName());
             * Statement statement = connection.createStatement();
             * ResultSet resultSet = statement.executeQuery("SELECT *FROM login");
             * while (resultSet.next()) {
             * System.out.println("Username:"
             * + resultSet.getString("UserName"));
             * System.out.println("Password:"
             * + resultSet.getString("password"));
             * }
             */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
