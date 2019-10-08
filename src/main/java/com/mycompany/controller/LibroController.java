/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.ejb.LibroFacadeLocal;
import com.mycompany.model.Libro;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
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
    private List<Libro> gridLibros;
        
    @PostConstruct
    public void init(){
        libro = new Libro();
        findAll();
    }
    
    public void registrar(){
        try{
            Libro libroTmp = libroEJB.ExisteLibro(libro.getIsbn());
           
            if(libroTmp != null){
                if(libro.getCantidad() == 0){
                    libro.setCantidad(libroTmp.getCantidad() + 1);
                }else{
                    libro.setCantidad(libroTmp.getCantidad() + libro.getCantidad());
                }                
                libro.setNombre(libroTmp.getNombre());
                libro.setDescripcion(libroTmp.getDescripcion());
                libro.setClasificacion(libroTmp.getClasificacion());
                libroEJB.edit(libro);
            }else{
              libroEJB.create(libro);  
            } 
            FacesContext.getCurrentInstance().getExternalContext().redirect("libro.xhtml");
        }catch(Exception e){
            //Mensaje pendiente por definir
        }
    }
    
    public void remove(){
        try{
            Libro libroTmp = libroEJB.ExisteLibro(libro.getIsbn());
           
            if(libroTmp != null){
                if(libroTmp.getCantidad() > 0){
                    libro.setCantidad(libroTmp.getCantidad() - 1);
                    libro.setNombre(libroTmp.getNombre());
                    libro.setDescripcion(libroTmp.getDescripcion());
                    libro.setClasificacion(libroTmp.getClasificacion());
                    libroEJB.edit(libro);
                }else{
                    libroEJB.remove(libro);  
                }
            } 
            FacesContext.getCurrentInstance().getExternalContext().redirect("libro.xhtml");
        }catch(Exception e){
            //Mensaje pendiente por definir
        }
    }
    
    public void edit(){
        try{
            libroEJB.edit(libro);     
            FacesContext.getCurrentInstance().getExternalContext().redirect("libro.xhtml");
        }catch(Exception e){
            //Mensaje pendiente por definir
        }
    }
    
    public void findAll(){
       try{
            gridLibros = libroEJB.findAll();                        
        }catch(Exception e){
            //Mensaje pendiente por definir
        }       
    }

    public static boolean esPalindromo(String cadena) {
        // Invertir la cadena, cadena es igual a  la original entonces
        String invertida = new StringBuilder(cadena).reverse().toString();
        return invertida.equals(cadena);
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Libro> getGridLibros() {
        return gridLibros;
    }

    public void setGridLibros(List<Libro> gridLibros) {
        this.gridLibros = gridLibros;
    }
    
}
