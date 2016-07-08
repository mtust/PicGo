package com.tustanovskyy.controller;

import com.tustanovskyy.dto.UserActionDTO;
import com.tustanovskyy.dto.UserDTO;
import com.tustanovskyy.entity.User;
import com.tustanovskyy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Tust on 08.06.2016.
 */

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/public/user/get/{email}", method = RequestMethod.GET)
    public User getUserByEmail(@PathVariable(value = "email") final String email){
        return userService.getUserByEmail(email);
    }

    @RequestMapping(value = "/public/user/create", method = RequestMethod.PUT)
    public UserActionDTO createNewUser(@RequestBody UserDTO userDTO){
        log.info("user DTO " + userDTO.toString());
        return userService.createNewUser(userDTO);
    }




}
