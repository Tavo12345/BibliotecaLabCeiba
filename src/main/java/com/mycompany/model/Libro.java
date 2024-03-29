
package com.mycompany.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Gustavo
 */
@Entity
@Table(name="libro")
@NamedQueries({
    @NamedQuery(query = "SELECT l FROM Libro l WHERE l.isbn = :isbn", name = "buscar libro por isbn"),
    @NamedQuery(query = "SELECT l FROM Libro l", name = "buscar libros")
})
public class Libro implements Serializable {
    
    @Id 
    //@GeneratedValue(strategy=GenerationType.TABLE)
    private String isbn;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="clasificacion")
    private String clasificacion;
    
    @Column(name="cantidad")
    private Integer cantidad;  

    public Libro() {
        cantidad = 0;
    }
        
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
}
