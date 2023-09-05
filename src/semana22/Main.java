package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main{
    public static void main(String[] args) throws SQLException{
        // Criar Conexão
        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSl=true";
        Connection conn = DriverManager.getConnection(url);

        // Executas a consulta
        String sql = "CREATE TABLE alunos(id INT PRIMARY KEY, nome TEXT, email TEXT, ativo BOOL);";
        Statement stm = conn.createStatement();
        stm.execute(sql);

        // Fechar a conexão
        stm.close();
        conn.close();
    }
}