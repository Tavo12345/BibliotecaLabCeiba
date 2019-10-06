/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.ejb.LibroFacadeLocal;
import com.mycompany.model.Libro;
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
public class LibroController implements Serializable {
    @EJB
    private LibroFacadeLocal libroEJB;
    private Libro libro;
    
    @PostConstruct
    public void init(){
        libro = new Libro();
    }
    
    public void registrar(){
        try{
            System.out.println("datos: " + libro.getIsbn());
            libroEJB.create(libro);
        }catch(Exception e){
            //Mensaje pendiente por definir
        }
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
}
