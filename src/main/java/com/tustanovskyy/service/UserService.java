package com.tustanovskyy.service;

import com.tustanovskyy.dto.UserActionDTO;
import com.tustanovskyy.dto.UserDTO;
import com.tustanovskyy.entity.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by Tust on 08.06.2016.
 */
@Service
public interface UserService {

    public Optional<User> getUserByEmail(String email);

    public Collection<User> getAllUsers();


    public UserActionDTO createNewUser(UserDTO userDTO);


}
