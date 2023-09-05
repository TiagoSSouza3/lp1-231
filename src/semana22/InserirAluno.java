package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSl=true";
        Connection conn = DriverManager.getConnection(url);

        int id = 1;
        String nome = "Akyra";
        String email = "m.cruzatto@gmail.com";
        Boolean ativo = true;

        String sql = "INSERT INTO alunos VALUE (?,?,?,?)";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setString(2, nome);
        pstm.setString(3, email);
        pstm.setBoolean(4, ativo);
        pstm.executeUpdate();

        pstm.close();
        conn.close();
        }
}
