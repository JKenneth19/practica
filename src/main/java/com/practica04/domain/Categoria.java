package com.practica04.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")

public class Categoria implements Serializable { //serializacion porque se va almacenar ciertos datos en el disco

    private static final long serialVersionUID = 1L; //para poder hacer el ciclo de la sumatoria de la categoria.

    @Id //id categoria es la llave de la tabla categoria. 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Los valores generados que estrategia usan, identico a la BD 
    @Column(name = "id_categoria") //decir cual es el nombre en la base de datos. Se hace la asociación 
    private long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    //Acá asociacion con la tabla de productos
    @OneToMany // de categoria a productos es una relacion de uno a muchos (porque tenemos una categoria con muchos productos)
    @JoinColumn(name="id_categoria", updatable = false)// esta es la union con la tabla de productos (foreign key)
    List<Producto> productos;// lista de productos

    public Categoria() {
    }

    public Categoria(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }

}
