/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.TO.TOProductoI;
import com.pasteleria.dao.ProductoDaoI;
import com.pasteleria.excepcion.ExcepcionNegocio;
import com.pasteleria.helper.HelperCodigos;
import com.pasteleria.modelo.Producto;
import java.math.BigDecimal;
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
    public void save(Producto producto) throws ExcepcionNegocio {
        try {
            if (producto.getIdProducto() == null) {
                if (productoDaoI.findByEstadoAndIdTipoproductoAndDescripcion(HelperCodigos.ESTADO_ACTIVO,
                        producto.getIdTipoproducto(), producto.getDescripcion()).size() > 0) {
                    throw new ExcepcionNegocio("Producto ya existe");
                }
            }
            if (producto.getDescripcion().isEmpty()){
                throw new ExcepcionNegocio("Ingrese descripcion");
            }
            if (producto.getPrecio().compareTo(BigDecimal.ZERO) < 1) {
                throw new ExcepcionNegocio("Precio debe ser mayor a 0");
            }
            productoDaoI.save(producto);
        } catch (ExcepcionNegocio e) {
            throw e;
        } catch (Exception e) {
            throw new ExcepcionNegocio(e.getMessage());
        }
    }

    @Override
    public List<TOProductoI> listarProductos() {
        return productoDaoI.findByEstado(HelperCodigos.ESTADO_ACTIVO);
    }

    @Override
    public List<TOProductoI> findByDescripcionLike(String estado, String descripcion) {
        return productoDaoI.findByDescripcionLike(estado, descripcion);
    }
}
