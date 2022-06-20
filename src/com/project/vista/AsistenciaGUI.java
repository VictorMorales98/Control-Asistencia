/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.vista;

import com.project.assistance.Admin;
import com.project.assistance.Asistencia;
import com.project.assistance.Grupo;
import com.project.assistance.Ocurrencia;
import com.project.interfaze.AsistenciaInt;
import com.project.interfaze.GrupoInt;
import com.project.modelo.AsistenciaImp;
import com.project.modelo.GrupoImp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author conve
 */
public class AsistenciaGUI extends javax.swing.JFrame {

    /**
     * Creates new form AsistenciaGUI
     */
    Admin a;
    
    JComboBox comboBox = new JComboBox();
    Grupo g = new Grupo();
    

    public AsistenciaGUI(Admin a) {
        initComponents();
        this.a = a;
        CargarTablaIndex();
        CargarComboBox();
        CargarComboBoxGrupo();
        txtFecha.setEnabled(false);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        cmbGrupo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAsistencia = new javax.swing.JTable();
        btnAgregar = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SALIR");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REPORTES");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REGISTRO ASISTENCIA");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REGISTRO PERSONA");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTRO GRUPO");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 270, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/img/Lado-B.gif"))); // NOI18N
        jLabel9.setToolTipText("");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/img/Lateral.gif"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 500));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 500));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Asistencia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Grupo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Fecha");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 180, -1));

        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 180, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/icons/flecha-diagonal.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, 40));

        tbAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbAsistencia);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 490, 220));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/icons/mas.png"))); // NOI18N
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, -1, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/icons/recargar.png"))); // NOI18N
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/icons/cancelar.png"))); // NOI18N
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Login l = new Login();

        a.setPas(null);
        a.setUsu(null);

        l.setVisible(true);

        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        ReporteGUI r = new ReporteGUI(a);

        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        AsistenciaGUI as = new AsistenciaGUI(a);

        as.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        PersonaGUI p = new PersonaGUI(a);

        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        GrupoGUI g = new GrupoGUI(a);

        g.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        Principal p = new Principal(a);

        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Grupo cmbo = (Grupo) cmbGrupo.getSelectedItem();
        CargarTabla(cmbo);
        txtFecha.setEnabled(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        AsistenciaInt proc = new AsistenciaImp();
        Asistencia dto = new Asistencia();
        Date date = txtFecha.getDate();

        if (date == null) {
            JOptionPane.showMessageDialog(null, "Debe Colocar Fecha");
        } else {

            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = null;
            fecha = format1.format(date);
//
//            int rowsInsert = 0;
            for (int i = 0; i < tbAsistencia.getRowCount(); i++) {
                Object f = tbAsistencia.getModel().getValueAt(i, 1);
                Object g = tbAsistencia.getModel().getValueAt(i, 2);
                dto.setNombre(f + " " + g);

                Ocurrencia c6 = (Ocurrencia) tbAsistencia.getValueAt(i, 6);
//              
                if (c6 == null) {
                    JOptionPane.showMessageDialog(null, "Seleccione una ocurrencia");
                } else {
                    int c0 = (int) tbAsistencia.getValueAt(i, 0);
                    String c7 = (String) tbAsistencia.getValueAt(i, 7);
                    dto.setIdpersona(c0);
                    dto.setFecha(fecha);
                    dto.setOcurrencia(String.valueOf(c6.getIdOcurrencia()));
                    dto.setDetalle(c7);

                    proc.registrar(dto);
                }
                System.out.println("vuelta: " + i + " - " + dto.getIdpersona() + " " + dto.getFecha());
            }
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        AsistenciaInt proc = new AsistenciaImp();
        Asistencia dto = new Asistencia();
        Date date = txtFecha.getDate();

        if (date == null) {
            JOptionPane.showMessageDialog(null, "Debe Colocar Fecha");
        } else {

            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = null;
            fecha = format1.format(date);

            for (int i = 0; i < tbAsistencia.getRowCount(); i++) {
                Object f = tbAsistencia.getModel().getValueAt(i, 1);
                Object g = tbAsistencia.getModel().getValueAt(i, 2);
                dto.setNombre(f + " " + g);
                Ocurrencia c6 = (Ocurrencia) tbAsistencia.getValueAt(i, 6);
//              
                if (c6 == null) {
                    JOptionPane.showMessageDialog(null, "Seleccione una ocurrencia");
                } else {
                    int c0 = (int) tbAsistencia.getValueAt(i, 0);
                    String c7 = (String) tbAsistencia.getValueAt(i, 7);

                    dto.setIdpersona(c0);
                    dto.setFecha(fecha);
                    dto.setOcurrencia(c6.getDescripcion());
                    dto.setDetalle(c7);

                    proc.actualizar(dto);
                }
                System.out.println("vuelta: " + i + f);
            }
        }
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        AsistenciaInt proc = new AsistenciaImp();
        Asistencia dto = new Asistencia();
        Date date = txtFecha.getDate();

        if (date == null) {
            JOptionPane.showMessageDialog(null, "Debe Colocar Fecha");
        } else {

            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = null;
            fecha = format1.format(date);

            for (int i = 0; i < tbAsistencia.getRowCount(); i++) {
                Object f = tbAsistencia.getModel().getValueAt(i, 1);
                Object g = tbAsistencia.getModel().getValueAt(i, 2);
                dto.setNombre(f + " " + g);
                Ocurrencia c6 = (Ocurrencia) tbAsistencia.getValueAt(i, 6);
//              

                int c0 = (int) tbAsistencia.getValueAt(i, 0);
                dto.setIdpersona(c0);
                dto.setFecha(fecha);

                proc.eliminar(dto);

                System.out.println("vuelta: " + i + f);
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnAgregar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JComboBox<String> cmbGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAsistencia;
    private com.toedter.calendar.JDateChooser txtFecha;
    // End of variables declaration//GEN-END:variables

    private void CargarTabla(Grupo cmbo) {
        AsistenciaInt proc = new AsistenciaImp();
        tbAsistencia.setModel(proc.tablaAsistencia(cmbo));
        tbAsistencia.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbAsistencia.getColumnModel().getColumn(1).setPreferredWidth(20);
        tbAsistencia.getColumnModel().getColumn(2).setPreferredWidth(20);
        tbAsistencia.getColumnModel().getColumn(3).setPreferredWidth(20);
        tbAsistencia.getColumnModel().getColumn(4).setPreferredWidth(10);
        tbAsistencia.getColumnModel().getColumn(5).setPreferredWidth(40);
        tbAsistencia.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(comboBox));
        tbAsistencia.getColumnModel().getColumn(7).setPreferredWidth(100);
    }

    private void CargarComboBox() {
        AsistenciaInt proc = new AsistenciaImp();
        comboBox.setModel(proc.combo());
        tbAsistencia.setRowHeight(22);
        tbAsistencia.getColumnModel().getColumn(6).setCellEditor(new DefaultCellEditor(comboBox));
        tbAsistencia.setDefaultRenderer(Object.class, new Celda(6));
    }

    private void CargarComboBoxGrupo() {
        GrupoInt proc = new GrupoImp();
        cmbGrupo.setModel(proc.combo());
    }

    private void CargarTablaIndex() {
        AsistenciaInt proc = new AsistenciaImp();
        tbAsistencia.setModel(proc.tabla());
    }
}
