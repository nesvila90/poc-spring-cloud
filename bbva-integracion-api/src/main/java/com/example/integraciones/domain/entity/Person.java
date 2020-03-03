package com.example.integraciones.domain.entity;

import com.example.integraciones.domain.entity.base.BaseEntity;
import com.example.integraciones.domain.entity.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.sql.Date;

/**
 * The type Person.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity {


    @Schema(description = "Type Id", example = "CC")
    @Enumerated(EnumType.ORDINAL)
    @Column(unique = true, nullable = false)
    private IdType idType;

    @Schema(description = "Identification", example = "123456789")
    @Column(unique = true, nullable = false)
    private Long identification;

    @Schema(description = "Name", example = "Nestor")
    @Column(unique = true, nullable = false)
    private String name;

    @Schema(description = "lastName", example = "Villar")
    @Column(unique = true, nullable = false)
    private String lastname;

    @Schema(description = "Date", example = "2019/05/10")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    @Column(unique = true, nullable = false)
    private Date date;

}
