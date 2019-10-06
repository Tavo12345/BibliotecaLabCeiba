/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.ejb.PrestamoFacadeLocal;
import com.mycompany.model.Prestamo;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Gustavo
 */
@Named
@ViewScoped
public class PrestamoController implements Serializable {
    @EJB
    private PrestamoFacadeLocal prestamoEJB;
    private Prestamo prestamo;
    
    @PostConstruct
    public void init(){
        prestamo = new Prestamo();
    }
    
    public void registrar(){
        try{
            prestamoEJB.create(prestamo);
        }catch(Exception e){
            //Mensaje pendiente por definir
        }
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }
}
