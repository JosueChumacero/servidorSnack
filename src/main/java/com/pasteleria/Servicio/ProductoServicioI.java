/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.TO.TOProductoI;
import com.pasteleria.excepcion.ExcepcionNegocio;
import com.pasteleria.modelo.Producto;
import java.util.List;

/**
 *
 * @author ChUmA
 */
public interface ProductoServicioI {

    public void save(Producto producto) throws ExcepcionNegocio;

    List<TOProductoI> listarProductos();
    
    List<TOProductoI> findByDescripcionLike(String estado, String descripcion);

}
