/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.modelo;

import com.project.assistance.Reporte;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author conve
 */
public class ReporteImp {

    Conexion conn = new Conexion();
    Connection con = conn.ConnectionSQL();

    public DefaultTableModel tablaReporte(Reporte dto) {
        DefaultTableModel Modelo = new DefaultTableModel();
        Modelo.addColumn("Nombre");
        Modelo.addColumn("Paterno");
        Modelo.addColumn("Materno");
        Modelo.addColumn("Sexo");
        Modelo.addColumn("Cargo");
        Modelo.addColumn("Grupo");
        Modelo.addColumn("Ocurrencia");
        Modelo.addColumn("Fecha");

        Object[] fila = new Object[Modelo.getColumnCount()];

        try {
            String sql = "select nombre, paterno, materno, sexo,cargo,grupo.descripcion,ocurrencia.descripcion, fecha from asistencia\n"
                    + "inner join persona on persona.idpersona = asistencia.idpersona\n"
                    + "inner join grupo on grupo.idgrupo = persona.idgrupofk\n"
                    + "inner join ocurrencia on ocurrencia.idocurrencia = asistencia.idocurrencia\n"
                    + "where fecha between '" + dto.getFechaInicio() + "' and '" + dto.getFechaFin() + "'\n"
                    + "order by fecha desc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                fila[6] = rs.getString(7);
                fila[7] = rs.getString(8);
                Modelo.addRow(fila);
            }
            JOptionPane.showMessageDialog(null, "Inicio: " + dto.getFechaInicio() + " Fecha fin: " + dto.getFechaFin());
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error tabla: " + e);
        } finally {
            conn.CloseConnection();
        }
        return Modelo;
    }
}
