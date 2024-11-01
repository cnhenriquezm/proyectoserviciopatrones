/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaminitores.accesodatos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Unimagdalena
 */
public class Bd {
    private Connection conn;

    public Connection getConn() {
        return conn;
    }
    
    

    public Bd() {
       
    }

    public Bd(String DB_URL, String DB_USER, String DB_PASSWORD) throws SQLException {
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
    
    
}
