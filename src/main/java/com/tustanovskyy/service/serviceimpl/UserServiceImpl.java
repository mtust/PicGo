package com.tustanovskyy.service.serviceimpl;

import com.tustanovskyy.dto.UserActionDTO;
import com.tustanovskyy.dto.UserDTO;
import com.tustanovskyy.entity.User;
import com.tustanovskyy.repository.UserRepository;
import com.tustanovskyy.service.UserService;
import com.tustanovskyy.util.Role;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

/**
 * Created by Tust on 08.06.2016.
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public Optional<User> getUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    @Override
    @Transactional
    public Collection<User> getAllUsers() { return userRepository.findAll(); }

    @Override
    @Transactional
    public UserActionDTO createNewUser(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setLastName(userDTO.getLastName());
        user.setFirstName(userDTO.getFirstName());
        user.setRoles(new HashSet<>(Arrays.asList(Role.USER)));
        userRepository.save(user);
        log.info(userDTO.toString());
        return  new UserActionDTO();

    }


}
