/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.Servicio.TO.TOCategoriaI;
import com.pasteleria.dao.CategoriaDaoI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ChUmA
 */
@Service
public class CategoriaServicio implements CategoriaServicioI {

    @Autowired
    private CategoriaDaoI categoriaDaoI;

    public List<TOCategoriaI> getCategorias() {
        return categoriaDaoI.findByEstado("S");
    }

}
