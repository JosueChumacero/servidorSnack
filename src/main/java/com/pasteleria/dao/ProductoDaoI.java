/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.dao;

import com.pasteleria.TO.TOProductoI;
import com.pasteleria.modelo.Categoria;
import com.pasteleria.modelo.Producto;
import com.pasteleria.modelo.TipoProducto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ChUmA
 */
@Repository
public interface ProductoDaoI extends JpaRepository<Producto, Long> {

    List<TOProductoI> findByEstado(String estado);

    List<TOProductoI> findByEstadoAndIdTipoproductoAndDescripcion(String estado, 
            TipoProducto tipoProducto, String descripcion);
    
    List<TOProductoI> findByEstadoAndIdTipoproducto(String estado,TipoProducto tipoProducto);
}
