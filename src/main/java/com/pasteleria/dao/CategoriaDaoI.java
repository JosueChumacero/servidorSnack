/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.dao;

import com.pasteleria.Servicio.TO.TOCategoriaI;
import com.pasteleria.modelo.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ChUmA
 */
@Repository
public interface CategoriaDaoI extends JpaRepository<Categoria, Long>{
    
    List<TOCategoriaI> findByEstado(String estado);
    
}
