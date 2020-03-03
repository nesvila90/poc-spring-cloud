package com.example.integraciones.commons.exceptions.service;

import com.example.integraciones.commons.enums.LogRefServicios;
import com.example.integraciones.commons.exceptions.base.ServiceException;

/**
 * The type Data not found service exception.
 */
public class DataNotFoundServiceException extends ServiceException {

    /**
     * Instantiates a new Data not found service exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     */
    public DataNotFoundServiceException(LogRefServicios logRefServicios, String message) {
        super(logRefServicios, message);
    }

    /**
     * Instantiates a new Data not found service exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     * @param cause           the cause
     */
    public DataNotFoundServiceException(LogRefServicios logRefServicios, String message, Throwable cause) {
        super(logRefServicios, message, cause);
    }
}
