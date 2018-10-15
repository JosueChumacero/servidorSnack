/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.TO.TOVentaI;
import com.pasteleria.dto.VentaDto;
import com.pasteleria.excepcion.ExcepcionNegocio;
import java.util.List;

/**
 *
 * @author ChUmA
 */
public interface VentaServicioI {

    public void guardarVenta(VentaDto venta) throws ExcepcionNegocio;

    public List<TOVentaI> getVentas(String estado);
}
