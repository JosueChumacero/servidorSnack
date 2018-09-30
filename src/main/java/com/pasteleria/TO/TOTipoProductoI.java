/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.TO;

/**
 *
 * @author ChUmA
 */
public interface TOTipoProductoI {

    Long getIdTipoproducto();

    String getDescripcion();
    
    TOCategoriaI getIdCategoria();

}
