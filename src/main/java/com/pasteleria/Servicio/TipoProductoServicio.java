/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.TO.TOTipoProductoI;
import com.pasteleria.dao.TipoProductoDaoI;
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

    @Override
    public List<TOTipoProductoI> getTipoProducto(Long idCategoria) {
        return tipoProductoDaoI.findByIdCategoriaAndEstado(new Categoria(idCategoria),"S");
    }

}
