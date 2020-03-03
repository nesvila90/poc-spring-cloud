package com.example.integraciones.commons.exceptions.persistence;

import com.example.integraciones.commons.enums.LogRefServicios;
import com.example.integraciones.commons.exceptions.base.ServiceException;

/**
 * The type Portal persistence exception.
 */
public class PortalPersistenceException extends ServiceException {

    /**
     * Instantiates a new Portal persistence exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     */
    public PortalPersistenceException(LogRefServicios logRefServicios, String message) {
        super(logRefServicios, message);
    }

    /**
     * Instantiates a new Portal persistence exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     * @param cause           the cause
     */
    public PortalPersistenceException(LogRefServicios logRefServicios, String message, Throwable cause) {
        super(logRefServicios, message, cause);
    }
}
