/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.TO.TOTipoProductoI;
import com.pasteleria.modelo.TipoProducto;
import java.util.List;

/**
 *
 * @author ChUmA
 */
public interface TipoProductoServicioI {
    
    public List<TOTipoProductoI> getTipoProducto(Long idCategoria);
    
    public List<TOTipoProductoI> getTipoProductos();
    
    public void save(TipoProducto tipoProducto);
}
