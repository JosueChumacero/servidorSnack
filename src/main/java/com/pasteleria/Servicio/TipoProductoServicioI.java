/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.TO.TOTipoProductoI;
import java.util.List;

/**
 *
 * @author ChUmA
 */
public interface TipoProductoServicioI {
    
    public List<TOTipoProductoI> getTipoProducto(Long idCategoria);
}
