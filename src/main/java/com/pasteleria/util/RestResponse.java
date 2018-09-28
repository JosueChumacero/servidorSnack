/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasteleria.util;

/**
 *
 * @author ChUmA
 */
public class RestResponse {

    private Integer responseCode;
    private String message;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RestResponse(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public RestResponse(Integer responseCode, String message) {
        this.responseCode = responseCode;
        this.message = message;
    }

}
