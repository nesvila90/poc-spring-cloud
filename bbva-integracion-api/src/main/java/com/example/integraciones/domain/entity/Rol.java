package com.example.integraciones.domain.entity;

import com.example.integraciones.domain.entity.base.BaseEntity;
import com.example.integraciones.domain.entity.enums.RolType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * The type Rol.
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Rol extends BaseEntity {

    @Schema(description = "Type Id", example = "USER")
    @Enumerated(EnumType.STRING)
    private RolType rol;
}

