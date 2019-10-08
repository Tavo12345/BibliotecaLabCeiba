/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb;

import com.mycompany.model.Libro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Gustavo
 */
@Stateless
public class LibroFacade extends AbstractFacade<Libro> implements LibroFacadeLocal {
    @PersistenceContext(unitName = "bibliotecaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LibroFacade() {
        super(Libro.class);
    }
    
    @Override
    public Libro ExisteLibro(String isbn){
        Libro respuesta = null;
        
        try{
           Query query = em.createNamedQuery("buscar libro por isbn");
           query.setParameter("isbn", isbn);
           List<Libro> resultado = query.getResultList();
           
           if(!resultado.isEmpty()){
               respuesta = resultado.get(0);
           }
        }catch(Exception e){
            System.out.println("Error al consultar existencia del libro"); 
        }
        
        return respuesta;
    }
    
    @Override
    public List<Libro> findAll(){
        List<Libro> respuesta = null;
        
        try{
           Query query = em.createNamedQuery("buscar libros");
           List<Libro> resultado = query.getResultList();
           if(!resultado.isEmpty()){
               respuesta = resultado;
           }
           /*
           for (Libro lib: resultado){
               
           }
           */
           
        }catch(Exception e){
            System.out.println("Error al consultar existencia del libro"); 
        }
        
        return respuesta;
    }
}
