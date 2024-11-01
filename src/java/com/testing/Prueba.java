/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testing;

import com.microresenas.dao.FabricaDAOResenas;
import com.microresenas.dao.FabricaDao;
import com.microresenas.dao.ReseñaDao;
import com.microresenas.modelo.ResenaDTO;

/**
 *
 * @author Unimagdalena
 */
public class Prueba {
    public static void main(String[] args) throws CloneNotSupportedException {
//        ResenaDTO ob=new ResenaDTO(11, 22, "MUY MALO", 1, "fecha");
//        System.out.println(" "+ob.toString());
//        
//        ResenaDTO clon= (ResenaDTO) ob.clone();
//        System.out.println(" "+clon.toString());
//        
//       
//        ob.setComentario("MUY BUENO");
//        System.out.println(" "+ob.toString());
//         System.out.println("clonado "+clon.toString());
        
        FabricaDao ob= new FabricaDAOResenas();
        ReseñaDao obdao = ob.crearResenaDao("POSGRE");
        obdao.borrar(12);
                
        }
    
}
