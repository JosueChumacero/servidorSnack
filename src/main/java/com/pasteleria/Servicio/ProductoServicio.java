/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.TO.TOProductoI;
import com.pasteleria.dao.ProductoDaoI;
import com.pasteleria.helper.HelperCodigos;
import com.pasteleria.modelo.Producto;
import java.util.List;
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

    @Override
    public void save(Producto producto) {
        productoDaoI.save(producto);
    }

    @Override
    public List<TOProductoI> listarProductos() {
        return productoDaoI.findByEstado(HelperCodigos.ESTADO_ACTIVO);
    }
}
