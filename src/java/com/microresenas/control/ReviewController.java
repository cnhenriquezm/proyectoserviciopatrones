/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.microresenas.control;



import com.microresenas.dao.FabricaDAOResenas;
import com.microresenas.dao.FabricaDao;
import com.microresenas.dao.ResenaDAOPosgre;
import com.microresenas.modelo.MonitorDTO;
import com.microresenas.modelo.ResenaDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//@WebServlet("/ReviewController")
public class ReviewController extends HttpServlet {
    
    private ReviewController singleton;

    private ReviewController() {
        
    }
    public ReviewController getRevierController(){
        if(singleton==null){
            singleton=new ReviewController();
         }
         return singleton;
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recibir parámetros del request
        int monitorId = (int) request.getAttribute("monitorId");
        int estudianteId = (int) request.getAttribute("estudianteId");
        String comentario = (String) request.getAttribute("comentario");
        int calificacion = (int) request.getAttribute("calificacion");
        String fechaStr = (String) request.getAttribute("fecha");
        
        

        // Convertir fecha a LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaStr, formatter);

        // Llamar al DAO para insertar la reseña
        FabricaDao fab=new FabricaDAOResenas();
        ResenaDAOPosgre resenaDAO = (ResenaDAOPosgre) fab.crearResenaDao("POSGRE");
        ResenaDTO ob=new ResenaDTO(monitorId, estudianteId, comentario, calificacion, fechaStr);
        int num =resenaDAO.insertarResena(ob);

        // Confirmación
        
        response.getWriter().write("Reseña guardada con éxito. "+num);
    }
}
