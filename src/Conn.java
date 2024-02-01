import java.sql.*;
public class Conn {
    Connection connection;
    Statement statement;

    public Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///ebs", );
            statement = connection.createStatement();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }






}
