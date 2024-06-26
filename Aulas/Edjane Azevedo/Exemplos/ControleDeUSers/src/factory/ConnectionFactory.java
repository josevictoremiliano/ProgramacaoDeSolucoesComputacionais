package factory;

import java.sql.Connection;

// conexão SQL para Java
import java.sql.DriverManager;

// driver de conexão SQL para Java
import java.sql.SQLException;

// classe para tratamento de exceções
public class ConnectionFactory {

    public Connection getConnection() {

        try {

            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava", "root", "admin");

        } catch (SQLException excecao) {

            throw new RuntimeException(excecao);

        }

    }

}
