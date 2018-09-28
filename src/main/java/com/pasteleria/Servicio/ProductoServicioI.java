/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.TO.TOProductoI;
import com.pasteleria.modelo.Producto;
import java.util.List;

/**
 *
 * @author ChUmA
 */
public interface ProductoServicioI {

    void save(Producto producto);
    
    List<TOProductoI> listarProductos();

}
