
import com.financas.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FinancasDAO {
    public void inserirUsuario(long id, String nome, String email, String senha, java.sql.Date dataCadastro) throws SQLException    {
        String sql = "INSERT INTO financas.usuario (id, nome, email, senha, data_cadastro) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
        ) {
            stmt.setLong(1, id);
            stmt.setString(2, nome);
            stmt.setString(3, email);
            stmt.setString(4, senha);
            stmt.setDate(5, dataCadastro);

            stmt.executeUpdate();
        }
    }
}
