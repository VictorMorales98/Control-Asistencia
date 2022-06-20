/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.interfaze;

import com.project.assistance.Asistencia;
import com.project.assistance.Grupo;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author conve
 */
public interface AsistenciaInt extends Interfaz<Asistencia>{
    
    public DefaultTableModel tablaAsistencia(Grupo grupo);
    
}
