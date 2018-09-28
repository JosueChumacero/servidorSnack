/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.controlador;

import com.pasteleria.Servicio.TO.TOTipoProducto;
import com.pasteleria.Servicio.TipoProductoServicioI;
import com.pasteleria.modelo.TipoProducto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ChUmA
 */
@RestController
public class TipoProductoController {
    
    @Autowired
    private TipoProductoServicioI tipoProductoServicioI;
    
    @RequestMapping(value = "/tipoProducto", method = RequestMethod.GET)
    public List<TOTipoProducto> getUsers(@RequestParam("idCategoria") Long idCategoria ) {
        return tipoProductoServicioI.getTipoProducto(idCategoria);
    }
    
}
