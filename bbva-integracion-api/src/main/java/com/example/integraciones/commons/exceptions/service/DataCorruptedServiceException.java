package com.example.integraciones.commons.exceptions.service;

import com.example.integraciones.commons.enums.LogRefServicios;
import com.example.integraciones.commons.exceptions.base.ServiceException;

/**
 * The type Data corrupted service exception.
 */
public class DataCorruptedServiceException extends ServiceException {

    /**
     * Instantiates a new Data corrupted service exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     */
    public DataCorruptedServiceException(LogRefServicios logRefServicios, String message) {
        super(logRefServicios, message);
    }

    /**
     * Instantiates a new Data corrupted service exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     * @param cause           the cause
     */
    public DataCorruptedServiceException(LogRefServicios logRefServicios, String message, Throwable cause) {
        super(logRefServicios, message, cause);
    }
}
