package com.example.integraciones.domain.entity.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * The enum Rol type.
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum RolType {

    /**
     * Admin rol type.
     */
    ADMIN(1,"ROLE_ADMIN"),
    /**
     * User rol type.
     */
    USER(2,"ROLE_USER");
    private final Integer id;
    private final String name;
}
