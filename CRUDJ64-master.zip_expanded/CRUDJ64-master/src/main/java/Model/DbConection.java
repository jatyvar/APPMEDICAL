package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConection {
    public static Connection connect(){
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:BD/miprimerabd.db");
            System.out.println("Estamos conectados! 😊");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("[CONNECTION] "+e);
        }
        return con;
    }
}
