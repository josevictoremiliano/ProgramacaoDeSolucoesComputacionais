/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import modelo.Usuario;

public class UsuarioDAO {

    private Connection connection;

    int id;
    String nome;
    String cpf;
    String email;
    String telefone;
    private Object Usuarios;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void addUser(Usuario usuario) {
        String sql = "INSET INTO usuario(nome, cpf, email, telefone) VALUES (?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
