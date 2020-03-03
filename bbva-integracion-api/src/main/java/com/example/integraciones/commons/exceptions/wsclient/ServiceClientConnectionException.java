package com.example.integraciones.commons.exceptions.wsclient;

import com.example.integraciones.commons.enums.LogRefServicios;
import com.example.integraciones.commons.exceptions.base.ServiceException;

/**
 * The type Service client connection exception.
 */
public class ServiceClientConnectionException extends ServiceException {

    /**
     * Instantiates a new Service client connection exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     */
    public ServiceClientConnectionException(LogRefServicios logRefServicios, String message) {
        super(logRefServicios, message);
    }

    /**
     * Instantiates a new Service client connection exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     * @param cause           the cause
     */
    public ServiceClientConnectionException(LogRefServicios logRefServicios, String message, Throwable cause) {
        super(logRefServicios, message, cause);
    }
}
