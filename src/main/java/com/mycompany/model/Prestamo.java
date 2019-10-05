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
 * @author Joan
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
    
     public String getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(String idprestamo) {
        this.idprestamo = idprestamo;
    }

    public String getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(String fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public String getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(String fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIsbnlibro() {
        return isbnlibro;
    }

    public void setIsbnlibro(String isbnlibro) {
        this.isbnlibro = isbnlibro;
    }
    
    public Integer getCedulausuario() {
        return cedulausuario;
    }

    public void setCedulausuario(Integer cedulausuario) {
        this.cedulausuario = cedulausuario;
    }
    
}
