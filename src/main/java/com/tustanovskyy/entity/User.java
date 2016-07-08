package com.tustanovskyy.entity;

import com.tustanovskyy.util.Role;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Set;

/**
 * Created by Tust on 08.06.2016.
 */
@Data
public class User{

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Set<Role> roles;

   }
