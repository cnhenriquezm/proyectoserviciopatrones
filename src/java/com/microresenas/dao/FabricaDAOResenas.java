/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microresenas.dao;

import com.microresenas.dao.FabricaDao;

/**
 *
 * @author Unimagdalena
 */
public class FabricaDAOResenas extends FabricaDao{

    @Override
    public ReseñaDao crearResenaDao(String tipo) {
        if(tipo.equals("POSGRE"))
            return new ResenaDAOPosgre();
        else
            return new ResenaDAOCassandra();
    }
    
}
