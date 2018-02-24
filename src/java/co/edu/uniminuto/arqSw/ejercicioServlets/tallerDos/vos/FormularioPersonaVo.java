/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.ejercicioServlets.tallerDos.vos;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class FormularioPersonaVo {
    
    private String nombre ;
    
    private String fechaNac;

    public FormularioPersonaVo(String nNombre, String nfechaNac) {
        this.nombre = nNombre;
        this.fechaNac = nfechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
    
    
    
}
