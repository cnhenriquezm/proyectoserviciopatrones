/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.microresenas.control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/MainController")
public class MainController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recoger parámetros del formulario
        int monitorId = Integer.parseInt(request.getParameter("monitorId"));
        int estudianteId = Integer.parseInt(request.getParameter("estudianteId"));
        String comentario = request.getParameter("comentario");
        int calificacion = Integer.parseInt(request.getParameter("calificacion"));
        String fecha = request.getParameter("fecha");

        // Redirigir a ReviewController para insertar la reseña
        request.setAttribute("monitorId", monitorId);
        request.setAttribute("estudianteId", estudianteId);
        request.setAttribute("comentario", comentario);
        request.setAttribute("calificacion", calificacion);
        request.setAttribute("fecha", fecha);

        // Redireccionar al controlador de reseñas
        request.getRequestDispatcher("/ReviewController").forward(request, response);
    }
    
    
}

//esto es una prueba
