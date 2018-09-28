/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.TO;

import java.math.BigDecimal;

/**
 *
 * @author ChUmA
 */
public class ProductoDTO {
    private Long idProducto;
    private String descripcion;
    private BigDecimal precio;
    private Long idTipoproducto;

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Long getIdTipoproducto() {
        return idTipoproducto;
    }

    public void setIdTipoproducto(Long idTipoproducto) {
        this.idTipoproducto = idTipoproducto;
    }
    
    
}
