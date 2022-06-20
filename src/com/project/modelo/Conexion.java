/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.modelo;

import com.mysql.jdbc.Connection;
import com.project.assistance.Admin;
import java.sql.DriverManager;
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
public class Conexion {

    Connection cn;
    String url = "jdbc:mysql://localhost/controlasistencia?useSSL=false";
    String drv = "com.mysql.jdbc.Driver";
    String usu = "root";
    String pass = "123456789";

    public Statement stm = null;
    ResultSet rs = null;

    Connection ConnectionSQL() {
        try {
            Class.forName(drv);
            cn = (Connection) DriverManager.getConnection(url, usu, pass);
            stm = cn.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }

    void CloseConnection() {
        try {
            cn.close();
        } catch (SQLException sqle) {
            System.out.println("Sql Exception: " + sqle.getMessage());
        }
    }

    ResultSet getData(String sql) {
        try {
            this.ConnectionSQL();
            rs = stm.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error getDatos: " + e);
        }
        return rs;
    }
    
    public boolean login(Admin a){
        try {
            cn = ConnectionSQL();
            
            String SQL = "SELECT * FROM LOGIN WHERE USUARIO = ?";
            
            PreparedStatement ps;
            ps = cn.prepareStatement(SQL);
            ps.setString(1, a.getUsu());
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(a.getPas().equals(rs.getString(3))){
                    return true;
                }else{
                    return false;
                }
            }
            return false;           
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

}
