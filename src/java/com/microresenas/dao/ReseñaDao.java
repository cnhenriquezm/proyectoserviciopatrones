/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.microresenas.dao;

import com.microresenas.modelo.ResenaDTO;
import java.util.List;

/**
 *
 * @author Unimagdalena
 */
public interface ReseñaDao {
     int insertarResena(ResenaDTO ob);
     ResenaDTO consultarResena(int id);
     List<ResenaDTO> listarTodos();
     void borrar(int id);
}
