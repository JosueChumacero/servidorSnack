/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.dao;

import com.pasteleria.TO.TOTipoProductoI;
import com.pasteleria.modelo.Categoria;
import com.pasteleria.modelo.TipoProducto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ChUmA
 */
@Repository
public interface TipoProductoDaoI extends JpaRepository<TipoProducto, Long> {

    List<TOTipoProductoI> findByIdCategoriaAndEstado(Categoria categoria, String estado);

    List<TOTipoProductoI> findByEstado(String estado);

    List<TOTipoProductoI> findByIdCategoriaAndEstadoAndDescripcion(Categoria categoria, String estado, String descripcion);
}
