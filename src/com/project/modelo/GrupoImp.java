/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.modelo;

import java.sql.Connection;
import com.project.assistance.Grupo;
import com.project.interfaze.GrupoInt;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author conve
 */
public class GrupoImp implements GrupoInt {

    Conexion con = new Conexion();
    Connection conn = con.ConnectionSQL();

    @Override
    public void registrar(Grupo o) {
        try {
            PreparedStatement stament = null;
            String sql = "INSERT INTO grupo (descripcion)values(?)";
            stament = conn.prepareStatement(sql);
            stament.setString(1, o.getDescripcion());
            int rowsInsert = stament.executeUpdate();
            if (rowsInsert > 0) {
                System.out.println("registro del correctamente");
                JOptionPane.showMessageDialog(null, "registro del grupo correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GrupoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Grupo o) {
        try {
            String sql = "delete from grupo where idgrupo=?";
            PreparedStatement stament = conn.prepareStatement(sql);
            stament.setInt(1, o.getIdGrupo());

            int rowsDeleted = stament.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("se elimino un grupo correctamente");
                JOptionPane.showMessageDialog(null, "se elimino un grupo correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GrupoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizar(Grupo o) {
        try {
            String sql = "update grupo set descripcion=? where idgrupo=?";
            PreparedStatement stament = conn.prepareStatement(sql);
            stament.setString(1, o.getDescripcion());
            stament.setInt(2, o.getIdGrupo());

            int rowsupdated = stament.executeUpdate();
            if (rowsupdated > 0) {
                System.out.println("se Actualizo Grupo correctamente");
                JOptionPane.showMessageDialog(null, "se Actualizo Grupo correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GrupoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public DefaultComboBoxModel combo() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Conexion con = new Conexion();
        try {
            int b = 2;
            String sql = "select * from grupo";
            ResultSet rs = con.getData(sql);
            int n = 0;
            while (rs.next()) {
                Grupo per = new Grupo();
                per.setIdGrupo(rs.getInt(1));
                per.setDescripcion(rs.getString(2));
                modelo.addElement(per);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(GrupoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return modelo;
    }

    @Override
    public DefaultTableModel tabla() {
        DefaultTableModel Modelo = new DefaultTableModel();
        Modelo.addColumn("Id");
        Modelo.addColumn("Descripcion");

        try {

            Object[] fila = new Object[Modelo.getColumnCount()];

            String sql = "select * from grupo";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);;
                Modelo.addRow(fila);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(GrupoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Modelo;
    }

}
