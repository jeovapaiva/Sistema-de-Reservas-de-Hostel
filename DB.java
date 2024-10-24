package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection connect() throws SQLException {
        try {
            String jdbcUrl = "jdbc:postgresql://localhost:porta/nomeDoBD";
            String user = "";
            String password = "";

            return DriverManager.getConnection(jdbcUrl, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());

            return null;
        }
    }
}
