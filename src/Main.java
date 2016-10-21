import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Admin on 20/10/2016.
 */
public class Main {

    private static final String URL = "jdbc:mysql://localhost/bieren?autoReconnect=true&useSSL=false";
    private static final String USER = "maarten";
    private static final String PASSWORD = "maarten";

    public static void main(String[] args){
        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement s = connection.createStatement()
            ){
            System.out.println("Connectie geopend");
            String bierenVerwijderen = "delete from bieren where alcohol is null";
            System.out.println(s.execute(bierenVerwijderen));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void bierenVerwijderen(){

    }

}
