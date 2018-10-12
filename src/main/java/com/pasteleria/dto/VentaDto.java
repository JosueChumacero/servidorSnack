/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.dto;

import com.pasteleria.modelo.DetalleVenta;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ChUmA
 */
public class VentaDto {
    private Long idVenta;
    private Long total;
    private String nombre;
    private Date fecha;
    private String estado;
    private List<DetalleVentaDto> detalleVenta;

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<DetalleVentaDto> getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(List<DetalleVentaDto> detalleVenta) {
        this.detalleVenta = detalleVenta;
    }
    
}
