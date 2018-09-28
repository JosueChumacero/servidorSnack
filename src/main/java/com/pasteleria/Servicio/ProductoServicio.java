/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.dao.ProductoDaoI;
import com.pasteleria.dao.TipoProductoDaoI;
import com.pasteleria.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ChUmA
 */
@Service
public class ProductoServicio implements ProductoServicioI {

    @Autowired
    private ProductoDaoI productoDaoI;

    public void save(Producto producto) {
        productoDaoI.save(producto);
    }
}
