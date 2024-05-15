package com.financas;

import java.sql.SQLException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
      FinancasDAO dao = new FinancasDAO();

        try {
            dao.inserirUsuario(1, "jose", "email@email.com", "senha", new Date(System.currentTimeMillis()));
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
}
