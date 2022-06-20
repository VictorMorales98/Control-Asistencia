/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.modelo;

import com.project.assistance.Persona;
import com.project.interfaze.PersonaInt;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author conve
 */
public class PersonaImp implements PersonaInt {

    Conexion con = new Conexion();
    Connection conn = con.ConnectionSQL();

    @Override
    public void registrar(Persona o) {
        try {
            String sql = "INSERT INTO persona values(default,?,?,?,?,?,?)";

            PreparedStatement stament = conn.prepareStatement(sql);
            stament.setString(1, o.getNombre());
            stament.setString(2, o.getApPaterno());
            stament.setString(3, o.getApMaterno());
            stament.setString(4, o.getSexo());
            stament.setString(5, o.getCargo());
            stament.setInt(6, o.getIdOficina());
            int rowsInsert = stament.executeUpdate();
            if (rowsInsert > 0) {
                System.out.println("Se ingreso una persona correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.CloseConnection();
        }
    }

    @Override
    public void eliminar(Persona o) {
        try {
            String sql = "delete from persona where idpersona=?";
            PreparedStatement stament = conn.prepareStatement(sql);
            stament.setInt(1, o.getIdPersona());

            int rowsDeleted = stament.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("se elimino una persona correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.CloseConnection();
        }
    }

    @Override
    public void actualizar(Persona o) {
        try {
            String sql = "update persona set nombre=?,paterno=?,materno=?,sexo=?,cargo=?,idoficinafk=? where idpersona=?";

            PreparedStatement stament = conn.prepareStatement(sql);
            stament.setString(1, o.getNombre());
            stament.setString(2, o.getApPaterno());
            stament.setString(3, o.getApMaterno());
            stament.setString(4, o.getSexo());
            stament.setString(5, o.getCargo());
            stament.setInt(6, o.getIdOficina());
            stament.setInt(7, o.getIdPersona());

            int rowsupdated = stament.executeUpdate();
            if (rowsupdated > 0) {
                JOptionPane.showMessageDialog(null, "se actualizo correctamente");
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.CloseConnection();
        }
    }

    @Override
    public DefaultComboBoxModel combo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DefaultTableModel tabla() {
        DefaultTableModel Modelo = new DefaultTableModel();
        Modelo.addColumn("id");
        Modelo.addColumn("nombre");
        Modelo.addColumn("paterno");
        Modelo.addColumn("materno");
        Modelo.addColumn("sexo");
        Modelo.addColumn("cargo");
        Modelo.addColumn("oficina");

        Object[] fila = new Object[Modelo.getColumnCount()];
        try {

            String sql = "select idpersona, nombre, paterno, materno,sexo,cargo,descripcion from persona \n"
                    + "inner join grupo on grupo.idgrupo = persona.idgrupofk";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                fila[6] = rs.getString(7);
                Modelo.addRow(fila);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaImp.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.CloseConnection();
        }
        return Modelo;
    }

}
