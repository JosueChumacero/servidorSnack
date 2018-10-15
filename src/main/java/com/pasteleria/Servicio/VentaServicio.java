/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.TO.TOVentaI;
import com.pasteleria.dao.DetalleVentaDaoI;
import com.pasteleria.dao.VentaDaoI;
import com.pasteleria.dto.DetalleVentaDto;
import com.pasteleria.dto.VentaDto;
import com.pasteleria.excepcion.ExcepcionNegocio;
import com.pasteleria.modelo.DetalleVenta;
import com.pasteleria.modelo.DetalleVentaPK;
import com.pasteleria.modelo.Venta;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ChUmA
 */
@Service
@Transactional
public class VentaServicio implements VentaServicioI {

    @Autowired
    private VentaDaoI ventaDaoI;
    @Autowired
    private DetalleVentaDaoI detalleVentaDaoI;

    @Override
    public void guardarVenta(VentaDto venta) throws ExcepcionNegocio {
        try {
            Venta v = new Venta();
            v.setTotal(venta.getTotal());
            v.setFecha(venta.getFecha());
            v.setEstado(venta.getEstado());
            v.setNombre(venta.getNombre());
            ventaDaoI.save(v);
            for (DetalleVentaDto detalle : venta.getDetalleVentaList()) {
                DetalleVenta detalleventa = new DetalleVenta(new DetalleVentaPK(v.getIdVenta(), detalle.getIdProducto().getIdProducto()));
                detalleventa.setPrecio(detalle.getIdProducto().getPrecio());
                detalleventa.setCantidad(detalle.getCantidad());
                detalleventa.setEstado(detalle.getEstado());
                detalleVentaDaoI.save(detalleventa);
            }
        } catch (Exception e) {
            throw new ExcepcionNegocio(e.getMessage());
        }
    }

    @Override
    public List<TOVentaI> getVentas(String estado) {
        return ventaDaoI.findByEstado(estado);
    }

}
