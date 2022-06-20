/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.assistance;

/**
 *
 * @author conve
 */
public class Ocurrencia {
    
    private int idOcurrencia;
    private String Descripcion;

    public Ocurrencia() {
    }

    public Ocurrencia(int idOcurrencia, String Descripcion) {
        this.idOcurrencia = idOcurrencia;
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return Descripcion;
    }

    public int getIdOcurrencia() {
        return idOcurrencia;
    }

    public void setIdOcurrencia(int idOcurrencia) {
        this.idOcurrencia = idOcurrencia;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
}
