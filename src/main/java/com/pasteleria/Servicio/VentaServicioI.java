/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.Servicio;

import com.pasteleria.dto.VentaDto;
import com.pasteleria.excepcion.ExcepcionNegocio;

/**
 *
 * @author ChUmA
 */
public interface VentaServicioI {
    
    public void guardarVenta(VentaDto venta)  throws ExcepcionNegocio;
    
}
