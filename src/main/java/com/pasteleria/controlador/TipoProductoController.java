/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.controlador;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pasteleria.TO.TOTipoProductoI;
import com.pasteleria.Servicio.TipoProductoServicioI;
import com.pasteleria.excepcion.ExcepcionNegocio;
import com.pasteleria.modelo.TipoProducto;
import com.pasteleria.util.RestResponse;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ChUmA
 */
@RestController
public class TipoProductoController {

    @Autowired
    private TipoProductoServicioI tipoProductoServicioI;
    protected ObjectMapper mapper;

    @RequestMapping(value = "/tipoProductoCategoria", method = RequestMethod.GET)
    public List<TOTipoProductoI> getTipoProductoCategoria(@RequestParam("idCategoria") Long idCategoria) {
        return tipoProductoServicioI.getTipoProducto(idCategoria);
    }

    @RequestMapping(value = "/tipoProducto", method = RequestMethod.GET)
    public List<TOTipoProductoI> getTipoProducto() {
        return tipoProductoServicioI.getTipoProductos();
    }

    @RequestMapping(value = "/tipoProducto", method = RequestMethod.POST)
    public RestResponse save(@RequestBody String tipProductoJson) {
        try {
            mapper = new ObjectMapper();
            TipoProducto tipoProducto = mapper.readValue(tipProductoJson, TipoProducto.class);
            tipoProductoServicioI.save(tipoProducto);
            return new RestResponse(HttpStatus.OK.value(), "Grabacion Exitosa");
        } catch (ExcepcionNegocio ex) {
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), ex.getMessage());
        } catch (IOException ex) {
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Error en guardar Tipo de Producto");
        } catch (Exception ex) {
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "algunos campos obligatorios estan nulos");
        }
    }

}
