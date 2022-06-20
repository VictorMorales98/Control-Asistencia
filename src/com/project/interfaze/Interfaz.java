/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.interfaze;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author conve
 */
public interface Interfaz <O>{
    
    public void registrar(O o);
    public void eliminar(O o);
    public void actualizar(O o);
    public DefaultComboBoxModel combo();
    public DefaultTableModel tabla();
    
}
