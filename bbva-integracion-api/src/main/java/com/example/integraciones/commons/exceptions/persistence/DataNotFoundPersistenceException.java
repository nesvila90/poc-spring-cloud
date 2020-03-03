package com.example.integraciones.commons.exceptions.persistence;

import com.example.integraciones.commons.enums.LogRefServicios;
import com.example.integraciones.commons.exceptions.base.ServiceException;

/**
 * The type Data not found persistence exception.
 */
public class DataNotFoundPersistenceException extends ServiceException {


    /**
     * Instantiates a new Data not found persistence exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     */
    public DataNotFoundPersistenceException(LogRefServicios logRefServicios, String message) {
        super(logRefServicios, message);
    }

    /**
     * Instantiates a new Data not found persistence exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     * @param cause           the cause
     */
    public DataNotFoundPersistenceException(LogRefServicios logRefServicios, String message, Throwable cause) {
        super(logRefServicios, message, cause);
    }
}
