import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by Admin on 20/10/2016.
 */
public class Main {

    private static final String URL = "jdbc:mysql://localhost/bieren?autoReconnect=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "vdab";

    public static void main(String[] args){
        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement s = connection.createStatement()
            ){
            connection.setAutoCommit(false);
            String updateSql1 = "update bieren set brouwerid = 2 where alcohol >= 8.5";
            String updateSql2 = "update bieren set brouwerid = 3 where brouwerid = 1";
            String deleteBrouwer1 = "delete from brouwers where id = 1";
            s.execute(updateSql1);
            s.execute(updateSql2);
            s.execute(deleteBrouwer1);
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
