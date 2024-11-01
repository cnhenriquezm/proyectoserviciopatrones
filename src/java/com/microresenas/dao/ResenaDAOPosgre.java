/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microresenas.dao;

import com.microresenas.modelo.ResenaDTO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class ResenaDAOPosgre implements ReseñaDao{
     static final String URL = "jdbc:postgresql://localhost:5432/Prueba";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";
    int res=0;
    
    
     public ResenaDAOPosgre() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
     }
    

    public int insertarResena(ResenaDTO ob) {
        String sql = "INSERT INTO reseñas (monitor_id, estudiante_id, comentario, calificacion, fecha) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1,ob.getMonitorid());
            ps.setInt(2,ob.getEstudianteid());
            ps.setString(3, ob.getComentario());
            ps.setInt(4, ob.getCalificacion());
            ps.setDate(5, java.sql.Date.valueOf(ob.getFecha()));

            res= ps.executeUpdate();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Que pasa aqui...");
        }
        return res;
    }

    @Override
    public ResenaDTO consultarResena(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ResenaDTO> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
