/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.dao;

import com.pasteleria.modelo.DetalleVenta;
import com.pasteleria.modelo.DetalleVentaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ChUmA
 */
@Repository
public interface DetalleVentaDaoI extends JpaRepository<DetalleVenta, DetalleVentaPK>{
    
}
