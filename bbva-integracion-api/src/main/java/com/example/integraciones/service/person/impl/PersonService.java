package com.example.integraciones.service.person.impl;

import com.example.integraciones.commons.exceptions.persistence.DataCorruptedPersistenceException;
import com.example.integraciones.commons.exceptions.persistence.PortalPersistenceException;
import com.example.integraciones.domain.entity.Person;
import com.example.integraciones.domain.entity.enums.IdType;

import java.util.List;

/**
 * The interface Person service.
 */
public interface PersonService {
    /**
     * Create person.
     *
     * @param person the person
     * @return the person
     * @throws DataCorruptedPersistenceException the data corrupted persistence exception
     * @throws PortalPersistenceException        the portal persistence exception
     */
    Person create(Person person) throws DataCorruptedPersistenceException, PortalPersistenceException;

    /**
     * Find by id and type id person.
     *
     * @param id     the id
     * @param typeId the type id
     * @return the person
     */
    Person findByIdAndTypeId(Long id, IdType typeId);


    /**
     * Find all list.
     *
     * @return the list
     */
    List<Person> findAll();


    /**
     * Update person.
     *
     * @param person the person
     * @return the person
     */
    Person update(Person person);


    /**
     * Delete.
     *
     * @param id     the id
     * @param typeId the type id
     */
    void delete(Long id, IdType typeId);

}
