package com.practica04.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")

public class Producto implements Serializable { //serializacion porque se va almacenar ciertos datos en el disco

    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria de la producto.

    @Id //id producto es la llave de la tabla producto. 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que estrategia usan, identico a la BD 
    @Column(name = "id_producto") //decir cual es el nombre en la base de datos. Se hace la asociación 
    private long idProducto;
    //private long idCategoria;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencia;
    private String rutaImagen;
    private boolean activo;
    
    @ManyToOne // de categoria a productos es una relacion de uno a muchos (porque tenemos una categoria con muchos productos)
    @JoinColumn(name="id_categoria")// esta es la union con la tabla de productos (foreign key)
    Categoria categoria;// Categoria Informacio ID
    
    public Producto() {
    }

    public Producto(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}
