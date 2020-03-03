package com.example.integraciones.domain.entity.enums;

import com.example.integraciones.commons.enums.LogRefServicios;
import com.example.integraciones.commons.exceptions.service.DataCorruptedServiceException;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * The enum Id type.
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum IdType {

    /**
     * The Cc.
     */
    CC("CC", "Cédula de Ciudadania.");

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private final @Getter
    String type;

    private final @Getter
    String description;

    /**
     * Find id type by type id type.
     *
     * @param type the type
     * @return the id type
     * @throws DataCorruptedServiceException the data corrupted service exception
     */
    public static IdType findIdTypeByType(String type) throws DataCorruptedServiceException {
        return Stream.of(IdType.values()).filter(idType1 -> idType1.getType().equals(type)).findAny()
                .orElseThrow(() -> new DataCorruptedServiceException(LogRefServicios.ERROR_DATO_CORRUPTO, "Tipo de identificación incorrecta."));
    }

}
