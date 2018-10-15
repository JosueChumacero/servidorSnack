/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.TO;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ChUmA
 */
public interface TOVentaI {

    Long getIdVenta();

    long getTotal();

    String getNombre();

    Date getFecha();

    String getEstado();

    List<TODetalleVentaI> getDetalleVentaList();

}
