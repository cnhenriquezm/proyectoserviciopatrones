/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaminitores.servicio;

import com.sistemaminitores.persistencia.Monitor;
import com.sistemaminitores.persistencia.MonitorRepositorio;
import java.util.List;

/**
 *
 * @author Unimagdalena
 */
public class MonitorServicio {
    
    private MonitorRepositorio mr;

    public MonitorServicio() {
        mr = new MonitorRepositorio();
    }

    public void registerMonitor(Monitor monitor) {
        if (monitor != null && monitor.getNombre() != null) {
            mr.saveMonitor(monitor);
        } else {
            throw new IllegalArgumentException("Monitor data is invalid");
        }
    }

    public List<Monitor> getAllMonitors() {
        return mr.findAllMonitors();
    }


    
}
