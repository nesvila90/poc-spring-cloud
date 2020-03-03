package com.example.integraciones.service.user;

import com.example.integraciones.domain.entity.UserApp;
import com.example.integraciones.domain.model.dto.UserDTO;

import java.util.List;

/**
 * The interface User service.
 */
public interface UserService {

    /**
     * Create user app.
     *
     * @param userApp the user app
     * @return the user app
     */
    UserApp create(UserDTO userApp);

    /**
     * Validate user app.
     *
     * @param username the username
     * @param password the password
     * @return the user app
     */
    UserApp validate(String username, String password);

    /**
     * Find by username user app.
     *
     * @param nickname the nickname
     * @return the user app
     */
    UserApp findByUsername(String nickname);

    /**
     * Find all user list.
     *
     * @return the list
     */
    List<UserApp> findAllUser();

    /**
     * Update user user app.
     *
     * @param person the person
     * @return the user app
     */
    UserApp updateUser(UserApp person);

    /**
     * Delete user.
     *
     * @param id the id
     */
    void deleteUser(Long id);
}
