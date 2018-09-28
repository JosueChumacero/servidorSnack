/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.Servicio.TO.TOTipoProducto;
import java.util.List;

/**
 *
 * @author ChUmA
 */
public interface TipoProductoServicioI {
    
    public List<TOTipoProducto> getTipoProducto(Long idCategoria);
}
