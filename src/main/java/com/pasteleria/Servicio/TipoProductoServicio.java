/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.TO.TOTipoProductoI;
import com.pasteleria.dao.ProductoDaoI;
import com.pasteleria.dao.TipoProductoDaoI;
import com.pasteleria.excepcion.ExcepcionNegocio;
import com.pasteleria.helper.HelperCodigos;
import com.pasteleria.modelo.Categoria;
import com.pasteleria.modelo.TipoProducto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ChUmA
 */
@Service
public class TipoProductoServicio implements TipoProductoServicioI {

    @Autowired
    private TipoProductoDaoI tipoProductoDaoI;
    @Autowired
    private ProductoDaoI productoDaoI;

    @Override
    public List<TOTipoProductoI> getTipoProducto(Long idCategoria) {
        return tipoProductoDaoI.findByIdCategoriaAndEstado(new Categoria(idCategoria), HelperCodigos.ESTADO_ACTIVO);
    }

    @Override
    public List<TOTipoProductoI> getTipoProductos() {
        return tipoProductoDaoI.findByEstado(HelperCodigos.ESTADO_ACTIVO);
    }

    @Override
    public void save(TipoProducto tipoProducto) throws ExcepcionNegocio {
        try {
            if (tipoProducto.getIdTipoproducto() == null) {
                if (tipoProductoDaoI.findByIdCategoriaAndEstadoAndDescripcion(tipoProducto.getIdCategoria(),
                        HelperCodigos.ESTADO_ACTIVO, tipoProducto.getDescripcion()).size() > 0) {
                    throw new ExcepcionNegocio("Tipo de producto ya existe");
                }
            }
            if (tipoProducto.getEstado().equalsIgnoreCase(HelperCodigos.ESTADO_INACTIVO)) {
                if (productoDaoI.findByEstadoAndIdTipoproducto(HelperCodigos.ESTADO_ACTIVO, tipoProducto).size() > 0) {
                    throw new ExcepcionNegocio("registro no se puede eliminar, tiene productos vigentes asociados");
                }
            }
            if (tipoProducto.getDescripcion().isEmpty()) {
                throw new ExcepcionNegocio("Ingrese descripción");
            }
            tipoProductoDaoI.save(tipoProducto);
        } catch (ExcepcionNegocio e) {
            throw e;
        } catch (Exception e) {
            throw new ExcepcionNegocio("Error al guardar Tipo Producto");
        }

    }
}
