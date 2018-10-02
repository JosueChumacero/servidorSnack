/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ChUmA
 */
@Entity
@Table(name = "detalleventa")
public class DetalleVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleVentaPK detalleVentaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "precio")
    private BigDecimal precio;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private long cantidad;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto idProducto;
    @JoinColumn(name = "id_venta", referencedColumnName = "id_venta", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Venta venta;

    public DetalleVenta() {
    }

    public DetalleVenta(DetalleVentaPK detalleVentaPK) {
        this.detalleVentaPK = detalleVentaPK;
    }

    public DetalleVenta(DetalleVentaPK detalleVentaPK, BigDecimal precio, long cantidad, String estado) {
        this.detalleVentaPK = detalleVentaPK;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;
    }

    public DetalleVenta(long idVenta, long idProducto) {
        this.detalleVentaPK = new DetalleVentaPK(idVenta, idProducto);
    }

    public DetalleVentaPK getDetalleVentaPK() {
        return detalleVentaPK;
    }

    public void setDetalleVentaPK(DetalleVentaPK detalleVentaPK) {
        this.detalleVentaPK = detalleVentaPK;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleVentaPK != null ? detalleVentaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVenta)) {
            return false;
        }
        DetalleVenta other = (DetalleVenta) object;
        if ((this.detalleVentaPK == null && other.detalleVentaPK != null) || (this.detalleVentaPK != null && !this.detalleVentaPK.equals(other.detalleVentaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication2.DetalleVenta[ detalleVentaPK=" + detalleVentaPK + " ]";
    }
    
}
