/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 12824131860
 */
public class testes {

    public static void main(String[] args)
            throws SQLException {
        Connection connect = new ConnectionFactory().getConnection();
        System.out.println("Connectado");
        connect.close();
    }
}

