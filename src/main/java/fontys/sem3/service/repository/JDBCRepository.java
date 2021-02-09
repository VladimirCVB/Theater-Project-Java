package fontys.sem3.service.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCRepository {

    private static String url = "Your Url";
    private static String user = "", pass = "";

    public Connection getConnection() throws TheaterDatabaseException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            throw new TheaterDatabaseException("There has been a problem" ,e);
        } catch (SQLException throwables) {
            throw new TheaterDatabaseException("There has been a problem" , throwables);
        }
    }
}
