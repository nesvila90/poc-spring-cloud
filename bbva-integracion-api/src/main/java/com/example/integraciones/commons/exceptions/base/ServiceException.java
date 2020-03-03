package com.example.integraciones.commons.exceptions.base;

import com.example.integraciones.commons.enums.LogRefServicios;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * The type Service exception.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceException extends Exception {

    private LogRefServicios logRefServicios;

    private String message;

    /**
     * Instantiates a new Service exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     */
    public ServiceException(LogRefServicios logRefServicios, String message) {
        super(message);
        this.logRefServicios = logRefServicios;
        this.message = message;
    }

    /**
     * Instantiates a new Service exception.
     *
     * @param logRefServicios the log ref servicios
     * @param message         the message
     * @param cause           the cause
     */
    public ServiceException(LogRefServicios logRefServicios, String message, Throwable cause) {
        super(message, cause);
        this.logRefServicios = logRefServicios;
        this.message = message;
    }
}
