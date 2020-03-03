package com.example.integraciones.commons.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The enum Log ref servicios.
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum LogRefServicios {

    /**
     * Error general servicio log ref servicios.
     */
    ERROR_GENERAL_SERVICIO("ERROR_GENERAL_SERVICIO", "/ayuda/error_general_servicio.html"),
    /**
     * Error persistencia log ref servicios.
     */
    ERROR_PERSISTENCIA("ERROR_PERSISTENCIA", "/ayuda/error_persistencia.html"),
    /**
     * Error cliente servicio log ref servicios.
     */
    ERROR_CLIENTE_SERVICIO("ERROR_CLIENTE_SERVICIO", "/ayuda/error_cliente_servicio.html"),
    /**
     * Error dato corrupto log ref servicios.
     */
    ERROR_DATO_CORRUPTO("ERROR_DATO_CORRUPTO", "/ayuda/error_general_servicio.html"),
    /**
     * Error jwt seguridad log ref servicios.
     */
    ERROR_JWT_SEGURIDAD("ERROR_JWT_VALIDACION", "/ayuda/error_validacion_jwt.html"),
    /**
     * Error dato no encontrado log ref servicios.
     */
    ERROR_DATO_NO_ENCONTRADO("ERROR_DATO_NO_ENCONTRADO", "/ayuda/error_general_servicio.html"),
    /**
     * Error usuario deshabilitado log ref servicios.
     */
    ERROR_USUARIO_DESHABILITADO("USER_DISABLED", "/ayuda/error_general/usuario_deshabilitado.html");


    /**
     * Codigo del error
     */
    private @Getter
    String logRef;
    /**
     * Enlace a la pagina con ayuda
     */
    private @Getter
    String hrefLink;

    /**
     * Value of log ref log ref servicios.
     *
     * @param logRef the log ref
     * @return the log ref servicios
     */
    public static LogRefServicios valueOfLogRef(String logRef) {
        for (LogRefServicios item : values()) {
            if (item.getLogRef().equals(logRef)) {
                return item;
            }
        }
        return null;
    }
}
