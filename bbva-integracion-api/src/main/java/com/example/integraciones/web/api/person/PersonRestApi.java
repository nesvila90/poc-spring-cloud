package com.example.integraciones.web.api.person;

import com.example.integraciones.commons.exceptions.base.ServiceException;
import com.example.integraciones.commons.exceptions.persistence.DataCorruptedPersistenceException;
import com.example.integraciones.commons.exceptions.persistence.PortalPersistenceException;
import com.example.integraciones.domain.entity.Person;
import com.example.integraciones.domain.entity.enums.IdType;
import com.example.integraciones.service.person.PersonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * The type Person rest api.
 */
@RestController
@RequestMapping(value = "/api/person", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Employee Management System")
public class PersonRestApi {

    private final PersonService personService;

    /**
     * Instantiates a new Person rest api.
     *
     * @param personService the person service
     */
    @Autowired
    public PersonRestApi(PersonService personService) {
        this.personService = personService;
    }

    /**
     * Create response entity.
     *
     * @param person the person
     * @return the response entity
     * @throws DataCorruptedPersistenceException the data corrupted persistence exception
     * @throws PortalPersistenceException        the portal persistence exception
     */
    @Operation(description = "Update a Employee avaible")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successful registration of the employee in the repository."),
            @ApiResponse(responseCode = "400", description = "The resource that you were trying to registry is already exist.")
    })
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> create(@RequestBody Person person) throws DataCorruptedPersistenceException, PortalPersistenceException {
        return new ResponseEntity<>(personService.create(person), HttpStatus.CREATED);
    }

    /**
     * Find response entity.
     *
     * @param id   the id
     * @param type the type
     * @return the response entity
     * @throws ServiceException the service exception
     */
    @Operation(description = "Update a Employee avaible")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successful registration of the employee in the repository."),
            @ApiResponse(responseCode = "400", description = "The resource that you were trying to registry is already exist.")
    })

    @GetMapping(value = "/type/{type}/id/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> find(@PathVariable("id") Long id, @PathVariable("type") String type) throws ServiceException {

        return new ResponseEntity<>(personService.findByIdAndTypeId(id, IdType.findIdTypeByType(type)), HttpStatus.OK);
    }

    /**
     * Update response entity.
     *
     * @param person the person
     * @return the response entity
     */
    @Operation(description = "Update a Employee avaible")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successful registration of the employee in the repository."),
            @ApiResponse(responseCode = "400", description = "The resource that you were trying to registry is already exist.")
    })

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> update(@RequestBody Person person) {
        return new ResponseEntity<>(personService.update(person), HttpStatus.OK);
    }


    /**
     * Find all response entity.
     *
     * @return the response entity
     */
    @Operation(description = "Update a Employee avaible")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successful registration of the employee in the repository."),
            @ApiResponse(responseCode = "400", description = "The resource that you were trying to registry is already exist.")
    })

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Person>> findAll() {
        return new ResponseEntity<>(personService.findAll(), HttpStatus.OK);
    }

    /**
     * Delete response entity.
     *
     * @param id   the id
     * @param type the type
     * @return the response entity
     * @throws ServiceException the service exception
     */
    @Operation(description = "Update a Employee avaible")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successful registration of the employee in the repository."),
            @ApiResponse(responseCode = "400", description = "The resource that you were trying to registry is already exist.")
    })
    @DeleteMapping(value = "/type/{type}/id/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> delete(@PathVariable("id") Long id, @PathVariable("type") String type) throws ServiceException {
        personService.delete(id, IdType.findIdTypeByType(type));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
