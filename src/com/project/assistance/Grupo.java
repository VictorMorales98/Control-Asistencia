/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.assistance;

/**
 *
 * @author conve
 */
public class Grupo {
    
    private int idGrupo;
    private String Descripcion;

    public Grupo() {
    }

    public Grupo(int idGrupo, String Descripcion) {
        this.idGrupo = idGrupo;
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return Descripcion;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idOficina) {
        this.idGrupo = idOficina;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
