/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaminitores.persistencia;

import com.sistemaminitores.accesodatos.Bd;
import java.util.List;
import com.sistemaminitores.persistencia.Monitor;
import com.sistemaminitores.servicio.MonitorServicio;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;


/**
 *
 * @author Unimagdalena
 */
public class MonitorRepositorio {
    
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Prueba";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "123456";

    public MonitorRepositorio() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
     }
    
    

    public void saveMonitor(Monitor monitor) {
        //String sql = "INSERT INTO monitors (name, subject, availability) VALUES (?, ?, ?)";
        String sql = "INSERT INTO Monitores (nombre, email, calificacion_promedio) VALUES (?, ?, ?)";     
        
        try{
            Bd conbd=new Bd(DB_URL, DB_USER, DB_PASSWORD);
            Connection conn=conbd.getConn();
            //Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, monitor.getNombre());
            stmt.setString(2,monitor.getEmail());
            stmt.setInt(3,monitor.getCalificacionPromedio());

            int filasInsertadas = stmt.executeUpdate();
            if (filasInsertadas > 0) {
                //response.getWriter().println("Monitor guardado exitosamente.");
                //System.out.println("Inserto bien...");
            }

            stmt.close();
            conn.close();

           

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println(" "+e.getMessage());
            //response.getWriter().println("Error al guardar el monitor."+e.getMessage());
        }

        
    }

    public List<Monitor> findAllMonitors() {
        List<Monitor> lista=new LinkedList<>();
        String sql = "SELECT * FROM Monitores ";
         try{
            Bd conbd=new Bd(DB_URL, DB_USER, DB_PASSWORD);
            Connection conn=conbd.getConn();
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String nombre= rs.getString(2);
                String mail=rs.getString(3);
                int num= rs.getInt(4);
                Monitor mo= new Monitor(nombre, mail, num);
                lista.add(mo);
            }
            rs.close();
            conn.close();
            
         }catch (Exception e) {
            e.printStackTrace();
            System.out.println(" "+e.getMessage());
            //response.getWriter().println("Error al guardar el monitor."+e.getMessage());
        }
         return lista;
    }
    
    
}
