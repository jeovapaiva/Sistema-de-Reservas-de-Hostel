package db;

import java.sql.SQLException;

public class Teste {
    public static void main(String[] args) {
        
    }

    public static adicionarReserva() {
        String query = "INSERT INTO nomeDaTabela(argumentos)" + "VALUES(?,?,?)";

        try (var conn = DB.connect(); var pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, 2);
            

            pstmt.executeQuery();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
