/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.controlador;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pasteleria.Servicio.VentaServicioI;
import com.pasteleria.TO.TOVentaI;
import com.pasteleria.dto.VentaDto;
import com.pasteleria.excepcion.ExcepcionNegocio;
import com.pasteleria.helper.HelperCodigos;
import com.pasteleria.util.RestResponse;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ChUmA
 */
@RestController
public class VentasController {

    @Autowired
    private VentaServicioI ventaServicioI;
    protected ObjectMapper mapper;

    @RequestMapping(value = "/venta", method = RequestMethod.POST)
    public RestResponse save(@RequestBody String ventaJson) {
        try {
            mapper = new ObjectMapper();
            VentaDto venta = mapper.readValue(ventaJson, VentaDto.class);
            ventaServicioI.guardarVenta(venta);
            return new RestResponse(HttpStatus.OK.value(), "Grabacion Exitosa");
        } catch (ExcepcionNegocio ex) {
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), ex.getMessage());
        } catch (IOException ex) {
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Error en guardar Venta");
        } catch (Exception ex) {
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "algunos campos obligatorios estan nulos");
        }
    }

    @RequestMapping(value = "/venta", method = RequestMethod.GET)
    public List<TOVentaI> getVentas() {
        return ventaServicioI.getVentas(HelperCodigos.ESTADO_ACTIVO);
    }

}
