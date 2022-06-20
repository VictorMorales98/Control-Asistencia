/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.project.assistance.Asistencia;
import com.project.assistance.Grupo;
import com.project.assistance.Ocurrencia;
import com.project.interfaze.AsistenciaInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author conve
 */
public class AsistenciaImp implements AsistenciaInt {

    Conexion conn = new Conexion();
    Connection con = conn.ConnectionSQL();

    @Override
    public DefaultTableModel tablaAsistencia(Grupo grupo) {
        DefaultTableModel Modelo = new DefaultTableModel();
        Modelo.addColumn("id");
        Modelo.addColumn("nombre");
        Modelo.addColumn("paterno");
        Modelo.addColumn("materno");
        Modelo.addColumn("Sexo");
        Modelo.addColumn("Cargo");
        Modelo.addColumn("ocurrencia");
        Modelo.addColumn("detalle");

        Object[] fila = new Object[Modelo.getColumnCount()];
        try {

            String sql = "select * from persona where idgrupofk=" + grupo.getIdGrupo() + ";";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                Modelo.addRow(fila);
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn.CloseConnection();
        }
        return Modelo;
    }

    @Override
    public void registrar(Asistencia o) {
        try {
            String sql = "INSERT INTO ASISTENCIA VALUES(?,?,?,?)";
            o.getNombre();
            PreparedStatement stament = con.prepareStatement(sql);
            stament.setInt(1, o.getIdpersona());
            stament.setString(2, o.getFecha());
            stament.setString(3, o.getOcurrencia());
            stament.setString(4, o.getDetalle());
            int rowsInsert = stament.executeUpdate();
            if (rowsInsert > 0) {
                JOptionPane.showMessageDialog(null, "registro de asistencia correcto");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Asistencia o) {
        try {
            String sql = "delete from asistencia where idpersona=? and fecha=?";
            PreparedStatement stament = con.prepareStatement(sql);
            stament.setInt(1, o.getIdpersona());
            stament.setString(2, o.getFecha());

            stament.executeUpdate();

            JOptionPane.showMessageDialog(null, "se elimino un Registro correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizar(Asistencia o) {
        try {
            String sql = "update asistencia set ocurrencia=?, detalle=? where idpersona=? and fecha =?";
            PreparedStatement stament = con.prepareStatement(sql);

            stament.setString(1, o.getOcurrencia());
            stament.setString(2, o.getDetalle());
            stament.setInt(3, o.getIdpersona());
            stament.setString(4, o.getFecha());

            stament.executeUpdate();
            JOptionPane.showMessageDialog(null, "se Actualizo Registro correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public DefaultComboBoxModel combo() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Conexion con = new Conexion();
        try {
            int b = 2;
            //  String sql = "SELECT SISUBD_C_CODI04, SISUBD_V_DESC15 FROM SISUBDIRECCION WHERE SIUU_C_CODI03="+persona.getUnidad()+"";
            String sql = "select * from ocurrencia";
            ResultSet rs = con.getData(sql);
            int n = 0;
            while (rs.next()) {
//                DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
                Ocurrencia per = new Ocurrencia();
                per.setIdOcurrencia(rs.getInt(1));
                per.setDescripcion(rs.getString(2));
                modelo.addElement(per);
//                System.out.println(per.getDescripcion());
            }
            rs.close();
//             JOptionPane.showMessageDialog(null, "oka mdaldito" );
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error personal: " + e);
        } finally {
            con.CloseConnection();
        }
        return modelo;
    }

    @Override
    public DefaultTableModel tabla() {
        DefaultTableModel Modelo = new DefaultTableModel();
        Modelo.addColumn("Id");
        Modelo.addColumn("Nombre");
        Modelo.addColumn("Paterno");
        Modelo.addColumn("Materno");
        Modelo.addColumn("Sexo");
        Modelo.addColumn("Cargo");
        Modelo.addColumn("Ocurrencia");
        Modelo.addColumn("Detalle");

        Object[] fila = new Object[Modelo.getColumnCount()];

        try {
            String sql = "select * from persona";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                Modelo.addRow(fila);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            conn.CloseConnection();
        }
        return Modelo;
    }

}
