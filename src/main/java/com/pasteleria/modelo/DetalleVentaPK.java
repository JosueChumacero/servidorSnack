/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ChUmA
 */
@Embeddable
public class DetalleVentaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_venta")
    private long idVenta;
    @Basic(optional = false)
    @Column(name = "id_producto")
    private long idProducto;

    public DetalleVentaPK() {
    }

    public DetalleVentaPK(long idVenta, long idProducto) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
    }

    public long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(long idVenta) {
        this.idVenta = idVenta;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idVenta;
        hash += (int) idProducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVentaPK)) {
            return false;
        }
        DetalleVentaPK other = (DetalleVentaPK) object;
        if (this.idVenta != other.idVenta) {
            return false;
        }
        if (this.idProducto != other.idProducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.DetalleVentaPK[ idVenta=" + idVenta + ", idProducto=" + idProducto + " ]";
    }
    
}
