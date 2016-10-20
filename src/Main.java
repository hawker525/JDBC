import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Admin on 20/10/2016.
 */
public class Main {

    private static final String URL = "jdbc:mysql://localhost/tuincentrum";
    private static final String USER = "root";
    private static final String PASSWORD = "vdab";

    public static void main(String[] args){
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);){
            System.out.println("Connectie geopend");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
