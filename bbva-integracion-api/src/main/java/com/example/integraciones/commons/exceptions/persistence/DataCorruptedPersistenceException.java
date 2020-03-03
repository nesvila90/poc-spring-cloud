package com.example.integraciones.commons.exceptions.persistence;

import com.example.integraciones.commons.enums.LogRefServicios;
import com.example.integraciones.commons.exceptions.base.ServiceException;

/**
 * The type Data corrupted persistence exception.
 */
public class DataCorruptedPersistenceException extends ServiceException {

    /**
     * Instantiates a new Data corrupted persistence exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     */
    public DataCorruptedPersistenceException(LogRefServicios logRefServicios, String message) {
        super(logRefServicios, message);
    }

    /**
     * Instantiates a new Data corrupted persistence exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     * @param cause           the cause
     */
    public DataCorruptedPersistenceException(LogRefServicios logRefServicios, String message, Throwable cause) {
        super(logRefServicios, message, cause);
    }
}
