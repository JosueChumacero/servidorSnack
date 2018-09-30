/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.controlador;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pasteleria.Servicio.ProductoServicioI;
import com.pasteleria.TO.TOProductoI;
import com.pasteleria.helper.HelperCodigos;
import com.pasteleria.util.RestResponse;
import com.pasteleria.modelo.Producto;
import com.pasteleria.modelo.TipoProducto;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ChUmA
 */
@RestController
public class ProductoControlador {

    @Autowired
    private ProductoServicioI productoServicioI;

    protected ObjectMapper mapper;

    @RequestMapping(value = "/producto", method = RequestMethod.POST)
    public RestResponse save(@RequestBody String productoJson) {
        try {
            mapper = new ObjectMapper();
            Producto producto = mapper.readValue(productoJson, Producto.class);
            productoServicioI.save(producto);
            return new RestResponse(HttpStatus.OK.value(), "Grabacion Exitosa");
        } catch (IOException ex) {
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), ex.getMessage());
        } catch (Exception ex) {
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "algunos campos obligatorios estan nulos");
        }
    }

    @RequestMapping(value = "/producto", method = RequestMethod.GET)
    public List<TOProductoI> getProductos() {
        return productoServicioI.listarProductos();
    }
}
