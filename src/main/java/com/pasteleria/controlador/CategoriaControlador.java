/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.controlador;

import com.pasteleria.Servicio.CategoriaServicioI;
import com.pasteleria.Servicio.TO.TOCategoriaI;
import com.pasteleria.modelo.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ChUmA
 */
@RestController
public class CategoriaControlador {
    
    @Autowired
    private CategoriaServicioI categoriaServicioI;
    
    @RequestMapping(value = "/categoria", method = RequestMethod.GET)
    public List<TOCategoriaI> getUsers() {
        return categoriaServicioI.getCategorias();
    }
    
}
