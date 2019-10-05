/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name="prestamo")
public class Prestamo implements Serializable {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer isbn;
    
    @Column(name="idprestamo")
    private String idprestamo;
    
    @Column(name="fechaprestamo")
    private String fechaprestamo;
    
    @Column(name="fechaentrega")
    private String fechaentrega;
    
    @Column(name="estado")
    private String estado; 
    
    @Column(name="isbnlibro")
    private String isbnlibro; 
    
    @Column(name="cedulausuario")
    private Integer cedulausuario; 
    
}
