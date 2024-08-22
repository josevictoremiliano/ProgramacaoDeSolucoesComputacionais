
package com.financas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 12824131860
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/financas";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() throws  SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try {
            Connection connection = DatabaseConnection.getConnection();
            System.out.println("Conexão realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }
}
