/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica04.dao;

import com.practica04.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jkenn
 */
public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
