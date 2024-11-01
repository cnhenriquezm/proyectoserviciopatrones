/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.sistemaminitores.presentacion;

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
import java.util.List;

/**
 *
 * @author Unimagdalena
 */

public class MonitorControl extends HttpServlet {
   private  MonitorServicio ms=new MonitorServicio();
   



    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String cual= request.getParameter("ContMonitor");
        if(cual.equals("registrar")){
            String nombre = request.getParameter("nombre");
            String correo = request.getParameter("correo");
            int calificacion = Integer.parseInt(request.getParameter("calificacion"));
        
            Monitor monitor=new Monitor(nombre, nombre, calificacion);
            ms.registerMonitor(monitor);
            request.setAttribute("mensaje", "El monitor ha sido creado exitosamente.");
            // Redirigir al mismo JSP
           request.getRequestDispatcher("/FormMonitor.jsp").forward(request, response);
        }else{
            List<Monitor> allMonitors = ms.getAllMonitors();
            String lis="<br>";
            for (Monitor allMonitor : allMonitors) {
                lis+=""+allMonitor.getNombre()+"<br>";
            }
            request.setAttribute("mensaje", "Esto son "+lis);
                     
            
            
            // Redirigir al mismo JSP
             request.getRequestDispatcher("/ListarTodos.jsp").forward(request, response);
        }
        
        
        //response.getWriter().println("Monitor guardado...");
        

        
        
    }
}
